package com.dmsistemas.poliza.dao;

import com.dmsistemas.poliza.model.Parmovs04;
import java.util.List;

public interface Parmovs04Dao {

    public List<Parmovs04> listaTblParmovs04(int numMov);

    public void insertarTblControl(Parmovs04 tblParmovs04);

    public void actualizarTblControl(Parmovs04 tblParmovs04);
}
