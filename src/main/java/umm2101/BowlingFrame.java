package umm2101;

public class BowlingFrame {

  private int[] rolls = new int[3];

  public boolean firstRoll(int pins) {
    // This does not really work, but it will compile
    rolls[0] = pins;
    return true;
  }

}
