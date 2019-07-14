package com.dmsistemas.poliza.dao;

import com.dmsistemas.poliza.model.Doctosfiscales;
import java.util.List;

public interface DoctofiscalesDao {

    public List<Doctosfiscales> listaTblDoctosfiscales();

    public void insertarTblDoctosFiscales(Doctosfiscales tblDoctosfiscales);

    public void actualizarTblDoctosFiscales(Doctosfiscales tblDoctosfiscales);
}
