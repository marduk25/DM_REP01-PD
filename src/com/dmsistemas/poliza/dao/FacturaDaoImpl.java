package com.dmsistemas.poliza.dao;

import java.util.List;

import com.dmsistemas.poliza.model.Factura;

import com.dmsistemas.poliza.util.HibernateUtilPortal;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class FacturaDaoImpl implements FacturaDao {

    @Override
    public List<Factura> listaFactura(int folio) {
        List<Factura> lista = null;
        Session session = HibernateUtilPortal.getSessionfactory().openSession();
        Transaction t = session.beginTransaction();
        String hql = "FROM Factura where foliowcxp='" + folio + "'";
        try {
            lista = session.createQuery(hql).list();
            t.commit();
            session.close();
        } catch (HibernateException e) {
            t.rollback();
        }
        return lista;
    }

}
