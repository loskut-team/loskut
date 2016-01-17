package com.loskut.service;

import com.loskut.dao.interfaces.ColorDao;
import com.loskut.model.Color;
import com.loskut.service.interfaces.ColorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by RAYANT on 17.01.2016.
 */

@Service
@Transactional
public class ColorServiceImpl implements ColorService {

    @Autowired
    private ColorDao dao;

    @Override
    public Color findById(Integer id) {
        return dao.findById(id);
    }

    @Override
    public void save(Color entity) {
        dao.save(entity);
    }

    @Override
    public void delete(Color entity) {
        dao.delete(entity);
    }

    @Override
    public List<Color> listAll() {
        return dao.listAll();
    }
}
