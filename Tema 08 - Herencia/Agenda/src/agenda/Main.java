/*------------------------------------------------------------------------------
 * Este código está distribuido bajo una licencia del tipo BEER-WARE.
 * -----------------------------------------------------------------------------
 * Mario Macías Lloret escribió este archivo. Teniendo esto en cuenta,
 * puedes hacer lo que quieras con él: modificarlo, redistribuirlo, venderlo,
 * etc, aunque siempre deberás indicar la autoría original en tu código.
 * Además, si algún día nos encontramos por la calle y piensas que este código
 * te ha sido de utilidad, estás obligado a invitarme a una cerveza (a ser
 * posible, de las buenas) como recompensa por mi contribución.
 * -----------------------------------------------------------------------------
 */
package agenda;

public class Main {

    public static void main(String[] args) {
        Agenda ag = generarAgenda();
        ag.setHoy("27/03/2015");       
        ag.mostrarHoy();
        System.out.println("Cambiando día a 30/03...");
        ag.setHoy("30/03/2015");
        ag.mostrarHoy();
    }
    
    public static Agenda generarAgenda() {
        Agenda ag = new Agenda();
        Dia d = new Dia("27/03/2015");
        d.añadirEvento(new Evento("Cumpleaños de Ana"));
        d.añadirEvento(new Teleconferencia("http://www.skype.com/room?conferenceid=1234324"
                            , 12,15,45, "Discusión del nuevo proyecto con la Comisión Europea"));
        d.añadirEvento(new Cita(14,30,60,"Comer con Juan"));
        d.añadirEvento(new Cita(18,30,90,"Clase de guitarra"));
        ag.añadirDia(d);
        
        d = new Dia("28/03/2015");
        d.añadirEvento(new Evento("Cumpleaños de Ana"));
        d.añadirEvento(new Cita(14,30,60,"Comer con Juan"));
        d.añadirEvento(new Cita(18,30,90,"Clase de guitarra"));
        ag.añadirDia(d);

        d = new Dia("29/03/2015");
        d.añadirEvento(new Evento("Domingo de ramos"));
        d.añadirEvento(new Evento("Cumpleaños de Antonio. Felicitar!!"));
        d.añadirEvento(new Cita(11,30,60,"Ir en bici"));
        d.añadirEvento(new Cita(19,30,120,"Partido de futbol"));
        ag.añadirDia(d);  
        
        return ag;
    }
    
}
