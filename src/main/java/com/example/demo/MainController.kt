package com.example.demo

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping

@Controller
class MainController {

    val index: String
        @RequestMapping(value = "/")
        get() = "./index"

}
