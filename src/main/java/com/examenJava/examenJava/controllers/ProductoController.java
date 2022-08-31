package com.examenJava.examenJava.controllers;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.examenJava.examenJava.models.ProductoModel;
import com.examenJava.examenJava.services.ProductoService;
import org.springframework.web.bind.annotation.GetMapping;
 

@RestController
@RequestMapping("/producto")
public class ProductoController {
    @Autowired(required = false)
    ProductoService productoService;

    @GetMapping()
    public ArrayList<ProductoModel> getProductos() {
        return productoService.getProductos();
    }

    @PostMapping()
    public ProductoModel saveProducto(@RequestBody ProductoModel producto) {
        return this.productoService.saveProductoModel(producto);
    }

    @GetMapping(path= "/{sku}")
    public Optional<ProductoModel> getProductoBySku(@PathVariable("sku")String sku){
        return this.productoService.getBySku(sku);
    }
    @GetMapping("/producByName")
    public ArrayList<ProductoModel> getProductoName(@RequestParam("name")String nombre){
        return this.productoService.getByname(nombre);
    }

    @DeleteMapping(path = "/{sku}")
    public String deleteBySku(@PathVariable("sku") String sku){
        boolean ok = this.productoService.deleteProduct(sku);
        if(ok){
            return "Eliminacion Correcta Sku:"+sku;
        }else{
            return "No se elimino Sku"+ sku;
        }
    }
    
    

}
