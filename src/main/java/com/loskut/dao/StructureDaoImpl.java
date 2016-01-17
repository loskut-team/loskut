package com.loskut.dao;

import com.loskut.dao.interfaces.StructureDao;
import com.loskut.model.Structure;
import org.springframework.stereotype.Repository;

/**
 * Created by RAYANT on 17.01.2016.
 */

@Repository
public class StructureDaoImpl extends AbstractDao<Integer, Structure> implements StructureDao {
}
