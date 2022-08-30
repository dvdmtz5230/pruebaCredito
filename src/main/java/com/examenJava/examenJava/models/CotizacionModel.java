package com.examenJava.examenJava.models;

public class CotizacionModel {
    public String sku;
    public int semanasAPlazo; 
    public float abonoNomal;
    public float abonoPuntual;
    
    
    public String getSku() {
        return sku;
    }
    public void setSku(String sku) {
        this.sku = sku;
    }

    
    public float getAbonoNomal() {
        return abonoNomal;
    }
    public void setAbonoNomal(float abonoNomal) {
        this.abonoNomal = abonoNomal;
    }
    public float getAbonoPuntual() {
        return abonoPuntual;
    }
    public void setAbonoPuntual(float abonoPuntual) {
        this.abonoPuntual = abonoPuntual;
    }
}
