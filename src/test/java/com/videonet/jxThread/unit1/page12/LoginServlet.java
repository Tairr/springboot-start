package com.videonet.jxThread.unit1.page12;

/**
 * @author tangjinhui
 * @date 2017/11/29
 */
public class LoginServlet {

    private static String usernameSef;
    private static String passwordSef;

    public static void doPost(String username,String password){
        try {
            usernameSef = username;
            if(username.equals("a"))
                Thread.sleep(5000);
            passwordSef = password;
            System.out.println("username = "+usernameSef+", password = "+passwordSef);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
