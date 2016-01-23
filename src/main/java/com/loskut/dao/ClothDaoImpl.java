package com.loskut.dao;

import com.loskut.dao.interfaces.ClothDao;
import com.loskut.model.Cloth;
import com.loskut.service.filters.ClothFilter;
import com.loskut.util.EntityPage;
import org.hibernate.Criteria;
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
        Criteria criteria = createCriteriaForClothFilter(clothFilter);
        criteria.setFirstResult(clothFilter.getFirstResult());
        criteria.setMaxResults(clothFilter.getMaxResults());
        List<Cloth> result = (List<Cloth>) criteria.list();
        EntityPage<Cloth> entityPage = new EntityPage<>();
        entityPage.setTotalEntities(count(clothFilter));
        entityPage.setEntities(result);
        return entityPage;
    }

    private Long count(ClothFilter clothFilter){
        Criteria criteria = createCriteriaForClothFilter(clothFilter);
        Number count = (Number) criteria.setProjection(Projections.rowCount()).uniqueResult();
        return (Long)count;
    }

    private Criteria createCriteriaForClothFilter(ClothFilter clothFilter){
        Criteria criteria = createEntityCriteria();
        if (clothFilter.getPricePerMeterMin()!=null) criteria.add(Restrictions.gt("pricePerMeter",clothFilter.getPricePerMeterMin()));
        if (clothFilter.getPricePerMeterMax()!=null) criteria.add(Restrictions.lt("pricePerMeter", clothFilter.getPricePerMeterMax()));
        if (clothFilter.getTotalPriceMin()!= null) criteria.add(Restrictions.gt("totalPrice", clothFilter.getTotalPriceMin()));
        if (clothFilter.getTotalPriceMax()!= null) criteria.add(Restrictions.lt("totalPrice", clothFilter.getTotalPriceMax()));
        return criteria;
    }




}
