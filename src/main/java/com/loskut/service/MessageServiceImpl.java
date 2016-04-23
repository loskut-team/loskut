package com.loskut.service;

import com.loskut.dao.interfaces.MessageDao;
import com.loskut.model.Message;
import com.loskut.service.interfaces.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by RAYANT on 17.01.2016.
 */

@Service
@Transactional
public class MessageServiceImpl implements MessageService {

    @Autowired
    private MessageDao dao;

    @Override
    public Message findById(Integer id) {
        return dao.findById(id);
    }

    @Override
    public void save(Message entity) {
        dao.save(entity);
    }

    @Override
    public void update(Message entity) {
        dao.update(entity);
    }

    @Override
    public void delete(Message entity) {
        dao.delete(entity);
    }

    @Override
    public List<Message> listAll() {
        return dao.listAll();
    }
}

