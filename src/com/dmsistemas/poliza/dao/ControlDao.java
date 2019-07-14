package com.dmsistemas.poliza.dao;

import com.dmsistemas.poliza.model.Control;
import java.util.List;

public interface ControlDao {

    public List<Control> listaTblControl();

    public void insertarTblControl(Control tblControl);

    public void actualizarTblControl(int cteRegPol, int ctinFadiPar, int ctuuidComp, int valIdOpter);

}
