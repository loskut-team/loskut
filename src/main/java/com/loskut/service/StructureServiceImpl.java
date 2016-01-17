package com.loskut.service;

import com.loskut.dao.interfaces.StructureDao;
import com.loskut.model.Structure;
import com.loskut.service.interfaces.StructureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by RAYANT on 17.01.2016.
 */

@Service
@Transactional
public class StructureServiceImpl implements StructureService {

    @Autowired
    private StructureDao dao;

    @Override
    public Structure findById(Integer id) {
        return dao.findById(id);
    }

    @Override
    public void save(Structure entity) {
        dao.save(entity);
    }

    @Override
    public void delete(Structure entity) {
        dao.delete(entity);
    }

    @Override
    public List<Structure> listAll() {
        return dao.listAll();
    }
}
