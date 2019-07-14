package com.dmsistemas.poliza.dao;

import com.dmsistemas.poliza.model.Uuidtimbres;
import com.dmsistemas.poliza.util.HibernateUtil;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class UuidtimbresDaoImp implements UuidtimbresDao {

    @Override
    public List<Uuidtimbres> listaTblUuidtimbres() {
        List<Uuidtimbres> lista = null;
        Session session = HibernateUtil.getSessionfactory().openSession();
        Transaction t = session.beginTransaction();
        String hql = "FROM Uuidtimbres";
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
    public void insertarTblControl(Uuidtimbres tblUuidtimbres) {
        Session session = null;
        try {
            session = HibernateUtil.getSessionfactory().openSession();
            session.beginTransaction();
            session.save(tblUuidtimbres);
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
    public void actualizarTblControl(Uuidtimbres tblUuidtimbres) {
        Session session = null;
        try {
            session = HibernateUtil.getSessionfactory().openSession();
            session.beginTransaction();
            session.update(tblUuidtimbres);
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
        String hql = "SELECT MAX(numreg) +1 FROM Uuidtimbres";
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
