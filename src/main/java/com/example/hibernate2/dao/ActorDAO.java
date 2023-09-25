package com.example.hibernate2.dao;

import com.example.hibernate2.Actor;
import org.hibernate.SessionFactory;

public class ActorDAO extends GenericDAO<Actor>{
    public ActorDAO(SessionFactory sessionFactory){
        super(Actor.class, sessionFactory);
    }
}
