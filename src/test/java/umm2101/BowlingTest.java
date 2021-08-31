package umm2101;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

/**
 * Unit test for bowling.
 */
public class BowlingTest 
{
    /**
     * An example test.
     */
    @Test
    public void testFirstRoll()
    {
      BowlingGame myGame = new BowlingGame();
      assertEquals(0, myGame.getScore());
      myGame.addRoll(5);
      assertEquals(5, myGame.getScore());
    }
}