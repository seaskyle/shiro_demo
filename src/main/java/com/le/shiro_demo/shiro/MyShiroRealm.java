package com.le.shiro_demo.shiro;

import com.le.shiro_demo.model.User;
import com.le.shiro_demo.service.UserService;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

public class MyShiroRealm extends AuthorizingRealm {
    @Autowired
    UserService userService;
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {

        return null;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        Object principal1 = authenticationToken.getPrincipal();
        if (principal1 == null) {
            throw new AuthenticationException("认证失败！");
        }
        String principal = principal1.toString();
        User tokenUser = userService.getUserByName(principal);
        if (tokenUser != null) {
            return new SimpleAuthenticationInfo(tokenUser.getName(), tokenUser.getPassword(), getName());
        }
        return null;
    }
}
