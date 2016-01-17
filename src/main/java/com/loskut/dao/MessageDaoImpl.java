package com.loskut.dao;

import com.loskut.dao.interfaces.MessageDao;
import com.loskut.model.Message;
import org.springframework.stereotype.Repository;

/**
 * Created by RAYANT on 17.01.2016.
 */

@Repository
public class MessageDaoImpl extends AbstractDao<Integer, Message> implements MessageDao {
}
