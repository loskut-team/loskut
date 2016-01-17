package com.loskut.service;

import com.loskut.dao.interfaces.OrderDao;
import com.loskut.model.Order;
import com.loskut.service.interfaces.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by RAYANT on 17.01.2016.
 */

@Service
@Transactional
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderDao dao;

    @Override
    public Order findById(Integer id) {
        return dao.findById(id);
    }

    @Override
    public void save(Order entity) {
        dao.save(entity);
    }

    @Override
    public void delete(Order entity) {
        dao.delete(entity);
    }

    @Override
    public List<Order> listAll() {
        return dao.listAll();
    }
}

