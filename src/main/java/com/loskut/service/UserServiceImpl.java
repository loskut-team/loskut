package com.loskut.service;

import com.loskut.dao.interfaces.UserDao;
import com.loskut.model.User;
import com.loskut.service.interfaces.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by RAYANT on 12.01.2016.
 */

@Service("userService")
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao dao;

    @Override
    public User findById(Integer id) {
        return dao.findById(id);
    }

    @Override
    public void save(User user) {
        dao.save(user);
    }

    @Override
    public void update(User user) {
        dao.update(user);
    }

    @Override
    public void delete(User user) {
        dao.delete(user);
    }

    @Override
    public List<User> listAll() {
        return dao.listAll();
    }

    @Override
    public User findUserByLogin(String login) {
        return dao.findUserByLogin(login);
    }
}
