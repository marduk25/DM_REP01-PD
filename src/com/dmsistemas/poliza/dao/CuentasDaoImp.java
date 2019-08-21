package com.dmsistemas.poliza.dao;

import com.dmsistemas.poliza.model.Cuentas19;
import com.dmsistemas.poliza.util.HibernateUtil;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class CuentasDaoImp implements CuentasDao {

    @Override
    public List<Cuentas19> listaCuenta(String rfc) {
        List<Cuentas19> lista = null;
        Session session = HibernateUtil.getSessionfactory().openSession();
        Transaction t = session.beginTransaction();
        String hql = "SELECT numCta FROM Cuentas19 WHERE rfc='" + rfc + "'";
        try {
            lista = session.createQuery(hql).setMaxResults(1).list();
            t.commit();
            session.close();
        } catch (HibernateException e) {
            System.out.println(e.getMessage());
            t.rollback();
        }
        return lista;
    }

}
