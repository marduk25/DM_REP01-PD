package com.dmsistemas.poliza.dao;

import com.dmsistemas.poliza.model.Impuestosfiscales;
import com.dmsistemas.poliza.util.HibernateUtil;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class ImpuestosfiscalesDaoImp implements ImpuestosfiscalesDao {

    @Override
    public List<Impuestosfiscales> listaTblImpuestosfiscales() {
        List<Impuestosfiscales> lista = null;
        Session session = HibernateUtil.getSessionfactory().openSession();
        Transaction t = session.beginTransaction();
        String hql = "FROM Impuestosfiscales";
        try {
            lista = session.createQuery(hql).list();
            t.commit();
            session.close();
        } catch (HibernateException e) {
            t.rollback();
        }
        return lista;
    }

    @Override
    @SuppressWarnings("null")
    public void insertarTblImpuestosfiscales(Impuestosfiscales tblImpuestosfiscales) {

        Session session = null;
        try {
            session = HibernateUtil.getSessionfactory().openSession();
            session.beginTransaction();
            session.save(tblImpuestosfiscales);
            session.getTransaction().commit();
        } catch (HibernateException e) {
            System.out.println(e.getMessage());
            session.getTransaction().rollback();
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }

    @Override
    @SuppressWarnings("null")
    public void actualizarTblImpuestosfiscales(Impuestosfiscales tblImpuestosfiscales) {
        Session session = null;
        try {
            session = HibernateUtil.getSessionfactory().openSession();
            session.beginTransaction();
            session.update(tblImpuestosfiscales);
            session.getTransaction().commit();
        } catch (HibernateException e) {
            System.out.println(e.getMessage());
            session.getTransaction().rollback();
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }

}
