package com.loskut.dao;

import com.loskut.dao.interfaces.ColorDao;
import com.loskut.model.Color;
import org.springframework.stereotype.Repository;

/**
 * Created by RAYANT on 17.01.2016.
 */

@Repository
public class ColorDaoImpl extends AbstractDao<Integer, Color> implements ColorDao {
}
