package com.dmsistemas.poliza.dao;

import com.dmsistemas.poliza.model.Opeter;
import java.util.List;

public interface OpeterDao {

    public List<Opeter> listaTblOpeter();

    public void insertarTblOpeter(Opeter tblOpeter);

    public void actualizarTblOpeter(Opeter tblOpeter);
}
