package comp5911m.cwk1;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;


/**
 * Tests for COMP5911M Coursework 1, Exercise 3.
 *
 * @author Nick Efford
 */
public class ArrayCheckerTest {
  @Test
  public void testCheck() {
    ArrayChecker checker = new ArrayChecker();
    int[] expected = new int[] {10, 50, 30, 98};
    int maxValue = 100;
    int delta = 5;

    int[] actual = new int[] {12, 55, 25, 110};
    assertTrue(checker.check(expected, actual, maxValue, delta));

    actual = new int[] {10, 60, 30, 98};
    assertFalse(checker.check(expected, actual, maxValue, delta));

    actual = new int[] {10, 50, 30};
    assertFalse(checker.check(expected, actual, maxValue, delta));
  }
}
