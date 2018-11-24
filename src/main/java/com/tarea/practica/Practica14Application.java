package com.tarea.practica;

import com.tarea.practica.servicios.GerenteServices;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Practica14Application {

    public static void main(String[] args) {
     ApplicationContext context = SpringApplication.run(Practica14Application.class, args);

        GerenteServices gerenteServices = (GerenteServices) context.getBean("gerenteServices");
        gerenteServices.crearAdmin();
    }
}
