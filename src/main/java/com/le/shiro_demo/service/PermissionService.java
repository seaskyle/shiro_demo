package com.le.shiro_demo.service;

import com.le.shiro_demo.dao.PermissionMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class PermissionService {
    @Autowired
    PermissionMapper permissionMapper;
    public Set<String> getPermissionByName(String userName) {
        List<String> permissions = permissionMapper.getPermissionByName(userName);
        return new HashSet<>(permissions);
    }
}
