package com.videonet.filter;

import com.videonet.comm.GrantedAuthorityImpl;
import com.videonet.util.JwtUtil;
import io.jsonwebtoken.Jwts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.web.authentication.www.BasicAuthenticationFilter;
import org.springframework.stereotype.Component;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.*;

/**
 * token的校验
 * 该类继承自BasicAuthenticationFilter，在doFilterInternal方法中，
 * 从http头的Authorization 项读取token数据，然后用Jwts包提供的方法校验token的合法性。
 * 如果校验通过，就认为这是一个取得授权的合法请求
 * @author zhaoxinguo on 2017/9/13.
 */

@Component
public class JwTAuthenticationFilter extends BasicAuthenticationFilter {

   @Autowired
   private JwtUtil jwTautil;

   @Autowired
   private UserDetailsService userDetailsService;

    public JwTAuthenticationFilter(AuthenticationManager authenticationManager) {
        super(authenticationManager);
    }


    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain chain) throws IOException, ServletException {
        String header = request.getHeader(jwTautil.getJwtHeader());

        if (header == null || !header.startsWith(jwTautil.getTokenHead())) {
            chain.doFilter(request, response);
            return;
        }

        UsernamePasswordAuthenticationToken authentication = getAuthentication(request,response);

        SecurityContextHolder.getContext().setAuthentication(authentication);
        chain.doFilter(request, response);

    }

    private UsernamePasswordAuthenticationToken getAuthentication(HttpServletRequest request,HttpServletResponse response) {
        String token = request.getHeader(jwTautil.getJwtHeader());
        if (token != null) {
            // parse the token.
            //String parseToken = token.replace(tokenHead, "");
            try {

                String user = Jwts.parser()
                        .setSigningKey(jwTautil.getSecret())
                        .parseClaimsJws(token.replace(jwTautil.getTokenHead(), ""))
                        .getBody()
                        .getSubject();

                UserDetails userDetails = userDetailsService.loadUserByUsername(user);
                if (user != null) {
                   Collection<GrantedAuthorityImpl> authorityList = (Collection<GrantedAuthorityImpl>) userDetails.getAuthorities();
                   List<String> authUrls = new ArrayList<>();
                   for(GrantedAuthorityImpl gran : authorityList){
                       authUrls.add(gran.getAuthority());
                   }
                   if(!authUrls.contains(request.getServletPath()))
                       throw new BadCredentialsException("无访问"+request.getServletPath()+" 的权限");
                    return new UsernamePasswordAuthenticationToken(userDetails, null, userDetails.getAuthorities());
                }else{
                    throw new BadCredentialsException("用户不存在");
                }
            }catch (Exception e){
                e.printStackTrace();
                throw  e;
                // return null;
            }
        }
        return null;
    }

}
