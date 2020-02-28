package org.bzyw.train.repository

import org.bzyw.train.model.MetaTable
import org.springframework.data.repository.CrudRepository

trait MetaTableRepository extends CrudRepository[MetaTable, Int] {

}
