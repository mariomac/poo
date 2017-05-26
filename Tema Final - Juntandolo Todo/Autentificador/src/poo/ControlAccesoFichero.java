
package poo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * Clase que implementa la interfaz Control Acceso y valida las contraseñas contra un fichero de texto
 * donde las contraseñas están "hasheadas".
 */
public class ControlAccesoFichero implements ControlAcceso {

    private static final String FICHERO_USUARIOS = "usuarios.txt";

    // clave: usuario, valor: hash SHA1 contraseña
    private Map<String, String> claves = new HashMap<>();

    public ControlAccesoFichero() {
        try {
            FileReader fichero = new FileReader(FICHERO_USUARIOS);
            BufferedReader lineReader = new BufferedReader(fichero);
            String usu = lineReader.readLine();
            while (usu != null) {
                String cont = lineReader.readLine();
                claves.put(usu, cont);
                usu = lineReader.readLine();
            }
            fichero.close();
            lineReader.close();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    public void valida(String usuario, String contraseña) throws AuthException {
        if (!claves.containsKey(usuario)) {
            throw new AuthException("Usuario invalido");
        }
        String cont = claves.get(usuario);
        if (!cont.equals(Hash.hashea(contraseña))) {
            throw new AuthException("Contraseña incorrecta");
        }
    }

    public void añadir(String usuario, String contraseña, String contraseñaRepetida) throws AuthException {
        if (claves.containsKey(usuario)) {
            throw new AuthException("Usuario ya existe");
        }
        if (contraseña.length() < 6) {
            throw new AuthException("Contraseña demasiado corta");
        }
        if (!contraseña.equals(contraseñaRepetida)) {
            throw new AuthException("Contraseñas no coinciden entre si.");
        }

        /*
         Guardar las contraseñas "en crudo" es un error grave de seguridad. La mejor manera es "hashearlas"
         con una función como SHA, y comparar luego los "hashes".
         */
        String contraseñaHasheada = Hash.hashea(contraseña);
        claves.put(usuario, contraseñaHasheada);

        try {
            FileWriter fichero = new FileWriter(FICHERO_USUARIOS, true);
            fichero.write('\n' + usuario);
            fichero.write('\n' + contraseñaHasheada);
            fichero.close();
        } catch (IOException ex) {
            System.out.println("Error de fichero. ABORTANDO.");
        }

    }

}
