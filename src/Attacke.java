import javax.sound.sampled.*;
import java.io.File;


public class Attacke {
  public String NAME;
  public int DMG;
  public String TYP;
  public double ACC;
  public String Sound;

  public Attacke(String NAME, int DMG, String TYP, double ACC,  String Sound) {
    this.NAME = NAME;
    this.DMG = DMG;
    this.TYP = TYP;
    this.ACC = ACC;
    this.Sound = Sound;
  }
  public boolean trifft() {
    return Math.random() < ACC;
  }
  public void playSound() {
    if (Sound != null) {
      try {
        AudioInputStream audio = AudioSystem.getAudioInputStream(new File(Sound));
        Clip clip = AudioSystem.getClip();
        clip.open(audio);
        clip.start();
      } catch (Exception e) {
        System.out.println("Sound konnte nicht abgespielt werden");
      }
    }
  }
}
