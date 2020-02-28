package org.bzyw.train.controller

import org.springframework.web.bind.annotation.{RequestMapping, RequestMethod, RestController}

@RestController
class ScalaMainController {

  @RequestMapping(path = Array("/scalaHello"), method = Array(RequestMethod.GET))
  def hello() = {
    "Hello,World! --from scala."
  }
}
