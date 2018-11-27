package com.tarea.practica.rutas;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class EnviarCorreos {

    @Scheduled(fixedRate = 5000)
    public void enviarCorreos() {

        System.out.println("cada 5 seg");

    }
}
