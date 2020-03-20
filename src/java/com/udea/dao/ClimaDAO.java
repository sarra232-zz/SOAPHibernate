/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udea.dao;

import com.udea.persistencia.Clima;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author FRANKLIN
 */
public class ClimaDAO {
    
    public void ingresarClima(Clima c){
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
        throw new RuntimeException("No se pudo ingresar el clima");
        }
    }
    
    
    
    public String consultarClima(int id){
    SessionFactory sf=HibernateUtil.getSessionFactory();
        Session session=sf.openSession();
        Clima c=(Clima) session.get(Clima.class, id);
        session.close();
        if (c!=null) {
            return "Indicadores: Dia:"+c.getDia()+", Temperatura Cº:"+c.getGradosCentigrados()+", Fº: "+(((9/5)*c.getGradosCentigrados())+32)+", Humedad: "+c.getHumedad()+" Precipitacion:"+c.getPrecipitacion()+", Viento: "+c.getViento()+", nubocidad: "+c.getTipoNubosidad();
        }
        else {
            return "Error al consultar clima";
        }
    }
 
    
}
