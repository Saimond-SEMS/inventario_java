package com.grupocinco.saimon;

import java.util.ArrayList;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;

@Route("ahoy")
public class TestView extends VerticalLayout{

	ArrayList<ElementoMensaje> mensajes = new ArrayList<ElementoMensaje>();

	public TestView(){

		// el grid con una lista por defecto
		Grid<ElementoMensaje> grid = new Grid<>(ElementoMensaje.class);
		mensajes.add( new ElementoMensaje( "Lorem Ipsum", "Who?") );
		mensajes.add( new ElementoMensaje( "1234567890 1234567890 1234567890", "Querty") );
		mensajes.add( new ElementoMensaje( "PPPAKSAKPKKAP\nadsda\nasd", "W.D") );				
		mensajes.add( new ElementoMensaje( "A", "CalzonesDeFuego123") );
		grid.setItems( mensajes );

		// campo de texto para el usuario
		TextField textUsuario = new TextField();
		textUsuario.addClassName("bordered");

		// campo de texto para el mensaje
		TextField textMensaje = new TextField();
		textMensaje.addClassName("bordered");

		Button botonEnter = new Button( "Enviar",
			//	lambdas, porque no sé como usar events
			e -> {
				mensajes.add( new ElementoMensaje( textUsuario.getValue(), textMensaje.getValue() ));
				grid.getDataProvider().refreshAll();
            }
		);

		HorizontalLayout fila1 = new HorizontalLayout();
		fila1.add("Usuario");
		fila1.add(textUsuario);

		HorizontalLayout fila2 = new HorizontalLayout();
		fila2.add("mensaje");
		fila2.add(textMensaje);
		fila2.add(botonEnter);

		//	finalmente poner todo en pantalla
		add(fila1, fila2);
		
		add( "Chatbox" );
		add(grid);
	}
}
