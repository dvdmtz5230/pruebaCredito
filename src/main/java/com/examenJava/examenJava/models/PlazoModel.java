package com.examenJava.examenJava.models;

import javax.persistence.*;

@Entity
@Table(name = "plazo")
public class PlazoModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true,nullable = false)
    private Long id;
    private float tasaNormal;
    private float tasaPuntual;
    private Integer semanasAPlazo;
    
    public float getTasaNormal() {
        return tasaNormal;
    }
    public void setTasaNormal(float tasaNormal) {
        this.tasaNormal = tasaNormal;
    }
    public float getTasaPuntual() {
        return tasaPuntual;
    }
    public void setTasaPuntual(float tasaPuntual) {
        this.tasaPuntual = tasaPuntual;
    }
    

    
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
     
    public Integer getSemanasAPlazo() {
        return semanasAPlazo;
    }
    public void setSemanasAPlazo(Integer semanasAPlazo) {
        this.semanasAPlazo = semanasAPlazo;
    }
}
