package com.dmsistemas.poliza.dao;

import com.dmsistemas.poliza.model.Movs04;
import com.dmsistemas.poliza.util.HibernateUtilBancos;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Movs04DaoImp implements Movs04Dao {

    @Override
    public List<Movs04> listaTblMovs04() {
        List<Movs04> lista = null;
        Session session = HibernateUtilBancos.getSessionfactory().openSession();
        Transaction t = session.beginTransaction();
        String hql = "FROM Movs04";
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
    public void insertarTblControl(Movs04 tblMovs04) {
        Session session = null;
        try {
            session = HibernateUtilBancos.getSessionfactory().openSession();
            session.beginTransaction();
            session.save(tblMovs04);
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
    public void actualizarTblControl(Movs04 tblMovs04) {
        Session session = null;
        try {
            session = HibernateUtilBancos.getSessionfactory().openSession();
            session.beginTransaction();
            session.update(tblMovs04);
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
