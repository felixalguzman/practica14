package com.tarea.practica.rutas;

import com.tarea.practica.entidades.Actividad;
import com.tarea.practica.repositorios.ActividadRepository;
import com.tarea.practica.servicios.ActividadServices;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.datepicker.DatePicker;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.incubator.Popup;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;
import org.springframework.beans.factory.annotation.Autowired;

@Route("")
public class Principal extends VerticalLayout {

    @Autowired
    private ActividadServices actividadServices;

    public Principal(){



        Button button = new Button("Nuevo evento", event -> {

            actividadServices.crearDefault();

            new Notification("nueva actividad").open();

        });

        VerticalLayout verticalLayout = new VerticalLayout();
        Div div = new Div();
        div.setId("div");
        verticalLayout.add(div);






        add(button);
        add(verticalLayout);
    }

}
