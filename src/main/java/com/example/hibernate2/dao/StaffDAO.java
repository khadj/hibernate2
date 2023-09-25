package com.example.hibernate2.dao;

import com.example.hibernate2.Staff;
import org.hibernate.SessionFactory;

public class StaffDAO extends GenericDAO<Staff>{
    public StaffDAO(SessionFactory sessionFactory) {
        super(Staff.class, sessionFactory);
    }
}
