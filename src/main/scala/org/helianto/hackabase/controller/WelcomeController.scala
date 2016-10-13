package org.helianto.hackabase.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.{GetMapping, RequestMapping}

@Controller
@RequestMapping(Array("/"))
class WelcomeController {

  @GetMapping
  def home = "welcome.html" +
    ""

}
