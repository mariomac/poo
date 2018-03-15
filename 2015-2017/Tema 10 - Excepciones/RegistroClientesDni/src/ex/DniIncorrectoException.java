package ex;

public class DniIncorrectoException extends Exception {
    private long num;
    private char letra;

    public DniIncorrectoException(long num, char letra) {
        this.num = num;
        this.letra = letra;
    }

    public long getNum() {
        return num;
    }

    public char getLetra() {
        return letra;
    }


}
