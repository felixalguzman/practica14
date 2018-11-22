package com.tarea.practica.entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.io.Serializable;
import java.util.Date;

@Entity
public class Actividad implements Serializable {

    @Id
    @GeneratedValue
    private Long id;

    private Date inicio;

    private String nombre;

    private String detalles;

    @ManyToOne
    private Gerente gerente;

    public Actividad() {
    }

    public Actividad(Date inicio,  String nombre, String detalles) {
        this.inicio = inicio;
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
