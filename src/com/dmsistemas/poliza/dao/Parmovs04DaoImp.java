package com.dmsistemas.poliza.dao;

import com.dmsistemas.poliza.model.Parmovs04;
import com.dmsistemas.poliza.util.HibernateUtilBancos;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Parmovs04DaoImp implements Parmovs04Dao {

    @Override
    public List<Parmovs04> listaTblParmovs04(int numMov) {
        List<Parmovs04> lista = null;
        Session session = HibernateUtilBancos.getSessionfactory().openSession();
        Transaction t = session.beginTransaction();
        String hql = "FROM Parmovs04 WHERE numMov='" + numMov + "'";
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
    public void insertarTblControl(Parmovs04 tblParmovs04) {
        Session session = null;
        try {
            session = HibernateUtilBancos.getSessionfactory().openSession();
            session.beginTransaction();
            session.save(tblParmovs04);
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
    public void actualizarTblControl(Parmovs04 tblParmovs04) {
        Session session = null;
        try {
            session = HibernateUtilBancos.getSessionfactory().openSession();
            session.beginTransaction();
            session.update(tblParmovs04);
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
