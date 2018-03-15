package info.macias.poo;

import java.io.FileReader;
import java.io.FileWriter;

public class GestorPalmares {

    public static void main(String[] args) {
        try {
            FileReader archivo = new FileReader("titulos.txt");
            Equipo recre = Equipo.cargar(archivo);
            archivo.close();
            
            recre.mostrarEnPantalla();
            recre.añadir(new Titulo(2016,"Título de prueba"));
            
            FileWriter archivoSalida = new FileWriter("titulos.txt");
            recre.grabar(archivoSalida);
            archivo.close();
            
        } catch(Exception e) {
            System.err.println("Error accediendo o guardando datos del equipo: " + e.getMessage());
            e.printStackTrace();
        }
    }
    
}
