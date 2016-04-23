package com.loskut.service;

import com.loskut.dao.interfaces.PaymentDao;
import com.loskut.model.Payment;
import com.loskut.service.interfaces.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by RAYANT on 17.01.2016.
 */

@Service
@Transactional
public class PaymentServiceImpl implements PaymentService {

    @Autowired
    private PaymentDao dao;

    @Override
    public Payment findById(Integer id) {
        return dao.findById(id);
    }

    @Override
    public void save(Payment entity) {
        dao.save(entity);
    }

    @Override
    public void update(Payment entity) {
        dao.update(entity);
    }

    @Override
    public void delete(Payment entity) {
        dao.delete(entity);
    }

    @Override
    public List<Payment> listAll() {
        return dao.listAll();
    }
}
