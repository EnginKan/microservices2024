package com.yeditepe.comp301.servicea.controller;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="serviceaclient",url = "http://localhost:8082")
public interface UserClient {
    @GetMapping("service-b/addservice/{a}/{b}")
    public String callAddsService(@PathVariable int a,
                                  @PathVariable int b);
}
