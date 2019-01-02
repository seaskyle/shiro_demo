package com.le.shiro_demo.dao;

import java.util.List;

public interface PermissionMapper {
    List<String> getPermissionByName(String userName);
}
