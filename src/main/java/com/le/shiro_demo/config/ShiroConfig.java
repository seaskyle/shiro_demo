package com.le.shiro_demo.config;

import com.le.shiro_demo.shiro.MyPermissionFilter;
import com.le.shiro_demo.shiro.MyPermissonReovlver;
import com.le.shiro_demo.shiro.MyShiroRealm;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.Filter;
import java.util.HashMap;
import java.util.Map;

@Configuration
public class ShiroConfig {
    @Bean
    public MyShiroRealm myShiroRealm() {
        MyShiroRealm realm = new MyShiroRealm();
        realm.setPermissionResolver(new MyPermissonReovlver());
        return realm;
    }

    @Bean
    public DefaultWebSecurityManager defaultWebSecurityManager() {
        DefaultWebSecurityManager securityManager = new DefaultWebSecurityManager();
        securityManager.setRealm(myShiroRealm());
        return securityManager;
    }

    @Bean
    public ShiroFilterFactoryBean shiroFilterFactoryBean() {
        ShiroFilterFactoryBean factoryBean = new ShiroFilterFactoryBean();
        factoryBean.setLoginUrl("/html/login");
        factoryBean.setSecurityManager(defaultWebSecurityManager());
        HashMap<String, Filter> filters = new HashMap<>();
        filters.put("MyPermissionFilter", new MyPermissionFilter());
        factoryBean.setFilters(filters);
        Map<String, String> definitionMap = new HashMap<>();
        definitionMap.put("/bootstrap/**", "anon");
        definitionMap.put("/doLogin", "anon");
        definitionMap.put("/**", "authc");
        factoryBean.setFilterChainDefinitionMap(definitionMap);
        return factoryBean;
    }
}
