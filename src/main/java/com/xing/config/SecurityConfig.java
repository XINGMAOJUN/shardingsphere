package com.xing.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * 安全配置类
 */
@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {

        //Spring 配置的 H2 控制台 frameOptions 导致无法访问
        // https://zhuanlan.zhihu.com/p/267950218
        http.headers().frameOptions().sameOrigin();
        //禁用csrf校验
        //用来关闭端点的安全校验
        http.csrf().disable();
    }
}
