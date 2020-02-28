package org.bzyw.train.controller;

import org.bzyw.train.model.DBMetaData;
import org.bzyw.train.service.MetaDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/mata/database")
public class DBMetaDataController {

    @Autowired
    MetaDataService service;

    @RequestMapping(method = RequestMethod.POST)
    public String save(@ModelAttribute DBMetaData metaData) {
        service.save(metaData);
        return "SUCCESS";
    }
}
