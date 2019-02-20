package programadibujo;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JFrame;


public class Lienzo extends JFrame {
    public static final Lienzo INSTANCIA = new Lienzo("Ejemplo dibujo");
    
    private BufferedImage buffer;
    private Graphics2D bufferGraphics;
    protected Lienzo(String titulo) {
        super(titulo);
        setSize(640, 480);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        buffer = new BufferedImage(640,480,BufferedImage.TYPE_INT_RGB);
        setVisible(true);
        bufferGraphics = buffer.createGraphics();
        bufferGraphics.setColor(Color.white);
        bufferGraphics.fillRect(0,0,640,480);
        
        Timer t = new Timer();
        t.scheduleAtFixedRate(new TimerTask() {

            @Override
            public void run() {
                repaint();
            }
        }, 100, 100);        
    }

    public Graphics getBuffer() {
        return bufferGraphics;
    }
    
    @Override
    public void paint(Graphics g) {
        g.drawImage(buffer, 0, 0, null);
    }
    
    
    

}
