package com.loskut.service;

import com.loskut.dao.interfaces.ClothDao;
import com.loskut.model.Cloth;
import com.loskut.service.filters.ClothFilter;
import com.loskut.service.interfaces.ClothService;
import com.loskut.util.EntityPage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by RAYANT on 17.01.2016.
 */

@Service
@Transactional
public class ClothServiceImpl implements ClothService {

    @Autowired
    private ClothDao dao;

    @Override
    public Cloth findById(Integer id) {
        return dao.findById(id);
    }

    @Override
    public void save(Cloth entity) {
        dao.save(entity);
    }

    @Override
    public void update(Cloth entity){dao.update(entity);}

    @Override
    public void delete(Cloth entity) {
        dao.delete(entity);
    }

    @Override
    public List<Cloth> listAll() {
        return dao.listAll();
    }

    @Override
    public EntityPage<Cloth> listAllWithFilter(ClothFilter clothFilter) {
        return dao.listAllWithFilter(clothFilter);
    }
}
