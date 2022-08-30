package com.examenJava.examenJava.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examenJava.examenJava.models.PlazoModel;
import com.examenJava.examenJava.repositories.PlazoRepository;

@Service 
public class PlazoService {
    private static final Optional<PlazoModel> Error = null;
    @Autowired
    PlazoRepository plazoRepository;

    public ArrayList<PlazoModel> getPlazo(){
        return(ArrayList<PlazoModel>)plazoRepository.findAll();
    }

    public PlazoModel savePlazoModel(PlazoModel plazo){
        return plazoRepository.save(plazo);
    }

    public Optional<PlazoModel> getById(long id){
        try {
             return plazoRepository.findById(id);
         
        } catch (Exception e) {
            return Error;
        }
       
        
    }
    

    public ArrayList<PlazoModel> getByplazo(int i){
        return plazoRepository.findBysemanasAPlazo(i);
    }

    public  boolean deletePlazo(long id) {
        try {
            plazoRepository.deleteById(id);
            return true;
        } catch (Exception err) {
            return false;
        }
        
    }
    
    
}
