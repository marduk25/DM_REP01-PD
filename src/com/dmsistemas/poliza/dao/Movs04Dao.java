package com.dmsistemas.poliza.dao;

import com.dmsistemas.poliza.model.Movs04;
import java.util.List;

public interface Movs04Dao {

    public List<Movs04> listaTblMovs04();

    public void insertarTblControl(Movs04 tblMovs04);

    public void actualizarTblControl(Movs04 tblMovs04);
}
