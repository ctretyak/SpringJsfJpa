package com.ctretyak.hibernate;

/**
 * Created by ctretyak on 12.03.2016.
 */
public class Message {
    private Integer id;
    private String text;
    private Message nextMessage;

    public Message() {
    }

    public Message(String text) {
        this.text = text;
    }

    public Integer getId() {
        return id;
    }

    private void setId(Integer id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Message getNextMessage() {
        return nextMessage;
    }

    public void setNextMessage(Message nextMessage) {
        this.nextMessage = nextMessage;
    }
}
