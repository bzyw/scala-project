package org.bzyw.train.service

import org.bzyw.train.model.MetaTable
import org.bzyw.train.repository.MetaTableRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class MetaTableService {

  @Autowired
  var repository: MetaTableRepository = _;

  def save(metaData: MetaTable) = {
    repository.save(metaData);
  }
}
