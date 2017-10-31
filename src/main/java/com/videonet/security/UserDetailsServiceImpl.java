package com.videonet.security;

import com.videonet.dao.ISysAccountDao;
import com.videonet.dao.ISysResourceDao;
import com.videonet.domain.SysAccount;
import com.videonet.domain.SysResource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhaoxinguo on 2017/9/13.
 */
@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private ISysAccountDao accountDao;
    @Autowired
    private ISysResourceDao sysResourceDao;

    // 通过构造器注入MyUserRepository
    public UserDetailsServiceImpl(ISysAccountDao accountDao) {
        this.accountDao = accountDao;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        SysAccount myUser = accountDao.findByUsername(username);
        if(myUser == null){
            throw new UsernameNotFoundException(username);
        }
        //获取权限...
        List<SysResource> resourceList = sysResourceDao.getAccountAuthorities(username);
        // 这里设置权限和角色
        ArrayList<GrantedAuthority> authorities = new ArrayList<>();
        for(SysResource resource : resourceList){
            authorities.add(new GrantedAuthorityImpl(resource.getUrl()) );
        }
//        authorities.add( new GrantedAuthorityImpl("ROLE_ADMIN") );
//        authorities.add( new GrantedAuthorityImpl("AUTH_WRITE") );

        return new org.springframework.security.core.userdetails.User(myUser.getUsername(), myUser.getPassword(), authorities);
    }

}
