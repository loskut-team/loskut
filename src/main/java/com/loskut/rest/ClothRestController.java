package com.loskut.rest;

import com.loskut.model.Cloth;
import com.loskut.service.ClothServiceImpl;
import com.loskut.service.filters.ClothFilter;
import com.loskut.service.interfaces.ClothService;
import com.loskut.util.EntityPage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Optical Illusion on 19.01.2016.
 */

@Controller
public class ClothRestController {



    @Autowired
    private ClothService clothService;

    @RequestMapping(value = "/cloth/read/all", method = RequestMethod.POST,
            consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<EntityPage<Cloth>> listAllProfiles(@RequestBody ClothFilter clothFilter) {
        EntityPage<Cloth> clothEntityPage = clothService.listAllWithFilter(clothFilter);
        if (clothEntityPage.getEntities().isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(clothEntityPage, HttpStatus.OK);
    }

}