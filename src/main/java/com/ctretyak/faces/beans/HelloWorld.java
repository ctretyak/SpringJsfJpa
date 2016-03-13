package com.ctretyak.faces.beans;

import org.apache.log4j.Logger;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;

/**
 * Created by ctretyak on 13.03.2016.
 */
@ManagedBean(name = "helloWorld", eager = true)
public class HelloWorld {

	public static final Logger logger = Logger.getLogger(HelloWorld.class);

	@ManagedProperty(value = "#{message}")
	private Message messageBean;

	private String message;

	public HelloWorld() {
		logger.info("HelloWorld started!");
	}

	public String getMessage() {
		if (messageBean != null) {
			message = messageBean.getMessage();
		}
		return message;
	}

	public void setMessageBean(Message message) {
		this.messageBean = message;
	}
}
