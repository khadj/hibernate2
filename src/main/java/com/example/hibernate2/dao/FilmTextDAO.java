package com.example.hibernate2.dao;


import com.example.hibernate2.FilmText;
import org.hibernate.SessionFactory;

public class FilmTextDAO extends GenericDAO<FilmText>{
    public FilmTextDAO(SessionFactory sessionFactory) {
        super(FilmText.class, sessionFactory);
    }
}
