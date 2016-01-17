package com.loskut.service;

import com.loskut.dao.interfaces.ClothTypeDao;
import com.loskut.model.ClothType;
import com.loskut.service.interfaces.ClothTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by RAYANT on 17.01.2016.
 */

@Service
@Transactional
public class ClothTypeServiceImpl implements ClothTypeService {

    @Autowired
    private ClothTypeDao dao;

    @Override
    public ClothType findById(Integer id) {
        return dao.findById(id);
    }

    @Override
    public void save(ClothType entity) {
        dao.save(entity);
    }

    @Override
    public void delete(ClothType entity) {
        dao.delete(entity);
    }

    @Override
    public List<ClothType> listAll() {
        return dao.listAll();
    }
}


