package com.dmsistemas.poliza.dao;

import com.dmsistemas.poliza.model.Impuestosfiscales;
import java.util.List;

public interface ImpuestosfiscalesDao {

    public List<Impuestosfiscales> listaTblImpuestosfiscales();

    public void insertarTblImpuestosfiscales(Impuestosfiscales tblImpuestosfiscales);

    public void actualizarTblImpuestosfiscales(Impuestosfiscales tblImpuestosfiscales);

}
