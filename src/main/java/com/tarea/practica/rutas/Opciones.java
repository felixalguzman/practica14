package com.tarea.practica.rutas;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;

@Route("opciones")
public class Opciones extends VerticalLayout {

    public Opciones(){

        TextField textField = new TextField("Nombre");

        Menu menu = new Menu();
        
        add(menu);

        add(textField);
    }

}
