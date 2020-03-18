/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udea.service;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author FRANKLIN
 */
@WebService(serviceName = "climaWS")
public class climaWS {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "ingresarClima")
    public String ingresarClima(@WebParam(name = "gradosCentigrados") float gradosCentigrados, @WebParam(name = "humedad") float humedad, @WebParam(name = "nubosidad") String nubosidad, @WebParam(name = "precipitacion") float precipitacion, @WebParam(name = "viento") float viento, @WebParam(name = "dia") String dia, @WebParam(name = "idCiudad") int idCiudad, @WebParam(name = "id") int id) {
        //TODO write your implementation code here:
        return null;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "ingresarCiudad")
    public String ingresarCiudad(@WebParam(name = "id") int id, @WebParam(name = "nombre") String nombre, @WebParam(name = "codigoPostal") int codigoPostal, @WebParam(name = "indicador") int indicador) {
        //TODO write your implementation code here:
        return null;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "consultarClima")
    public String consultarClima(@WebParam(name = "ciudad") int ciudad, @WebParam(name = "dia") String dia) {
        //TODO write your implementation code here:
        return null;
    }
}
