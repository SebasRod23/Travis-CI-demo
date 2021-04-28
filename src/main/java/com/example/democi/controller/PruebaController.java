package com.example.democi.controller;

import com.example.democi.model.SumaRequest;
import com.example.democi.service.PruebaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1")
public class PruebaController {

    @Autowired
    PruebaService pruebaService;

    @GetMapping("prueba")
    String helloWorld(){
        return "Hello World";
    }

    @PostMapping("suma")
    double suma(@RequestBody SumaRequest sumaRequest){
        return pruebaService.suma(sumaRequest.getA(),sumaRequest.getB());
    }
}
