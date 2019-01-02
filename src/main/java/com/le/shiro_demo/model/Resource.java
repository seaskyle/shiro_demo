package com.le.shiro_demo.model;

import com.le.shiro_demo.utils.ResourceType;

import java.util.List;

public class Resource {
    private Integer resourceId;
    private String resourceName;
    private ResourceType type;
    private String url;
    private List<Permission> permissions;
    public Integer getResourceId() {
        return resourceId;
    }

    public void setResourceId(Integer resourceId) {
        this.resourceId = resourceId;
    }

    public String getResourceName() {
        return resourceName;
    }

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    public ResourceType getType() {
        return type;
    }

    public void setType(ResourceType type) {
        this.type = type;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
