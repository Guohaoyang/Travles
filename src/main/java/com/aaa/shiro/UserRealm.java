package com.aaa.shiro;


import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;

import com.aaa.entity.tusers;
import com.aaa.service.TuserService;

/**
 * @功能描述：TODO
 * @创建日期: 2019/2/22 18:56
 */
public class UserRealm extends AuthorizingRealm {

    @Autowired
    private TuserService userService;

    /**
     * 执行授权逻辑
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        System.out.println("执行授权逻辑");
        //给资源进行授权
        SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
        //获取当前登录用户
        Subject subject = SecurityUtils.getSubject();
        tusers user = (tusers)subject.getPrincipal();
        System.out.println(subject.getPrincipal());
        tusers dbUser=(tusers) userService.login(user.getPhone(), user.getUpwd());
       // User dbUser = userService.findById(user.getId());
       // info.addStringPermission("user:add");
        info.addStringPermission(dbUser.getPhone());
        info.addStringPermission(dbUser.getUname());
        info.addStringPermission(dbUser.getUpwd());
        return info;
    }


    /**
     * 执行认证逻辑
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        System.out.println("执行认证逻辑");

        //编写shiro判断逻辑，判断用户名和密码
        UsernamePasswordToken token  =  (UsernamePasswordToken)authenticationToken;
        System.out.println(token);
        //tusers user = userService.login(phone, upwd)(token.getUsername());

        //1、判断用户名
   //    if(user == null){
            //用户名不存在
    //        return null; //shiro底层会抛出UnKnowAccountException
     //   }

        //2、判断密码, 这里的user是principal
        return new SimpleAuthenticationInfo();
    }


}
