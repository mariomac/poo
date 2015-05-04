
import java.util.TreeSet;
import moo.agenda.Evento;
import moo.agenda.fecha.Fecha;
import moo.agenda.fecha.FechaException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mmacias
 */
public class Test {
    public static void main(String[] args) throws FechaException {
        TreeSet<Evento> cf = new TreeSet<Evento>();
        cf.add(Evento.fromString("25/5/1979 22:10 : Ir a casa de los papas"));
        cf.add(Evento.fromString("25/2/1949 22:10 : jurljurjlur"));
        cf.add(Evento.fromString("23/5/1919 21:14 : Cualquier cosa"));
        cf.add(Evento.fromString("25/5/1979 02:01 : Nacer"));
        
        for(Evento f : cf) {
            System.out.println(f);
        }
    }
    
}
