package com.dmsistemas.poliza.dao;

import java.util.List;
import com.dmsistemas.poliza.model.Factura;

public interface FacturaDao {

    public List<Factura> listaFactura(int folio);
    
   
}
