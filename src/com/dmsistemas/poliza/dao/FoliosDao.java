package com.dmsistemas.poliza.dao;

import com.dmsistemas.poliza.model.Folios;
import java.util.List;

public interface FoliosDao {

    public List<Folios> listaTblFolios();

    public void insertarTblFolios(Folios tblFolios);

    public void actualizarTblFolios(String folioPol, String folioMes, short Ejercicio);
}
