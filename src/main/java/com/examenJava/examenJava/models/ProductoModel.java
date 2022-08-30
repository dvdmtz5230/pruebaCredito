package com.examenJava.examenJava.models;

import javax.persistence.*;


@Entity
@Table(name = "producto")
public class ProductoModel {
    @Id
    @Column(unique = true,nullable = false)
    private String sku;
    private String nombre;
    private String descripcion;
    private float precio;
    private Integer categoria;

 
    public Integer getCategorias() {
        return categoria;
    }
    public void setCategorias(Integer categorias) {
        this.categoria = categorias;
    }
    public String getSku() {
        return sku;
    }
    public void setSku(String sku) {
        this.sku = sku;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public float getPrecio() {
        return precio;
    }
    public void setPrecio(float precio) {
        this.precio = precio;
    }

}
