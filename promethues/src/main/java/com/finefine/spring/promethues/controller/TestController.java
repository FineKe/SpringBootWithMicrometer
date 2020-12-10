package com.finefine.spring.promethues.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;
import java.util.concurrent.TimeUnit;

/**
 * @author finefine at: 2020/12/10 3:34 下午
 */
@RestController
public class TestController {


    @GetMapping(value = "/hello")
    public String helloPromethues(){
        try {

            TimeUnit.MILLISECONDS.sleep(new Random().nextInt(1000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return  "helloPromethues";
    }
}
