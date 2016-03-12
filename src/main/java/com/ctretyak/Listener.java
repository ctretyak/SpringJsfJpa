package com.ctretyak;

import com.ctretyak.hibernate.ManageMessages;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import java.util.Locale;

/**
 * Created by ctretyak on 12.03.2016.
 */
public class Listener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        Locale.setDefault(Locale.ENGLISH);
        System.out.println("HWLLO");
        ManageMessages.init();
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {

    }
}
