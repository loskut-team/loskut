package com.loskut.service.interfaces;

import com.loskut.model.User;

import java.util.List;

/**
 * Created by RAYANT on 16.01.2016.
 */
public interface GenericService<T> {

    T findById(int id);

    void save(T entity);

    void delete(T entity);

    List<User> listAll();

}
