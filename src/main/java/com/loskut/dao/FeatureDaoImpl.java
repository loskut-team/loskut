package com.loskut.dao;

import com.loskut.dao.interfaces.FeatureDao;
import com.loskut.model.Feature;
import org.springframework.stereotype.Repository;

/**
 * Created by RAYANT on 17.01.2016.
 */

@Repository
public class FeatureDaoImpl extends AbstractDao<Integer, Feature> implements FeatureDao {
}
