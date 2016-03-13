package com.ctretyak.faces.beans;

import javax.faces.bean.ManagedBean;

/**
 * Created by ctretyak on 13.03.2016.
 */
@ManagedBean(name = "message", eager = true)
public class Message {
	private String message = "Hello World!";

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
