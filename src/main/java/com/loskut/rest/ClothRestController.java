package com.loskut.rest;

import com.loskut.dao.interfaces.ClothDao;
import com.loskut.model.Cloth;
import com.loskut.service.filters.ClothFilter;
import com.loskut.util.EntityPage;
import org.hibernate.Hibernate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by Optical Illusion on 19.01.2016.
 */

@RestController
@RequestMapping("/cloth")
public class ClothRestController {

    @Autowired
    private ClothDao clothDao;

    @RequestMapping(value = "/read/filtered", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<EntityPage<Cloth>> listFiltered(@RequestBody ClothFilter clothFilter) {
        System.out.println("/cloth/read/filtered");
        EntityPage<Cloth> clothEntityPage = clothDao.listAllWithFilter(clothFilter);
        if (clothEntityPage.getEntities().isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(clothEntityPage, HttpStatus.OK);
    }

    @Transactional
    @RequestMapping(value = "/read/all", method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<EntityPage<Cloth>> listAll() {
        System.out.println("/cloth/read/all");
        EntityPage<Cloth> clothEntityPage = new EntityPage<>();
        List<Cloth> cloths = clothDao.listAll();
        Hibernate.initialize(cloths);
        clothEntityPage.setEntities(cloths);
        clothEntityPage.setTotalEntities((long) cloths.size());
        System.out.println("result: " + clothEntityPage);
        if (clothEntityPage.getEntities().isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(clothEntityPage, HttpStatus.OK);
    }


    @RequestMapping(value = "/update", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Void> updateCloth(@RequestBody Cloth cloth) {


        clothDao.update(cloth);

        return new ResponseEntity<>(HttpStatus.OK);
    }

}
