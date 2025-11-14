import java.util.random.RandomGenerator;


class Monster {
  public String Name;
  public int HP;
  public int DMG;
  public double CRIT;
  public double CRITM;

  RandomGenerator Random = RandomGenerator.getDefault();
  public Monster(String NAME, int HP, int DMG, double CRIT, double CRITM) {
    this.Name = NAME;
    this.HP = HP;
    this.DMG = DMG;
    this.CRIT = CRIT;
    this.CRITM = CRITM;
  }

  public int RDMDMG(int newDMG) {

    return Random.nextInt( DMG + 10, DMG + 31);
  }

  public boolean istCrit() {
    return Random.nextDouble(0,1) < CRIT;

  }
}
