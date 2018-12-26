package com.le.shiro_demo.config;

import com.le.shiro_demo.shiro.MyShiroRealm;
import org.apache.shiro.authc.LogoutAware;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

@Configuration
public class ShiroConfig {
    @Bean
    public MyShiroRealm myShiroRealm() {
        return new MyShiroRealm();
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
        factoryBean.setLoginUrl("/login");
        factoryBean.setSecurityManager(defaultWebSecurityManager());
        Map<String, String> definitionMap = new HashMap<>();
        definitionMap.put("/bootstrap/**", "anon");
        definitionMap.put("/**", "authc");
        factoryBean.setFilterChainDefinitionMap(definitionMap);
        return factoryBean;
    }
}
