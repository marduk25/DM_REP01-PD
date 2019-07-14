package com.dmsistemas.poliza.dao;

import com.dmsistemas.poliza.model.Uuidtimbres;
import java.util.List;

public interface UuidtimbresDao {

    public List<Uuidtimbres> listaTblUuidtimbres();

    public void insertarTblControl(Uuidtimbres tblUuidtimbres);

    public void actualizarTblControl(Uuidtimbres tblUuidtimbres);

    public String maxValNumReg();//SELECCIONAMOS EL VALOR MÁXIMO +1 DE LA TABLA UUIDTIMBRES
}
