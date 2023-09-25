package com.example.hibernate2.dao;

import com.example.hibernate2.Inventory;
import org.hibernate.SessionFactory;

public class InventoryDAO extends GenericDAO<Inventory>{
    public InventoryDAO(SessionFactory sessionFactory) {
        super(Inventory.class, sessionFactory);
    }
}
