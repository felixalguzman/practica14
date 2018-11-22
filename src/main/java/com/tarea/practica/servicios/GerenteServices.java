package com.tarea.practica.servicios;

import com.tarea.practica.entidades.Actividad;
import com.tarea.practica.entidades.Correo;
import com.tarea.practica.entidades.Gerente;
import com.tarea.practica.repositorios.GerenteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.Instant;
import java.util.Arrays;
import java.util.Date;
import java.util.HashSet;

@Service
public class GerenteServices {

    @Autowired
    private GerenteRepository gerenteRepository;

    @Autowired
    private CorreoServices correoServices;

    @Autowired
    private ActividadServices actividadServices;

    @Transactional
    public void crearAdmin() {

        if (!buscarAdminDefault()) {

            System.out.println("nuevo admin");

            Correo correo = new Correo("felixlvl@gmail.com");
            correoServices.crearCorreo(correo);


            Actividad actividad = new Actividad(Date.from(Instant.now()),"Demo", "detalle del demo", null );
            actividadServices.crearActividad(actividad);


            Gerente gerente = new Gerente("Felix", "Guzman", Date.from(Instant.now()), true, new HashSet<>(Arrays.asList(actividad)), "admin", "admin", new HashSet<>(Arrays.asList(correo)));

            gerenteRepository.save(gerente);
        }

    }

    public boolean buscarAdminDefault() {

        Gerente gerente = gerenteRepository.findByNombre("Felix");

        return gerente != null;

    }

}
