package com.tarea.practica.servicios;

import com.tarea.practica.entidades.Actividad;
import com.tarea.practica.repositorios.ActividadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.List;

@Service
public class ActividadServices {

    @Autowired
    private ActividadRepository actividadRepository;

    @Transactional
    public void crearDefault() {

        Actividad actividad = new Actividad(Date.from(Instant.now()), "Demo", "algo");

        actividadRepository.save(actividad);
    }

    public List<Actividad> buscarTodos(){
        return actividadRepository.findAll();
    }

    @Transactional
    public void crearActividad(Actividad actividad){

        actividadRepository.save(actividad);
    }
}
