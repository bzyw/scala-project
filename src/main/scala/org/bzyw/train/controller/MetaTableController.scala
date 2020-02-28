package org.bzyw.train.controller

import org.bzyw.train.model.MetaTable
import org.bzyw.train.service.MetaTableService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.{RequestMapping, RequestMethod, RestController}

@RestController
@RequestMapping(Array("/mata/table"))
class MetaTableController {

  @Autowired
  var service: MetaTableService = _;

  @RequestMapping(method = Array(RequestMethod.POST))
  def save(metaTable: MetaTable): String = {
    service.save(metaTable);
    "SUCCESS";
  }
}
