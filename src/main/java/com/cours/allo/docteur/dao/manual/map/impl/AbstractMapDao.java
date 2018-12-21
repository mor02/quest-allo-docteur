/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cours.allo.docteur.dao.manual.map.impl;

import com.cours.allo.docteur.dao.IDao;
import java.util.List;
import java.util.Map;

/**
 *
 * @author ElHadji
 * @param <T>
 */
public abstract class AbstractMapDao<T> implements IDao<T> {

    private Map<Integer, T> myMap = null;
    private Class<T> myClass = null;

    public AbstractMapDao(Class<T> myClass, Map<Integer, T> myMap) {
        this.myClass = myClass;
        this.myMap = myMap;
    }

    @Override
    public List<T> findAll() {
        return null;
    }

    @Override
    public T findById(int id) {
        return null;
    }

    @Override
    public List<T> findByCriteria(String criteria, Object valueCriteria) {
        return null;
    }

    @Override
    public T create(T t) {
        return null;
    }

    @Override
    public T update(T t) {
        return null;
    }

    @Override
    public boolean delete(T t) {
        return false;
    }
}
