package com.le.shiro_demo.config;

import com.jagregory.shiro.freemarker.ShiroTags;
import freemarker.template.TemplateException;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.freemarker.FreeMarkerConfigurer;

import java.io.IOException;

@Configuration
public class FreeMarkerCfg {
    @Bean
    public FreeMarkerConfigurer freeMarkerConfigurer() throws IOException, TemplateException {
        FreeMarkerConfigurer configurer = new FreeMarkerConfigurer();
        configurer.setTemplateLoaderPath("classpath:templates/");
        freemarker.template.Configuration config = configurer.createConfiguration();
        config.setDefaultEncoding("UTF-8");
        config.setSharedVariable("shiro", new ShiroTags());
        configurer.setConfiguration(config);
        return configurer;
    }
}
