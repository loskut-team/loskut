package com.loskut.service.interfaces;

import com.loskut.model.Cloth;
import com.loskut.service.filters.ClothFilter;
import com.loskut.util.EntityPage;

/**
 * Created by RAYANT on 17.01.2016.
 */
public interface ClothService extends GenericService<Integer, Cloth> {
    EntityPage<Cloth> listAllWithFilter(ClothFilter clothFilter);
}
