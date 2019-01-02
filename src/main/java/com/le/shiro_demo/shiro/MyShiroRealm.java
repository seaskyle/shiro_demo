package com.le.shiro_demo.shiro;

import com.le.shiro_demo.model.User;
import com.le.shiro_demo.service.PermissionService;
import com.le.shiro_demo.service.UserService;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.subject.SimplePrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Set;
import java.util.zip.Inflater;

public class MyShiroRealm extends AuthorizingRealm {
    @Autowired
    UserService userService;
    @Autowired
    PermissionService permissionService;
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        User loginUser = (User) principalCollection.getPrimaryPrincipal();
        SimpleAuthorizationInfo authorizationInfo = new SimpleAuthorizationInfo();
        authorizationInfo.addRoles(loginUser.getRoles());
        return authorizationInfo;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        Object principal1 = authenticationToken.getPrincipal();
        if (principal1 == null) {
            throw new AuthenticationException("认证失败！");
        }
        String principal = principal1.toString();
        User loadUser = userService.getUserByName(principal);
        if (loadUser != null) {
            return new SimpleAuthenticationInfo(loadUser, loadUser.getPassword(), getName());
        }
        return null;
    }
}
