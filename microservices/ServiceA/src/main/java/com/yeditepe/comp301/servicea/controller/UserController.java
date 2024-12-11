package com.yeditepe.comp301.servicea.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user-servicea")
public class UserController {

    private UserClient userClient;

    public UserController(UserClient userClient) {
        this.userClient = userClient;
    }

    @GetMapping("/add/{a}/{b}")
    public ResponseEntity<String> makeOperation(@PathVariable("a") int a,
                                                @PathVariable("b") int b) {

        String  answer=userClient.callAddsService(a,b);
        return ResponseEntity.ok(answer);
    }



}
