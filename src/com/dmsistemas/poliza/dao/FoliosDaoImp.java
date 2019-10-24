package com.dmsistemas.poliza.dao;

import com.dmsistemas.poliza.model.Folios;
import com.dmsistemas.poliza.util.HibernateUtil;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class FoliosDaoImp implements FoliosDao {

    @Override
    public List<Folios> listaTblFolios() {
        List<Folios> lista = null;
        Session session = HibernateUtil.getSessionfactory().openSession();
        Transaction t = session.beginTransaction();
        String hql = "FROM Folios";
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
    public void insertarTblFolios(Folios tblFolios) {
        Session session = null;
        try {
            session = HibernateUtil.getSessionfactory().openSession();
            session.beginTransaction();
            session.save(tblFolios);
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
    public void actualizarTblFolios(String folioPol, String folioMes, short Ejercicio) {
        Session session = HibernateUtil.getSessionfactory().openSession();
        Transaction t = session.beginTransaction();
        Query q = session.createQuery("UPDATE Folios SET " + folioMes + "=:folioPol WHERE tippol='Et' AND ejercicio=:Ejercicio");
        q.setParameter("folioPol", folioPol);
        q.setParameter("Ejercicio", Ejercicio);

        try {
            q.executeUpdate();
            t.commit();
            session.close();
        } catch (HibernateException e) {
            System.err.println(e.getMessage());
            t.rollback();
        }
    }

}
