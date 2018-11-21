package com.tarea.practica.entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

@Entity
public class Actividad implements Serializable {

    @Id
    @GeneratedValue
    private Long id;

    private Date inicio;

    private Date fin;

    private String nombre;

    private String detalles;

    public Actividad() {
    }

    public Actividad(Date inicio, Date fin, String nombre, String detalles) {
        this.inicio = inicio;
        this.fin = fin;
        this.nombre = nombre;
        this.detalles = detalles;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getInicio() {
        return inicio;
    }

    public void setInicio(Date inicio) {
        this.inicio = inicio;
    }

    public Date getFin() {
        return fin;
    }

    public void setFin(Date fin) {
        this.fin = fin;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDetalles() {
        return detalles;
    }

    public void setDetalles(String detalles) {
        this.detalles = detalles;
    }
}
