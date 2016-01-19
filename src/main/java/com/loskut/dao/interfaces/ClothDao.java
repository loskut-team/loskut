package com.loskut.dao.interfaces;

import com.loskut.model.Cloth;
import com.loskut.service.filters.ClothFilter;
import com.loskut.util.EntityPage;

/**
 * Created by RAYANT on 16.01.2016.
 */
public interface ClothDao extends GenericDao<Integer,Cloth> {
    EntityPage<Cloth> listAllWithFilter(ClothFilter clothFilter);
}
