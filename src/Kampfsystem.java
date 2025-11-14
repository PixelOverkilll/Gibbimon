public class Kampfsystem {

  public void kampf() {
    munze munzewurf = new munze();
    int MunzeRDM = munzewurf.RDMMunze();

    Monsterwahl wahl = new Monsterwahl();
    wahl.Auswahl();


    if (MunzeRDM == 1) {
      System.out.println("Spieler 1 fängt an!\n");
    } else {
      System.out.println("Spieler 2 fängt an!\n");
    }

    while (true) {
      if (MunzeRDM == 1) {
// Spieler 1 greift an
        int DMGA = wahl.spieler1.RDMDMG(wahl.spieler1.DMG);
        wahl.spieler2.HP -= DMGA;
        if (wahl.spieler2.HP <= 0) wahl.spieler2.HP = 0;

        System.out.println(wahl.spieler1.Name + " greift " + wahl.spieler2.Name + " an: " + DMGA + " Schaden!");
        System.out.println(wahl.spieler2.Name + " hat noch " + wahl.spieler2.HP + " HP\n");

        if (wahl.spieler2.HP == 0) {
          System.out.println(wahl.spieler1.Name + " gewinnt!");
          break;
        }

        MunzeRDM = 2;

      } else {
// Spieler 2 greift an
        int DMGB = wahl.spieler2.RDMDMG(wahl.spieler2.DMG);
        wahl.spieler1.HP -= DMGB;
        if (wahl.spieler1.HP <= 0) wahl.spieler1.HP = 0;

        System.out.println(wahl.spieler2.Name + " greift " + wahl.spieler1.Name + " an: " + DMGB + " Schaden!");
        System.out.println(wahl.spieler1.Name + " hat noch " + wahl.spieler1.HP + " HP\n");

        if (wahl.spieler1.HP == 0) {
          System.out.println(wahl.spieler2.Name + " gewinnt!");
          break;
        }
        MunzeRDM = 1;
      }
    }
  }
}
