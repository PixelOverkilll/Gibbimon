import java.util.Scanner;
public class Monsterwahl {
  String x;
  String x2;
  Monster spieler1 = null;
  Monster spieler2 = null;



  Scanner scanner = new Scanner(System.in);

  public void Auswahl() {
    System.out.println("wähle dein Gibbimon aus:\n 1: Magmert\n 2: Crapfler\n 3: Ivlor\n 4: Maxotron\n 5: Yudes\n 6: Vallus");
    x = scanner.nextLine();
    switch (x) {
      case "1", "Magmert", "magmert", "m":
        System.out.println("Du hast Magmert gewählt");
        spieler1 = new Monster("Magmert", 200, 5, 0.1, 1.5);
        break;

      case "2", "Crapfler", "crapfler", "c":
        System.out.println("Du hast Crapfler gewählt");
        spieler1 = new Monster("Crapfler", 200, 5, 0.1, 1.5);
        break;

      case "3", "Ivflor", "ivflor", "i":
        System.out.println("Du hast Ivflor gewählt");
        spieler1 = new Monster("Ivflor", 200, 5, 0.1, 1.5);
        break;

      case "4", "Maxotron", "maxotron", "g":
        System.out.println("Du hast Maxotron gewählt");
        spieler1 = new Monster("Maxotron", 200, 5, 0.1, 1.5);
        break;
      case "5", " Yudes", "yudes", "y":
        System.out.println("Du hast hat Yudes gewählt");
        spieler1 = new Monster("Yudes", 200, 5, 0.1, 1.5);
        break;
      case "6", "Vallus", "vallus", "v":
        System.out.println("Du hast Vallus gewählt");
        spieler1 = new Monster("Vallus", 200, 5, 0.1, 1.5);
        break;
    }

    System.out.println("wähle das Gegner Gibbimon aus:\n 1: Magmert\n 2: Crapfler\n 3: Ivlor\n 4: Maxotron\n 5: Yudes\n 6: Vallus");
    x2 = scanner.nextLine();
    switch (x2) {
      case "1", "Magmert", "magmert", "m":
        System.out.println("Dein Gegner hat Magmert gewählt");
        spieler2 = new Monster("Magmert", 200, 5, 0.1, 1.5);
        break;

      case "2", "Crapfler", "crapfler", "c":
        System.out.println("Dein Gegner hat Crapfler gewählt");
        spieler2 = new Monster("Crapfler", 200, 5, 0.1, 1.5);
        break;
      case "3", "Ivflor", "ivflor", "i":
        System.out.println("Dein Gegner hat Ivflor gewählt");
        spieler2 = new Monster("Ivflor", 200, 5, 0.1, 1.5);
        break;

      case "4", "Maxotron", "maxotron", "g":
        System.out.println("Dein Gegner hat Maxotron gewählt");
        spieler2 = new Monster("Maxotron", 200, 5, 0.1, 1.5);
        break;

      case "5", " Yudes", "yudes", "y":
        System.out.println("Dein Gegner hat Yudes gewählt");
        spieler2 = new Monster("Yudes", 200, 5, 0.1, 1.5);
        break;
      case "6", "Vallus", "vallus", "v":
        System.out.println("Dein Gegner hat Vallus gewählt");
        spieler2 = new Monster("Vallus", 200, 5, 0.1, 1.5);
        break;
    }
  }


}


