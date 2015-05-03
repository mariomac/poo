
import java.util.TreeSet;
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
        TreeSet<Fecha> cf = new TreeSet<Fecha>();
        cf.add(new Fecha(25,5,2015,10,34));
        cf.add(new Fecha(25,12,2015,10,34));
        cf.add(new Fecha(29,2,2016,10,34));
        cf.add(new Fecha(25,5,2015,9,4));
        
        for(Fecha f : cf) {
            System.out.println("f = " + f);
        }
    }
    
}
