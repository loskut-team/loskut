package com.loskut.dao;

import com.loskut.dao.interfaces.PaymentDao;
import com.loskut.model.Payment;
import org.springframework.stereotype.Repository;

/**
 * Created by RAYANT on 17.01.2016.
 */

@Repository
public class PaymentDaoImpl extends AbstractDao<Integer, Payment> implements PaymentDao {
}
