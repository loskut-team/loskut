package com.loskut.dao;

import com.loskut.dao.interfaces.UserDao;
import com.loskut.model.User;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

/**
 * Created by RAYANT on 12.01.2016.
 */
@Repository("userDao")
public class UserDaoImpl extends AbstractDao<Integer,User> implements UserDao {

    public User findById(int id) {
        return getByKey(id);
    }

    public void save(User user) {
        persist(user);
    }

    public void delete(User user) {deleteEntity(user);}

    public User findUserByLogin(String login) {
        Criteria criteria = createEntityCriteria();
        criteria.add(Restrictions.eq("login", login));
        return (User) criteria.uniqueResult();
    }
}
