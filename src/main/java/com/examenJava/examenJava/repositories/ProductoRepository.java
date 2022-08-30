package com.examenJava.examenJava.repositories;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.examenJava.examenJava.models.ProductoModel;

@Repository
public interface ProductoRepository extends CrudRepository<ProductoModel,String> {
    public abstract ArrayList<ProductoModel> findByNombre(String nombre);
    public abstract ArrayList<ProductoModel> findByCategoria(Integer categoria); 
}
 