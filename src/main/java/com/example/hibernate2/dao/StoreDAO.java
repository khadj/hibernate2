package com.example.hibernate2.dao;

import com.example.hibernate2.Store;
import org.hibernate.SessionFactory;

public class StoreDAO extends GenericDAO<Store>{
    public StoreDAO(SessionFactory sessionFactory) {
        super(Store.class, sessionFactory);
    }
}
