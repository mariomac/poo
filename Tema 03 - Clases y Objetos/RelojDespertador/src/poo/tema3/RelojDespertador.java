package poo.tema3;

public class RelojDespertador {
  int h, m, s;
  int ha, ma, sa;
  boolean alarmaActiva;
  
  // Asume que la alarma está desactivada incialmente
  public RelojDespertador(int h, int m, int s) {
    this.h = h;
    this.m = m;
    this.s = s;
    alarmaActiva = false;
  }
  
  // Asume que la alarma está activada desde el inicio
  public RelojDespertador(int h, int m, int s, int ha, int ma, int sa) {
    this.h = h;
    this.m = m;
    this.s = s;
    this.ha = ha;
    this.ma = ma;
    this.sa = sa;
    alarmaActiva = true;
  }
  
  // El reloj solo funcionara bien si este
  // metodo se llama cada segundo exacto.
  void tickSegundo() {
    if (alarmaActiva &&
            h == ha && m == ma && s == sa) {
      System.out.println("Riiiiinnnggg!!!");
    }    
    s++;
    if (s >= 60) {
      s = 0;
      m++;
      if (m >= 60) {
        m = 0;
        h++;
        if (h >= 24) {
          h = 0;
        }
      }
    }
  }
  
  public String toString() {
    // Equivale al sprintf de C
    return String.format("%02d:%02d:%02d", h, m, s);
  }
  
}
