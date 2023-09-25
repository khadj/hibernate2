package com.example.hibernate2.dao;

import com.example.hibernate2.Country;
import org.hibernate.SessionFactory;

public class CountryDAO extends GenericDAO<Country>{
    public CountryDAO(SessionFactory sessionFactory) {
        super(Country.class, sessionFactory);
    }
}
