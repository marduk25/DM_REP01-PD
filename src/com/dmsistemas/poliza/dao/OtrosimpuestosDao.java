package com.dmsistemas.poliza.dao;

import com.dmsistemas.poliza.model.Otrosimpuestos;
import java.util.List;

public interface OtrosimpuestosDao {

    public List<Otrosimpuestos> listaTblOtrosimpuestos();

    public void insertarTblControl(Otrosimpuestos tblOtrosimpuestos);

    public void actualizarTblControl(Otrosimpuestos tblOtrosimpuestos);

    public String maxValIdopter();//SELECCIONAMOS EL VALOR MÁXIMO +1 DE LA TABLA OTROS IMPUESTOS
}
