package com.dmsistemas.poliza.dao;

import com.dmsistemas.poliza.model.Otrosimpuestos;
import com.dmsistemas.poliza.util.HibernateUtil;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class OtrosimpuestosDaoImp implements OtrosimpuestosDao {

    @Override
    public List<Otrosimpuestos> listaTblOtrosimpuestos() {
        List<Otrosimpuestos> lista = null;
        Session session = HibernateUtil.getSessionfactory().openSession();
        Transaction t = session.beginTransaction();
        String hql = "FROM Otrosimpuestos";
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
    public void insertarTblControl(Otrosimpuestos tblOtrosimpuestos) {
        Session session = null;
        try {
            session = HibernateUtil.getSessionfactory().openSession();
            session.beginTransaction();
            session.save(tblOtrosimpuestos);
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
    public void actualizarTblControl(Otrosimpuestos tblOtrosimpuestos) {
        Session session = null;
        try {
            session = HibernateUtil.getSessionfactory().openSession();
            session.beginTransaction();
            session.update(tblOtrosimpuestos);
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
    public String maxValIdopter() {
        String maxValNumReg = "";
        Session session = HibernateUtil.getSessionfactory().openSession();
        Transaction t = session.beginTransaction();
        String hql = "SELECT MAX(idopter) +1 FROM Otrosimpuestos";
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