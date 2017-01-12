package com.pratamawijaya.rest.bookswarehouse.controller

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

/**
 * Created by pratama on 1/12/17.
 */
@RestController
class HomeController {

  @RequestMapping(value = "/")
  fun home() = "Home Rest"
}