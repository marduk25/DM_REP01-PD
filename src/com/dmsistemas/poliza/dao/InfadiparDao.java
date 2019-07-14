package com.dmsistemas.poliza.dao;

import com.dmsistemas.poliza.model.Infadipar;
import java.util.List;

public interface InfadiparDao {

    public List<Infadipar> listaTblInfadipar();

    public void insertarTblInfadipar(Infadipar tblInfadipar);

    public void actualizarTblInfadipar(Infadipar tblInfadipar);

    public String maxValNumReg();//SELECCIONAMOS EL VALOR MÁXIMO +1 DE LA TABLA INFADIPAR
}
