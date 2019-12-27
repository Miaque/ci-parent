package com.demo.ci.web.controller;

import com.demo.ci.common.R;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @RequestMapping("/index")
    public R index() {
        return R.ok("hello world");
    }

}
