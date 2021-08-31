package umm2101;

public class BowlingGame {
  private BowlingFrame[] frames;

  public BowlingGame() {
    this.frames = new BowlingFrame[10];
    for (int i=0; i<10; i++) {
      frames[i] = new BowlingFrame();;
    }
  }

  public int whichFrame() {
    // I want this to tell me which frame I'm on
    return 0;
  }

  public boolean addRoll(int pins) {
    // I want this to add a roll, but only if it's a legitimate possible value
    // Somehow, we need to know which roll of the frame it is too
    // This is certainly not finished
    frames[0].firstRoll(pins);
    return true;
  }

  public int getScore() {
    return 0;
  }
  
}
