package moo.agenda.ui;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.List;
import java.util.Scanner;
import moo.agenda.ControladorEventos;
import moo.agenda.Evento;
import moo.agenda.fecha.Fecha;
import moo.agenda.fecha.FechaException;

public class InterfazUsuario {
    private static final String ARCHIVO = "registro.bin";
    private Scanner teclado = new Scanner(System.in);
    private ControladorEventos controlador = new ControladorEventos();

    public Evento leerEvento() {
        boolean fechaIntroducida = false;
        Fecha f = null;
        while(!fechaIntroducida) {
            try {
                System.out.print("Fecha (dd/mm/aaaa): ");
                String[] trozosFecha = teclado.nextLine().split("/");
                int dia = Integer.parseInt(trozosFecha[0]);
                int mes = Integer.parseInt(trozosFecha[1]);
                int anyo = Integer.parseInt(trozosFecha[2]);
                System.out.print("Hora (hh:mm): ");
                String[] trozosHora = teclado.nextLine().split(":");
                int hora = Integer.parseInt(trozosHora[0]);
                int minuto = Integer.parseInt(trozosHora[1]);
                f = new Fecha(dia, mes, anyo, hora, minuto);
                fechaIntroducida = true;
            } catch(Exception e) {
                System.out.println("Error introduciendo fecha: " + e.getMessage());
            }           
        }
        System.out.print("Descripcion evento: ");
        String descripcion = teclado.nextLine();
        return new Evento(f, descripcion);
    }
    
    public void verEventos() {
        try {
            System.out.print("Fecha (dd/mm/aaaa): ");
            String[] trozosFecha = teclado.nextLine().split("/");
            int dia = Integer.parseInt(trozosFecha[0]);
            int mes = Integer.parseInt(trozosFecha[1]);
            int anyo = Integer.parseInt(trozosFecha[2]);
            List<Evento> eventos = controlador.eventosDelDia(new Fecha(dia,mes,anyo));
            if(eventos.size() == 0) {
                System.out.println("No hay eventos para el día " +
                        dia + "/" + mes + "/" + anyo);
            } else {
                System.out.println("Los eventos programados para el día " +
                        dia + "/" + mes + "/" + anyo);
                for(Evento e : eventos) {
                    System.out.println("\t"+e.toString());
                }
            }
        } catch(FechaException e) {
            System.out.println("Error en la fecha: " + e.getMessage());
        }
    }
    
    public void iniciar() {
        try {
            FileInputStream archivoCarga = new FileInputStream(ARCHIVO);          
            controlador.cargarEventos(archivoCarga);
            archivoCarga.close();
        } catch(Exception e) {
            System.out.println("Error cargando eventos de disco: " + e.getMessage());
            System.out.println("Continuando con una agenda vacía...");
        }
        
        String comando = "";
        while(!comando.equals("salir")) {
            System.out.print("Comando: ");
            comando = teclado.nextLine();
            if(comando.equals("nuevo")) {
                controlador.add(leerEvento());
            } else if(comando.equals("ver")) {
                verEventos();
            } else if(comando.equals("?")) {
                System.out.println("Comandos disponibles: ");
                System.out.println("\tnuevo\t- Inserta un nuevo evento");
                System.out.println("\tver\t- Ver los eventos de un día");
                System.out.println("\tsalir\t- finalizar programa");
            } else if(!comando.equals("salir")) {
                System.out.println("Comando incorrecto. Escribe ? para ayuda");
            }
        }
        
        try {
            FileOutputStream fos = new FileOutputStream(ARCHIVO);
            controlador.guardarEventos(fos);
            fos.close();
        } catch(Exception e) {
            System.out.println("Error guardando eventos: " + e.getMessage());
        }        
    }
}
