package com.dmsistemas.poliza.dao;

import com.dmsistemas.poliza.model.Control;
import com.dmsistemas.poliza.util.HibernateUtil;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class ControlDaoImp implements ControlDao {

    @Override
    public List<Control> listaTblControl() {
        List<Control> lista = null;
        Session session = HibernateUtil.getSessionfactory().openSession();
        Transaction t = session.beginTransaction();
        String hql = "FROM Control";
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
    public void insertarTblControl(Control tblControl) {
        Session session = null;
        try {
            session = HibernateUtil.getSessionfactory().openSession();
            session.beginTransaction();
            session.save(tblControl);
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
    @SuppressWarnings({"null", "UseSpecificCatch"})
    public void actualizarTblControl(int cteRegPol, int ctinFadiPar, int ctuuidComp, int valIdOpter) {
        Session session = HibernateUtil.getSessionfactory().openSession();
        Transaction t = session.beginTransaction();
        Query q = session.createQuery("UPDATE Control SET ctregpol=:cteRegPol, ctinfadipar=:ctinFadiPar,ctuuidcomp=:ctuuidComp,ctidotrosimp=:valIdOpter");
        q.setParameter("cteRegPol", cteRegPol);
        q.setParameter("ctinFadiPar", ctinFadiPar);
        q.setParameter("ctuuidComp", ctuuidComp);
        q.setParameter("valIdOpter", valIdOpter);
        try {
            q.executeUpdate();
            t.commit();
            session.close();
        } catch (Exception e) {
            t.rollback();
        }

    }

}
