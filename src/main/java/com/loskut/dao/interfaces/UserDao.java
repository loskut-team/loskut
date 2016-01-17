package com.loskut.dao.interfaces;

import com.loskut.model.User;

/**
 * Created by RAYANT on 12.01.2016.
 */
public interface UserDao extends GenericDao<User> {

    User findUserByLogin(String login);
}
