package com.loskut.dao;

import com.loskut.dao.interfaces.ClothTypeDao;
import com.loskut.model.ClothType;
import org.springframework.stereotype.Repository;

/**
 * Created by RAYANT on 17.01.2016.
 */

@Repository
public class ClothTypeDaoImpl extends AbstractDao<Integer,ClothType> implements ClothTypeDao {

}
