package enchufes;

import enchufes.ifaces.Clavija;
import enchufes.ifaces.TomaCorriente;
import enchufes.impl.CalentadorAgua;
import enchufes.impl.Maquinilla;
import enchufes.impl.RegletaInterruptor;
import enchufes.impl.Televisor;
import enchufes.impl.TomaInterruptor;
import enchufes.impl.TomaPared;
import enchufes.impl.TomaTemporizador;

public class Main {

    public static void main(String[] args) {
        Televisor tv = new Televisor();
        TomaCorriente toma1 = new TomaPared();
        
        /* PRUEBA 1 */
        System.out.println("* Proporcionando corriente por la toma de pared");
        toma1.proporcionaCorriente();
        System.out.println("(No debería suceder nada)");
        
        toma1.enchufar(tv);
        tv.setCanal(3);
        System.out.println("* Enchufando TV en el canal 3 a la toma de pared");
        toma1.proporcionaCorriente();
        
        /* PRUEBA 2 */
        TomaInterruptor toma2 = new TomaInterruptor();
        Clavija maquinilla = new Maquinilla();
        toma2.enchufar(maquinilla);
        
        System.out.println("* Proporcionando corriente por una toma con interruptor desactivado,\n"
                + "  donde hay una maquinilla desenchufada");
        toma2.proporcionaCorriente();
        System.out.println("(No debería suceder nada)"); 
        
        System.out.println("* Activando el interruptor de la toma");
        toma2.setActivado(true);
        toma2.proporcionaCorriente();
        
        /* PRUEBA 3 */
        TomaTemporizador toma3 = new TomaTemporizador(18, 21);
        Clavija calentador = new CalentadorAgua();
        toma3.enchufar(calentador);
        System.out.println("* Toma con temporizador activada para funcionar de 18 a 21,\n"
                + "  con un calentador enchufado");
        System.out.println("* Son las 16");
        toma3.setHoraActual(16);
        toma3.proporcionaCorriente();
        System.out.println("(No debería suceder nada)"); 
        System.out.println("* Son las 19");
        toma3.setHoraActual(19);
        toma3.proporcionaCorriente();
        
        /* PRUEBA 4 */
        System.out.println("* Gracias a que las tomas y aparatos se conectan mediante"
                + "\n  las mismas interfaces, cambiamos los enchufes y los aparatos"
                + "\n  deberían funcionar igual");
        
        toma1.enchufar(calentador);
        toma2.enchufar(tv);
        toma3.enchufar(maquinilla);
        toma1.proporcionaCorriente();
        toma2.proporcionaCorriente();
        toma3.proporcionaCorriente();
        
        
        /* PRUEBA 5 */
        TomaCorriente pared = new TomaPared();
        RegletaInterruptor regleta = new RegletaInterruptor();
        
        regleta.enchufar(tv);
        regleta.enchufar(maquinilla);
        regleta.enchufar(calentador);
        
        pared.enchufar(regleta);
   
        regleta.setActivado(false);
        pared.proporcionaCorriente();
        
        regleta.setActivado(true);
        pared.proporcionaCorriente();

        
    }
    
}
