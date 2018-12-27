package com.le.shiro_demo.shiro;

import org.apache.shiro.authz.Permission;
import org.apache.shiro.authz.permission.PermissionResolver;
import org.apache.shiro.util.AntPathMatcher;

public class MyPermissonReovlver implements PermissionResolver {
    @Override
    public Permission resolvePermission(String permission) {

        return new MyPermisson(permission);
    }

    private class MyPermisson implements Permission{
        private String permissonStr;

        public MyPermisson(String permissonStr) {
            this.permissonStr = permissonStr;
        }

        public String getPermissonStr() {
            return permissonStr;
        }

        public void setPermissonStr(String permissonStr) {
            this.permissonStr = permissonStr;
        }

        @Override
        public boolean implies(Permission permission) {
            if (!getClass().isInstance(permission)) {
                return false;
            }
            MyPermisson myp = (MyPermisson) permission;
            String need = myp.getPermissonStr();
            String own = getPermissonStr();
            if (need.equals(own)) {
                return true;
            }
            AntPathMatcher pathMatcher = new AntPathMatcher();
            if (pathMatcher.match(need, own) || pathMatcher.match(own, need)) {
                return true;
            }
            return false;
        }
    }
}
