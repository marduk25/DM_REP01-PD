package com.dmsistemas.poliza.dao;

import com.dmsistemas.poliza.model.Movpoliza;
import com.dmsistemas.poliza.util.HibernateUtilBancos;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class MovpolizaDaoImp implements MovpolizaDao {

    @Override
    public List<Movpoliza> listaTblMovpoliza() {
        List<Movpoliza> lista = null;
        Session session = HibernateUtilBancos.getSessionfactory().openSession();
        Transaction t = session.beginTransaction();
        String hql = "FROM Movpoliza";
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
    public void insertarTblControl(Movpoliza tblMovpoliza) {
        Session session = null;
        try {
            session = HibernateUtilBancos.getSessionfactory().openSession();
            session.beginTransaction();
            session.save(tblMovpoliza);
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
    public void actualizarTblControl(Movpoliza tblMovpoliza) {
        Session session = null;
        try {
            session = HibernateUtilBancos.getSessionfactory().openSession();
            session.beginTransaction();
            session.update(tblMovpoliza);
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
