package com.loskut.service;

import com.loskut.dao.interfaces.FeatureDao;
import com.loskut.model.Feature;
import com.loskut.service.interfaces.FeatureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by RAYANT on 17.01.2016.
 */

@Service
@Transactional
public class FeatureServiceImpl implements FeatureService {

    @Autowired
    private FeatureDao dao;

    @Override
    public Feature findById(Integer id) {
        return dao.findById(id);
    }

    @Override
    public void save(Feature entity) {
        dao.save(entity);
    }

    @Override
    public void update(Feature entity){dao.update(entity);}

    @Override
    public void delete(Feature entity) {
        dao.delete(entity);
    }

    @Override
    public List<Feature> listAll() {
        return dao.listAll();
    }
}
