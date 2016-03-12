package com.ctretyak.hibernate;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Created by ctretyak on 12.03.2016.
 */
public class ManageMessages {
    private static SessionFactory sessionFactory;

    public static void init() {
        sessionFactory = new Configuration().configure().buildSessionFactory();
        ManageMessages manageMessages = new ManageMessages();
        Integer msg1 = manageMessages.addEmployee("Zara");
        Integer msg2 = manageMessages.addEmployee("Daisy");
        Integer msg3 = manageMessages.addEmployee("John");
        manageMessages.updateMessage(msg1, msg2);
    }

    private Integer addEmployee(String text) {
        Transaction tx = null;
        Integer employeeId = null;
        try (Session session = sessionFactory.openSession()) {
            try {
                tx = session.beginTransaction();
                Message message = new Message(text);
                employeeId = (Integer) session.save(message);
                tx.commit();
            } catch (HibernateException e) {
                if (tx != null) tx.rollback();
                e.printStackTrace();
            }
        }

        return employeeId;
    }

    private void updateMessage(Integer messageId, Integer nextMessageId) {
        try (Session session = sessionFactory.openSession()) {
            Transaction tx = session.beginTransaction();
            Message message = session.load(Message.class, messageId);
            message.setText(message.getText() + " UPDATED 1");
            Message message2 = session.load(Message.class, nextMessageId);
            Message message3 = new Message("Its three!");

            message.setNextMessage(message2);
            message2.setNextMessage(message3);
            message3.setNextMessage(message);

            tx.commit();
        }
    }
}
