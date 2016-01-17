package com.loskut.service.interfaces;

import com.loskut.model.User;

/**
 * Created by RAYANT on 12.01.2016.
 */
public interface UserService extends GenericService<Integer, User> {

    User findUserByLogin(String login);

}
