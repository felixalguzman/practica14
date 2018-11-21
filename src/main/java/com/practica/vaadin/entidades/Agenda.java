package com.practica.vaadin.entidades;

import java.time.ZonedDateTime;

public class Agenda {

    enum Estado {

        vacio,
        planeado,
        confirmado
    }

    private ZonedDateTime inicio;

    private ZonedDateTime fin;

    private String nombre;

    private String detalles;

    private Estado estado = Estado.vacio;

    private Boolean tiempoLargo;

    public Agenda(boolean tiempoLargo) {
        this.tiempoLargo = tiempoLargo;
    }

    public Agenda(ZonedDateTime inicio, ZonedDateTime fin, String nombre, String detalles, Estado estado, Boolean tiempoLargo) {
        this.inicio = inicio;
        this.fin = fin;
        this.nombre = nombre;
        this.detalles = detalles;
        this.estado = estado;
        this.tiempoLargo = tiempoLargo;
    }

    public ZonedDateTime getInicio() {
        return inicio;
    }

    public void setInicio(ZonedDateTime inicio) {
        this.inicio = inicio;
    }

    public ZonedDateTime getFin() {
        return fin;
    }

    public void setFin(ZonedDateTime fin) {
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

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public Boolean getTiempoLargo() {
        return tiempoLargo;
    }

    public void setTiempoLargo(Boolean tiempoLargo) {
        this.tiempoLargo = tiempoLargo;
    }
}
