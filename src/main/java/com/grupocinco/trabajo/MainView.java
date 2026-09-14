package com.grupocinco.trabajo;

import com.grupocinco.saimon.TestView;
import com.vaadin.flow.component.Key;
import com.vaadin.flow.component.Text;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouterLink;

@Route
public class MainView extends VerticalLayout {

    public int unNumero = 0;


    public MainView(GreetService service) {

        RouterLink hypertexto = new RouterLink("Ir al chat", TestView.class);

        HorizontalLayout fila = new HorizontalLayout();

        Text label = new Text("0 clicks");

        Button helloButton = new Button("Clicky",
            e -> {
                unNumero++;
                label.setText( Integer.toString(unNumero) + " clicks" );
            }
        );
        helloButton.addThemeVariants(ButtonVariant.LUMO_PRIMARY);
        helloButton.addClickShortcut(Key.ENTER);

        fila.add(helloButton);
        fila.add(label);

        // styles.css.
        addClassName("centered-content");

        add(hypertexto, fila);
    }
}
