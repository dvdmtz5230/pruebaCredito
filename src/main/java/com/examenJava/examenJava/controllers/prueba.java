package com.examenJava.examenJava.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.examenJava.examenJava.models.PlazoModel;
import com.examenJava.examenJava.services.CotizadorService;
import com.examenJava.examenJava.services.PlazoService;
 
@RestController
@RequestMapping("/x")
public class prueba {
    @Autowired
    PlazoService plazosService;
    CotizadorService cotizadorService; 
    @GetMapping()
    
    public ArrayList<PlazoModel> getPlazo(){
        return plazosService.getPlazo();
    }
}
