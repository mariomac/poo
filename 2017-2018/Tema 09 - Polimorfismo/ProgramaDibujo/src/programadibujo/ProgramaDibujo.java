package programadibujo;

import figuras.*;
import javax.swing.JFrame;

public class ProgramaDibujo {

    public static void main(String[] args) {
               
        PlanoDibujo plano = new PlanoDibujo();
        
        //plano.agregaFigura(new Figura());
        plano.agregaFigura(new Circulo(50, 50, 400));
        plano.agregaFigura(new Circulo(140, 120, 50));
        plano.agregaFigura(new Circulo(290, 120, 50));
        plano.agregaFigura(new Rectangulo(120, 300, 270, 40));
        
        plano.dibujarPlano();
        
        
    }
}
