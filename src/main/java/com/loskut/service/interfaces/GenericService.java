package com.loskut.service.interfaces;

import java.io.Serializable;
import java.util.List;

/**
 * Created by RAYANT on 16.01.2016.
 */
public interface GenericService<PK extends Serializable, T> {

    T findById(PK id);

    void save(T entity);

    void update(T entity);

    void  delete(T entity);

    List<T> listAll();

}
