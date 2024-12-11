package com.yeditepe.comp301.serviceb.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("service-b")
public class AddController {

    @GetMapping("/addservice/{a}/{b}")
    public String calculate(@PathVariable int a,
                            @PathVariable int b) {
        Integer result = a + b;
        return result.toString();
    }
}
