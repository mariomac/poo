
package poo;

/**
 * Clase auxiliar que usa las clases disponibles en java para "hashear" de manera segura el texto que le pasemos.
 */
public class Hash {
    /* Retorna un hash a partir de un tipo y un texto */
    public static String hashea(String txt) {
        try {
            java.security.MessageDigest md = java.security.MessageDigest
                    .getInstance("SHA1");
            byte[] array = md.digest(txt.getBytes());
            StringBuffer sb = new StringBuffer();
            for (int i = 0; i < array.length; ++i) {
                sb.append(Integer.toHexString((array[i] & 0xFF) | 0x100)
                        .substring(1, 3));
            }
            return sb.toString();
        } catch (java.security.NoSuchAlgorithmException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }
}
