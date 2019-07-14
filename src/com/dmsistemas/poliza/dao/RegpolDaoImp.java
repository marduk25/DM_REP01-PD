package com.dmsistemas.poliza.dao;

import com.dmsistemas.poliza.model.Regpol;
import com.dmsistemas.poliza.util.HibernateUtil;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class RegpolDaoImp implements RegpolDao {

    @Override
    public List<Regpol> listaTblRegpol() {
        List<Regpol> lista = null;
        Session session = HibernateUtil.getSessionfactory().openSession();
        Transaction t = session.beginTransaction();
        String hql = "FROM Regpol";
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
    public void insertarTblRegpol(Regpol tblRegpol) {
        Session session = null;
        try {
            session = HibernateUtil.getSessionfactory().openSession();
            session.beginTransaction();
            session.save(tblRegpol);
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
    public void actualizarTblRegpol(Regpol tblRegpol) {
        Session session = null;
        try {
            session = HibernateUtil.getSessionfactory().openSession();
            session.beginTransaction();
            session.update(tblRegpol);
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
    public String maxValNumReg() {
         String maxValNumReg = "";
        Session session = HibernateUtil.getSessionfactory().openSession();
        Transaction t = session.beginTransaction();
        String hql = "SELECT MAX(transaccio) +1 FROM Regpol";
        try {
            maxValNumReg = session.createQuery(hql).uniqueResult().toString();
            t.commit();
            session.close();
        } catch (HibernateException e) {
            t.rollback();
        }
        return maxValNumReg;

    }

}
