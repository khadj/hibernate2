package com.example.hibernate2.dao;

import com.example.hibernate2.Customer;
import org.hibernate.SessionFactory;

public class CustomerDAO extends GenericDAO<Customer>{
    public CustomerDAO(SessionFactory sessionFactory) {
        super(Customer.class, sessionFactory);
    }
}
