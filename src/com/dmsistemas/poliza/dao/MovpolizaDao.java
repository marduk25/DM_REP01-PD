package com.dmsistemas.poliza.dao;

import com.dmsistemas.poliza.model.Movpoliza;
import java.util.List;

public interface MovpolizaDao {

    public List<Movpoliza> listaTblMovpoliza();

    public void insertarTblControl(Movpoliza tblMovpoliza);

    public void actualizarTblControl(Movpoliza tblMovpoliza);
    

}
