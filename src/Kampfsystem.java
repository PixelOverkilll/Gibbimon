import java.util.Random;
import java.util.Scanner;

public class Kampfsystem {

Scanner scanner = new Scanner(System.in);

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
        System.out.println(wahl.spieler1.Name + ", wähle deine Attacke:");
        wahl.spieler1.zeigeAttacken();
        // Spieler 1 greift an
        int auswahl = scanner.nextInt() - 1;
        Attacke gewaehlteAttacke = wahl.spieler1.attacken[auswahl];

        int DMGA = gewaehlteAttacke.DMG;

        if (gewaehlteAttacke.trifft()) {
          gewaehlteAttacke.playSound();
        } else {
          System.out.println(gewaehlteAttacke.NAME + " hat verfehlt!");
          DMGA = 0;
        }
        if (wahl.spieler1.istCrit()) {
          DMGA = (int) (DMGA * wahl.spieler1.CRITM);
          System.out.println("Crit!💥");
        }

        wahl.spieler2.HP -= DMGA;
        if (wahl.spieler2.HP <= 0) wahl.spieler2.HP = 0;

        System.out.println(wahl.spieler1.Name + " setzt " + gewaehlteAttacke.NAME + " ein: " + DMGA + " Schaden!");
        System.out.println(wahl.spieler2.Name + " hat noch " + wahl.spieler2.HP + " HP\n");

        if (wahl.spieler2.HP == 0) {
          System.out.println(wahl.spieler1.Name + " gewinnt!");
          break;
        }

        MunzeRDM = 2;

      } else {
        // Spieler 2 greift an

        System.out.println(wahl.spieler2.Name + ", wähle deine Attacke:");
        wahl.spieler2.zeigeAttacken();

        int auswahl = scanner.nextInt() - 1;
        Attacke gewaehlteAttacke = wahl.spieler2.attacken[auswahl];

        int DMGB = gewaehlteAttacke.DMG;
        if (!gewaehlteAttacke.trifft()) {
          System.out.println(gewaehlteAttacke.NAME + " hat verfehlt!");
          DMGB = 0;
        }

        if (wahl.spieler2.istCrit()) {
          DMGB = (int) (DMGB * wahl.spieler2.CRITM);
          System.out.println("Crit!💥");
        }

        wahl.spieler1.HP -= DMGB;
        if (wahl.spieler1.HP <= 0) wahl.spieler1.HP = 0;

        System.out.println(wahl.spieler2.Name + " setzt " + gewaehlteAttacke.NAME + " ein: " + DMGB + " Schaden!");
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
