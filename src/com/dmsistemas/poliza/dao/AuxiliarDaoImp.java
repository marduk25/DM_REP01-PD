package com.dmsistemas.poliza.dao;

import com.dmsistemas.poliza.model.Auxiliar19;
import com.dmsistemas.poliza.util.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class AuxiliarDaoImp implements AuxiliarDao {

    @Override
    @SuppressWarnings("null")
    public void insertarAuxiliares(Auxiliar19 tblAuxiliar19) {
        Session session = null;
        try {
            session = HibernateUtil.getSessionfactory().openSession();
            session.beginTransaction();
            session.save(tblAuxiliar19);
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
    public String maxValPol() {
        String maxValPol = "";
        Session session = HibernateUtil.getSessionfactory().openSession();
        Transaction t = session.beginTransaction();
        String hql = "SELECT MAX(numPoliz) +1 FROM Auxiliar19 WHERE tipoPoli='Et'";
        try {
            maxValPol = session.createQuery(hql).uniqueResult().toString();
            t.commit();
            session.close();
        } catch (HibernateException e) {
            t.rollback();
        }
        return maxValPol;
    }

}
