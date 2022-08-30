package com.examenJava.examenJava.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examenJava.examenJava.models.ProductoModel;
import com.examenJava.examenJava.repositories.ProductoRepository;

@Service
public class ProductoService {
    @Autowired 
    ProductoRepository productoRepository;

    public ArrayList<ProductoModel> getProductos(){
        return(ArrayList<ProductoModel>)productoRepository.findAll();
    }

    public ProductoModel saveProductoModel(ProductoModel producto){
        return productoRepository.save(producto);
    }

    public Optional<ProductoModel> getBySku(String sku){
        return productoRepository.findById(sku);
    }

    public ArrayList<ProductoModel> getByname(String nombre){
        return productoRepository.findByNombre(nombre);
    }

    public boolean deleteProduct(String sku){
        try {
            productoRepository.deleteById(sku);
            return true;
        } catch (Exception err) {
            return false;
            
        }
    }
}
