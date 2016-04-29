/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info.macias.poo.es.streams;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 *
 * @author mmacias
 */
public class Ej3OutputStream {
    public static void escrituraBasica() {
        System.out.println("*** EJEMPLO 3: OutputStream básico");
        try {
            ByteArrayOutputStream os = new ByteArrayOutputStream();
            os.write(1);
            os.write(2);
            os.write(3);
            os.write(4);
            byte[] escrito = os.toByteArray();
            os.close();
            for(byte b : escrito) {
                System.out.println("escrito = " + b);
            }
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
    public static void escrituraBuffer() {
        System.out.println("*** EJEMPLO 3: OutputStream con buffer");
        try {
            ByteArrayOutputStream os = new ByteArrayOutputStream();
            os.write(new byte[] {1,2,3,4});       
            os.write(new byte[] {5,6,7,8});       
            byte[] escrito = os.toByteArray();
            for(byte b : escrito) {
                System.out.println("escrito = " + b);
            }
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}
