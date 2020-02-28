package org.bzyw.train.service;

import org.bzyw.train.model.DBMetaData;
import org.bzyw.train.repository.DBMetaDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class MetaDataService {

    @Autowired
    DBMetaDataRepository repository;

    @Transactional
    public void save(DBMetaData metaData) {
        repository.save(metaData);
    }

    public Iterable<DBMetaData> query() {
        return repository.findAll();
    }
}
