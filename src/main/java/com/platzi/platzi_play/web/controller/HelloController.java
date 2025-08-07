package com.platzi.platzi_play.web.controller;

import com.platzi.platzi_play.domain.service.PlatziPlayAiService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
//private final String plataform;
    private final PlatziPlayAiService aiService;

    public HelloController(@Value("${spring.application.name}") PlatziPlayAiService aiService) {

       // private.plataform = plataform;
        this.aiService = aiService;
    }

    //@GetMapping("/hello")
    //public  String hello() {
        //return this.aiService.generateGreeting(plataform);
    //}
}
