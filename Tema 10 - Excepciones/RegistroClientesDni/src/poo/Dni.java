package poo;

import ex.DniIncorrectoException;

/**
 * Clase que representa un DNI. Implementa la interfaz Comparable para poder poner
 * los DNI en clases que ordenan los elementos insertados (TreeMap, TreeSet...)
 */
public class Dni implements Comparable<Dni> {
    private long num;
    private char letra;

    public Dni(long num, char letra) throws DniIncorrectoException {
        letra = Character.toUpperCase(letra);
        comprueba(num, letra);
        this.num = num;
        this.letra = letra;
    }

    // Esta constante se usa para decidir qué letra corresponde a cada número
    private static final char[] LETRAS = "TRWAGMYFPDXBNJZSQVHLCKE".toCharArray();

    /* Método de ayuda para comprobar si un DNI corresponde con una letra.
       (Para saber cómo se hace, buscar página del Ministerio de Interior donde se
       explica).
       Si es válido, el método termina sin retornar nada.
       Si no es válido, lanza una excepción DniIncorrectoException.
     */
    private static void comprueba(long num, char letra)
            throws DniIncorrectoException {
        char correcta = LETRAS[(int) (num % 23)];
        if (letra != correcta) {
            throw new DniIncorrectoException(num, letra);
        }
    }

    public long getNum() {
        return num;
    }

    public char getLetra() {
        return letra;
    }

    public String toString() {
        return num + "-" + letra;
    }

    /**
     * El método "compareTo" de la Interfaz Comparable compara el orden de 'this' con respecto al
     * objeto de la referencia 'o' que se pasa por parámetro.
     *
     * Este método es llamado por TreeSet, TreeMap, u otros métodos como Collections.sort(lista)
     * para saber cómo debe ordenar los elementos.
     *
     * Retorna un número negativo, 0 o positivo si this es anterior, igual o posterior a 'o',
     * respectivamente
     */
    public int compareTo(Dni o) {
        return (int) (num - o.num);
    }


}
