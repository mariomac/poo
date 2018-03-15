package poo;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class MiAplicacion extends Application {

    public void start(Stage primaryStage) throws Exception {
        VBox parent = new VBox();
        Scene escena = new Scene(parent,500,250);
        primaryStage.setScene(escena);
        primaryStage.setTitle("Demo JavaFX");
        
        Label etiqueta = new Label("Escribe tu nombre:");
        TextField nombre = new TextField();
        Button boton = new Button("Saludar");
        boton.setOnAction(new EscuchadorBoton(nombre));
        
        parent.getChildren().add(etiqueta);
        parent.getChildren().add(nombre);
        parent.getChildren().add(boton);
        
        primaryStage.show();
    }
    
    
    public static final void main(String[] args) {
        launch(args);
    }    
}
