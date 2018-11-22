package com.tarea.practica.rutas;

import com.sun.xml.internal.ws.api.pipe.Fiber;
import com.tarea.practica.entidades.Actividad;
import com.tarea.practica.servicios.ActividadServices;
import com.tarea.practica.servicios.GerenteServices;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.server.Command;
import com.vaadin.flow.spring.annotation.UIScope;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.vaadin.addon.calendar.Calendar;
import org.vaadin.calendar.CalendarComponent;
import org.vaadin.calendar.data.AbstractCalendarDataProvider;

import java.util.Collection;
import java.util.Date;
import java.util.Optional;


@Route("")
public class Principal extends VerticalLayout {


    private ActividadServices actividadServices;


    private GerenteServices gerenteServices;

    public Principal(@Autowired ActividadServices actividadServices, @Autowired GerenteServices gerenteServices) {

        this.gerenteServices = gerenteServices;
        this.actividadServices = actividadServices;


        CalendarComponent<Actividad> calendario = new CalendarComponent<Actividad>();

        calendario.withItemDateGenerator(Actividad::getInicio);
        calendario.withItemLabelGenerator(Actividad::getNombre);

        gerenteServices.crearAdmin();

        calendario.setItems(actividadServices.buscarTodos());


        calendario.addEventClickListener(event -> {

            new Notification(event.getDetail().getNombre(), 2000, Notification.Position.TOP_END).open();

        });


        HorizontalLayout horizontalLayout = new HorizontalLayout();


        add(horizontalLayout);
        add(calendario);




    }



}
