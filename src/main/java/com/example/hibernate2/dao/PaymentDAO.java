package com.example.hibernate2.dao;

import com.example.hibernate2.Payment;
import org.hibernate.SessionFactory;

public class PaymentDAO extends GenericDAO<Payment>{
    public PaymentDAO(SessionFactory sessionFactory) {
        super(Payment.class, sessionFactory);
    }
}
