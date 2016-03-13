package com.ctretyak.spring;

import org.springframework.beans.factory.InitializingBean;

/**
 * Created by ctretyak on 12.03.2016.
 */
public class HelloSpring implements InitializingBean{
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = "Say HI to spring and " + message;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Initialized");
    }
}
