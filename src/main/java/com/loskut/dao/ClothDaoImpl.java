package com.loskut.dao;

import com.loskut.dao.interfaces.ClothDao;
import com.loskut.model.Cloth;
import org.springframework.stereotype.Repository;

/**
 * Created by RAYANT on 17.01.2016.
 */

@Repository
public class ClothDaoImpl extends AbstractDao<Integer, Cloth> implements ClothDao {

}
