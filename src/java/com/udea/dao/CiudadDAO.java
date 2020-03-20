/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udea.dao;

import com.udea.persistencia.Ciudad;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author FRANKLIN
 */
public class CiudadDAO {
    
    public void ingresarCiudad(Ciudad c){
        SessionFactory sf=null;
        Session session=null;
        Transaction tx=null;
        try{
            sf=HibernateUtil.getSessionFactory();
            session=sf.openSession();
            tx=session.beginTransaction();
            session.save(c);
        }catch(Exception e){
        tx.rollback();
        throw new RuntimeException("No se pudo ingresar la ciudad");
        }
    }
    public String consultarCiudad(int id){
        ClimaDAO clima= new ClimaDAO();
    SessionFactory sf=HibernateUtil.getSessionFactory();
        Session session=sf.openSession();
        Ciudad c=(Ciudad) session.get(Ciudad.class, id);
        session.close();
        if (c!=null) {
            return"Ciudad "+c.getNombre()+"Codigo postal:"+c.getCodigoPostal()+clima.consultarClima(c.getIndicador());
        }
        else {
            return "Error al consultar";
        }
    }
    public List<Ciudad> listarCiudad(){
    SessionFactory sf=HibernateUtil.getSessionFactory();
    Session s= sf.openSession();
    Query q= s.createQuery("from ciudad");
    List<Ciudad> lista= q.list();
        return lista;
    }
}
