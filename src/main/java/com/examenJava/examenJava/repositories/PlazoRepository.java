package com.examenJava.examenJava.repositories;

 
import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.examenJava.examenJava.models.PlazoModel;

@Repository

public interface  PlazoRepository extends CrudRepository<PlazoModel,Long>{
   public abstract ArrayList<PlazoModel> findBysemanasAPlazo(int i);
   
    
   
    
}
 