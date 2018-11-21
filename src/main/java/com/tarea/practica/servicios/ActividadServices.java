package com.tarea.practica.servicios;

import com.tarea.practica.entidades.Actividad;
import com.tarea.practica.repositorios.ActividadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.Date;

@Service
public class ActividadServices {

    @Autowired
    private ActividadRepository actividadRepository;

    public void crearDefault() {

        Actividad actividad = new Actividad(Date.from(Instant.now()), Date.from(Instant.now().plus(2, ChronoUnit.DAYS)), "Demo", "algo");

        actividadRepository.save(actividad);
    }
}
