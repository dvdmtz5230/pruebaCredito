package com.examenJava.examenJava.controllers;
import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.examenJava.examenJava.models.CotizacionModel;
import com.examenJava.examenJava.models.PlazoModel;
import com.examenJava.examenJava.services.CotizadorService;
import com.examenJava.examenJava.services.PlazoService;
import com.examenJava.examenJava.services.ProductoService;


 
 
 
@RestController
@RequestMapping("/plazo")
public class PlazoController {
    @Autowired 
    ProductoService productoService;
    @Autowired 
    PlazoService plazosService;
    @Autowired 
    CotizadorService cotizadorService; 
    @GetMapping()
    public ArrayList<PlazoModel> getPlazo(){
        return plazosService.getPlazo();
    }

    @PostMapping()
    public PlazoModel savePlazo(@RequestBody PlazoModel plazo){
        return this.plazosService.savePlazoModel(plazo);
    }

    @GetMapping(path = "/{id}")
    public Optional<PlazoModel> getPlazoById(@PathVariable("id")long id){ 
        return this.plazosService.getById(id);
    }

    @PostMapping("/cotizar")
    public  CotizacionModel getCotizacion(@RequestBody CotizacionModel Cotizacion ){
       


        return this.cotizadorService.calcular(Cotizacion);
    }
    
    
    @DeleteMapping(path = "/{id}")
public String deleteById(@PathVariable("id") long id){
    boolean ok = this.plazosService.deletePlazo(id);
    if(ok){
    return "Elminiacion Correcta Id;"+ id;
    }else{
        return"No se pudo eliminar id"+ id;
    }
}

 

}
