import java.util.random.RandomGenerator;
public class munze {
  RandomGenerator Random = RandomGenerator.getDefault();
  public int RDMMunze() {
    return Random.nextInt( 1, 3);
  }
}
