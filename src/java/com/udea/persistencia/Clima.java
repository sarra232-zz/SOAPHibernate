package com.udea.persistencia;
// Generated 17-mar-2020 20:44:57 by Hibernate Tools 4.3.1


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Clima generated by hbm2java
 */
@Entity
@Table(name="clima"
    ,catalog="climadb"
)
public class Clima  implements java.io.Serializable {


     private int id;
     private float gradosCentigrados;
     private float humedad;
     private String tipoNubosidad;
     private float precipitacion;
     private float viento;
     private Date dia;
     private int idCiudad;

    public Clima() {
    }

    public Clima(int id, float gradosCentigrados, float humedad, String tipoNubosidad, float precipitacion, float viento, Date dia, int idCiudad) {
       this.id = id;
       this.gradosCentigrados = gradosCentigrados;
       this.humedad = humedad;
       this.tipoNubosidad = tipoNubosidad;
       this.precipitacion = precipitacion;
       this.viento = viento;
       this.dia = dia;
       this.idCiudad = idCiudad;
    }
   
     @Id 

    
    @Column(name="id", unique=true, nullable=false)
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }

    
    @Column(name="grados_centigrados", nullable=false, precision=12, scale=0)
    public float getGradosCentigrados() {
        return this.gradosCentigrados;
    }
    
    public void setGradosCentigrados(float gradosCentigrados) {
        this.gradosCentigrados = gradosCentigrados;
    }

    
    @Column(name="humedad", nullable=false, precision=12, scale=0)
    public float getHumedad() {
        return this.humedad;
    }
    
    public void setHumedad(float humedad) {
        this.humedad = humedad;
    }

    
    @Column(name="tipo_nubosidad", nullable=false, length=50)
    public String getTipoNubosidad() {
        return this.tipoNubosidad;
    }
    
    public void setTipoNubosidad(String tipoNubosidad) {
        this.tipoNubosidad = tipoNubosidad;
    }

    
    @Column(name="precipitacion", nullable=false, precision=12, scale=0)
    public float getPrecipitacion() {
        return this.precipitacion;
    }
    
    public void setPrecipitacion(float precipitacion) {
        this.precipitacion = precipitacion;
    }

    
    @Column(name="viento", nullable=false, precision=12, scale=0)
    public float getViento() {
        return this.viento;
    }
    
    public void setViento(float viento) {
        this.viento = viento;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="dia", nullable=false, length=10)
    public Date getDia() {
        return this.dia;
    }
    
    public void setDia(Date dia) {
        this.dia = dia;
    }

    
    @Column(name="id_ciudad", nullable=false)
    public int getIdCiudad() {
        return this.idCiudad;
    }
    
    public void setIdCiudad(int idCiudad) {
        this.idCiudad = idCiudad;
    }




}


