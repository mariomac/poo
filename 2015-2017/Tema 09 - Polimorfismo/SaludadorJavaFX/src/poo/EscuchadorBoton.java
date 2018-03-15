package poo;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;

public class EscuchadorBoton implements EventHandler<ActionEvent>{

    private TextField nombre;
    public EscuchadorBoton(TextField nombre) {
        this.nombre = nombre;
    }
    public void handle(ActionEvent event) {
        String elNombre = nombre.getText();
        Alert alert = new Alert(Alert.AlertType.INFORMATION,
                "Hola " + elNombre + "!"
        );
        alert.showAndWait();
    }
    
    
    
}
