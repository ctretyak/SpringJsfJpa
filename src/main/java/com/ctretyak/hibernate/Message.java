package com.ctretyak.hibernate;

import javax.persistence.*;

/**
 * Created by ctretyak on 12.03.2016.
 */
@Entity
@Table(name = "messages")
public class Message {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "message_id")
    private Integer id;

    @Column(name = "message_text")
    private String text;

    @ManyToOne
    @JoinColumn(name = "next_message_id")
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
