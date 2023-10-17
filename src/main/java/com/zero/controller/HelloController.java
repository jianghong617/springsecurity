package com.zero.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * {@code HelloController}
 *
 * @author jianghong
 * @date 2023/10/16
 * @since 2.2.1
 */
@RestController
public class HelloController {

    @GetMapping(value = "/hello")
    public String getHello() {
        return "get hello security";
    }

    @PostMapping(value = "/hello")
    public String postHello() {
        return "post hello security";
    }

    @GetMapping(value = "/index")
    public String index() {
        return "我是首页666";
    }

    @GetMapping("/f1")
    public String f1() {
        return "f1";
    }

    @PostMapping("/f2")
    public String f2() {
        return "f2";
    }
}