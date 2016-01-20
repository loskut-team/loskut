package com.loskut.dao;

import com.loskut.dao.interfaces.ClothDao;
import com.loskut.model.Cloth;
import com.loskut.model.User;
import com.loskut.service.filters.ClothFilter;
import com.loskut.util.EntityPage;
import org.hibernate.Criteria;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by RAYANT on 17.01.2016.
 */

@Repository
public class ClothDaoImpl extends AbstractDao<Integer, Cloth> implements ClothDao {

    @Override
    public EntityPage<Cloth> listAllWithFilter(ClothFilter clothFilter) {
        Criteria criteria = createEntityCriteria();
        criteria.setFirstResult(clothFilter.getFirstResult());
        criteria.setMaxResults(clothFilter.getMaxResults());
        criteria.add(Restrictions.between("pricePerMeter", clothFilter.getPricePerMeterMin(), clothFilter.getPricePerMeterMax()));
        criteria.add(Restrictions.between("totalPrice", clothFilter.getTotalPriceMin(), clothFilter.getTotalPriceMax()));
        List<Cloth> result = (List<Cloth>) criteria.list();
        //ToDo Fix Bug
        criteria = createEntityCriteria();
        criteria.add(Restrictions.between("pricePerMeter", clothFilter.getPricePerMeterMin(), clothFilter.getPricePerMeterMax()));
        criteria.add(Restrictions.between("totalPrice", clothFilter.getTotalPriceMin(), clothFilter.getTotalPriceMax()));
        Number count = (Number) criteria.setProjection(Projections.rowCount()).uniqueResult();
        EntityPage<Cloth> entityPage = new EntityPage<>();
        entityPage.setTotalEntities((Long)count);
        entityPage.setEntities(result);
        return entityPage;
    }
}
