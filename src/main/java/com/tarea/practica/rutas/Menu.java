package com.tarea.practica.rutas;

import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.router.RouterLink;

public class Menu extends HorizontalLayout {

    public Menu(){

        RouterLink calendario1 = new RouterLink("Calendario", Principal.class);

        RouterLink opcionesLabel = new RouterLink("Opciones", Opciones.class);


        HorizontalLayout horizontalLayout1 = new HorizontalLayout();
        horizontalLayout1.setSizeFull();
        add(calendario1, horizontalLayout1 ,opcionesLabel);
        setSizeFull();

    }
}
