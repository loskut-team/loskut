package com.loskut.dao;

import com.loskut.dao.interfaces.OrderDao;
import com.loskut.model.Order;
import org.springframework.stereotype.Repository;

/**
 * Created by RAYANT on 17.01.2016.
 */

@Repository
public class OrderDaoImpl extends AbstractDao<Integer, Order> implements OrderDao {
}
