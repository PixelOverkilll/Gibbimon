import java.util.random.RandomGenerator;


class Monster {
  public String Name;
  public int HP;
  public double CRIT;
  public double CRITM;


  public Attacke[] attacken = new Attacke[4];

  RandomGenerator Random = RandomGenerator.getDefault();

  public Monster(String NAME, int HP, Attacke[] attacken,  double CRIT, double CRITM) {
    this.Name = NAME;
    this.HP = HP;
    this.attacken = attacken;
    this.CRIT = CRIT;
    this.CRITM = CRITM;

  }


  public boolean istCrit() {
    return Random.nextDouble(0, 1) < CRIT;

  }

  public void zeigeAttacken() {
    for (int i = 0; i < attacken.length; i++) {
      if (attacken[i] != null) {
        System.out.println((i + 1) + ": " + attacken[i].NAME + " (DMG: " + attacken[i].DMG + ")");
      }
    }
  }
}
