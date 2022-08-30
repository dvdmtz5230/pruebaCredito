package com.examenJava.examenJava.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examenJava.examenJava.models.CotizacionModel;
import com.examenJava.examenJava.models.PlazoModel;
import com.examenJava.examenJava.models.ProductoModel;

@Service
public class CotizadorService {
    @Autowired
    PlazoService plazosService;
    @Autowired 
    ProductoService productoService;
    public CotizacionModel calcular(CotizacionModel Cotizacion){
        int a= Cotizacion.semanasAPlazo;
        String sku= Cotizacion.sku; 
        System.out.println(sku);
        java.util.Optional<PlazoModel> plazo = this.plazosService.getById(a); 
        java.util.Optional<ProductoModel> producto = this.productoService.getBySku(sku);
        float precioProduct = producto.get().getPrecio();
        float tasaNormal = plazo.get().getTasaNormal();
        float tasaPuntual = plazo.get().getTasaPuntual();
        int plazoD = plazo.get().getSemanasAPlazo();  
        Cotizacion.abonoNomal= (((precioProduct*tasaNormal)+precioProduct)/plazoD);
        Cotizacion.abonoPuntual= (((precioProduct*tasaPuntual)+precioProduct)/plazoD);



        return Cotizacion;
    }

    }

