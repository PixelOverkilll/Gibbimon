import java.util.Scanner;
public class Monsterwahl {
  String x;
  String x2;
  Monster spieler1 = null;
  Monster spieler2 = null;



  Scanner scanner = new Scanner(System.in);

  public void Auswahl() {
    System.out.println("wähle dein Gibbimon aus:\n 1: Magmert\n 2: Crapfler\n 3: Ivlor\n 4: Maxotron\n 5: Yudes\n 6: Vallus\n 7: Nilson");
    x = scanner.nextLine();
    switch (x) {
      case "1", "Magmert", "magmert", "m":
        System.out.println("Du hast Magmert gewählt");
        Attacke[] magmertAttacken = {
          new Attacke("Fiery Arrow", 40, "Feuer", 1.0, null),
          new Attacke("Flame Dash", 25, "Feuer", 1.0, null),
          new Attacke("Meteor Crash", 50, "Boden", 1.0, null),
          new Attacke("Ancient Power", 30, "Stein", 1.0, null)
        };
        spieler1 = new Monster("Magmert", 200, magmertAttacken, 0.1, 1.5);
        break;
      case "2", "Crapfler", "crapfler", "c":
        System.out.println("Du hast Crapfler gewählt");
        Attacke[] crapflerAttacken = {
          new Attacke("Drill Run", 40, "Boden", 1.0, null),
          new Attacke("Ground Smash", 25,"Boden", 1.0,null),
          new Attacke("High Fall", 50, "Space", 1.0,null),
          new Attacke("Iron Claw", 30, "Eisen", 1.0,null)
        };
        spieler1 = new Monster("Crapfler", 200, crapflerAttacken, 0.1, 1.5);
        break;

      case "3", "Ivflor", "ivflor", "i":
        System.out.println("Du hast Ivflor gewählt");
        Attacke[] ivflorAttacken = {
          new Attacke("Poison Punch", 40, "Gift", 1.0,null),
          new Attacke("Earth Eater", 25,"Boden", 1.0,null),
          new Attacke("Life Sucker", 30, "Gift", 1.0,null),
          new Attacke("Ukrain Destruction", 50, "Ukrainer", 1.0,null)

        };
        spieler1 = new Monster("Ivflor", 200, ivflorAttacken, 0.1, 1.5);
        break;

      case "4", "Maxotron", "maxotron", "g":
        System.out.println("Du hast Maxotron gewählt");
        Attacke[] maxotronAttacken = {
          new Attacke("Giga Impact", 40, "Normal", 1.0,null),
          new Attacke("Ground Smash", 25,"Boden", 1.0, null),
          new Attacke("Destruction Missle", 50, "Stahl", 1.0, null),
          new Attacke("Reflection Blast", 30, "Space", 1.0, null)
        };
        spieler1 = new Monster("Maxotron", 200, maxotronAttacken, 0.1, 1.5);
        break;
      case "5", " Yudes", "yudes", "y":
        System.out.println("Du hast hat Yudes gewählt");
        Attacke[] yudesAttacken = {
          new Attacke("Piano Waves", 40, "Psycho", 1.0, null),
          new Attacke("Smog", 25,"Gift", 1.0,null),
          new Attacke("Pen Throw", 50, "Kampf", 1.0,null),
          new Attacke("50/50", 30, "50/50", 0.5, "./sounds/Yunus.wav")
        };
        spieler1 = new Monster("Yudes", 200, yudesAttacken, 0.1, 1.5);
        break;
      case "6", "Vallus", "vallus", "v":
        System.out.println("Du hast Vallus gewählt");
        Attacke[] vallusAttacken = {
          new Attacke("Barkleys Peppermint", 40, "Gift", 1.0,null),
          new Attacke("Barkleys Cinnamon", 25,"Eis", 1.0,null),
          new Attacke("Shock Eyes", 50, "Elektro", 1.0,null),
          new Attacke("Biohazard", 30, "Gift", 1.0,null)
        };
        spieler1 = new Monster("Vallus", 200, vallusAttacken, 0.1, 1.5);
        break;
      case "7", "Nilson", "nilson", "n":
        System.out.println("Du hast Nilson gewählt");
        Attacke[] nilsonAttacken = {
          new Attacke("Electro Circuit", 40, "Elektro", 1.0,null),
          new Attacke("Voltswitch", 25,"Elektro", 1.0,null),
          new Attacke("Magnetic END", 50, "Stahl", 1.0,null),
          new Attacke("Plasma Canon", 30, "Space", 1.0,null)
        };
        spieler1 = new Monster("Nilson", 200, nilsonAttacken, 0.1, 1.5);
        break;
    }

    System.out.println("wähle das Gegner Gibbimon aus:\n 1: Magmert\n 2: Crapfler\n 3: Ivlor\n 4: Maxotron\n 5: Yudes\n 6: Vallus\n 7: Nilson");
    x2 = scanner.nextLine();
    switch (x2) {
      case "1", "Magmert", "magmert", "m":
        System.out.println("Du hast Magmert gewählt");
        Attacke[] magmertAttacken = {
          new Attacke("Fiery Arrow", 40, "Feuer", 1.0, null),
          new Attacke("Flame Dash", 25, "Feuer", 1.0, null),
          new Attacke("Meteor Crash", 50, "Boden", 1.0, null),
          new Attacke("Ancient Power", 30, "Stein", 1.0, null)
        };
        spieler2 = new Monster("Magmert", 200, magmertAttacken, 0.1, 1.5);
        break;
      case "2", "Crapfler", "crapfler", "c":
        System.out.println("Dein Gegner hat Crapfler gewählt");
        Attacke[] crapflerAttacken = {
          new Attacke("Drill Run", 40, "Boden", 1.0, null),
          new Attacke("Ground Smash", 25,"Boden", 1.0,null),
          new Attacke("High Fall", 50, "Space", 1.0,null),
          new Attacke("Iron Claw", 30, "Eisen", 1.0,null)
        };

        spieler2 = new Monster("Crapfler", 200, crapflerAttacken, 0.1, 1.5);
        break;
    case "3", "Ivflor", "ivflor", "i":
      System.out.println("Dein Gegner hat Ivflor gewählt");
      Attacke[] ivflorAttacken = {
        new Attacke("Poison Punch", 40, "Gift", 1.0,null),
        new Attacke("Earth Eater", 25,"Boden", 1.0,null),
        new Attacke("Life Sucker", 30, "Gift", 1.0,null),
        new Attacke("Ukrain Destruction", 50, "Ukrainer", 1.0,null)
      };
      spieler2 = new Monster("Ivflor", 200, ivflorAttacken, 0.1, 1.5);
      break;

    case "4", "Maxotron", "maxotron", "g":
      System.out.println("Dein Gegner hat Maxotron gewählt");
      Attacke[] maxotronAttacken = {
        new Attacke("Giga Impact", 40, "Normal", 1.0,null),
        new Attacke("Ground Smash", 25,"Boden", 1.0, null),
        new Attacke("Destruction Missle", 50, "Stahl", 1.0, null),
        new Attacke("Reflection Blast", 30, "Space", 1.0, null)
      };
      spieler2 = new Monster("Maxotron", 200, maxotronAttacken, 0.1, 1.5);
      break;

    case "5", " Yudes", "yudes", "y":
      System.out.println("Dein Gegner hat Yudes gewählt");
      Attacke[] yudesAttacken = {
        new Attacke("Piano Waves", 40, "Psycho", 1.0, null),
        new Attacke("Smog", 25,"Gift", 1.0,null),
        new Attacke("Pen Throw", 50, "Kampf", 1.0,null),
        new Attacke("50/50", 30, "50/50", 0.5, "./sounds/Yunus.wav")
      };
      spieler2 = new Monster("Yudes", 200, yudesAttacken, 0.1, 1.5);
      break;
    case "6", "Vallus", "vallus", "v":
      System.out.println("Dein Gegner hat Vallus gewählt");
      Attacke[] vallusAttacken = {
        new Attacke("Barkleys Peppermint", 40, "Gift", 1.0, null),
        new Attacke("Barkleys Cinnamon", 25,"Eis", 1.0, null),
        new Attacke("Shock Eyes", 50, "Elektro", 1.0, null),
        new Attacke("Biohazard", 30, "Gift", 1.0, null)
      };
      spieler2 = new Monster("Vallus", 200, vallusAttacken, 0.1, 1.5);
      break;
      case "7", "Nilson", "nilson", "n":
        System.out.println("Du hast Nilson gewählt");
        Attacke[] nilsonAttacken = {
          new Attacke("Electro Circuit", 40, "Elektro", 1.0, null),
          new Attacke("Voltswitch", 25,"Elektro", 1.0, null),
          new Attacke("Magnetic END", 50, "Stahl", 1.0, null),
          new Attacke("Plasma Canon", 30, "Space", 1.0, null)
        };
        spieler2 = new Monster("Nilson", 200, nilsonAttacken, 0.1, 1.5);
        break;
    }
  }
}


