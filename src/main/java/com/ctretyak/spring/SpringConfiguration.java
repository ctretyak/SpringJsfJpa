package com.ctretyak.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 * Created by ctretyak on 12.03.2016.
 */
@Configuration
public class SpringConfiguration {

    @Bean(name = "helloSpring")
    @Scope("prototype")
    public HelloSpring getHelloSpring() {
        return new HelloSpring();
    }

    @Bean
    public CStartEventHandler cStartEventHandler() {
        return new CStartEventHandler();
    }
}
