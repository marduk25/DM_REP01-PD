package com.dmsistemas.poliza.dao;

import com.dmsistemas.poliza.model.Regpol;
import java.util.List;

public interface RegpolDao {

    public List<Regpol> listaTblRegpol();

    public void insertarTblRegpol(Regpol tblRegpol);

    public void actualizarTblRegpol(Regpol tblRegpol);

    public String maxValNumReg();//SELECCIONAMOS EL VALOR MÁXIMO +1 DE LA TABLA REGPOL

}
