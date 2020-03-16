package comp5911m.cwk1;


import java.lang.reflect.Array;

/**
 * Class for COMP5911M Coursework 1, Exercise 3.
 *
 * @author Nick Efford
 */
public class ArrayChecker {
  public boolean check(int[] expected,int []actual, int maxValue, int delta) {


    // Clip 'too large' values
      actual = clipTooLarge(actual, maxValue);

    // Check for length differences
    if (!checkLength(actual, expected)){
        return false;
    }


      // Check that each entry is within the expected +/- delta
    if (!checkRange(actual, expected, delta)){
        return false;
    }
    return true;

  }
  public int [] clipTooLarge(int [] actual, int maxValue){
    for (int i = 0; i < actual.length; ++i) {
      if (actual[i] > maxValue) {
        actual[i] = maxValue;
      }
    }
    return actual;
  }
    public boolean checkLength(int []actual, int []expected){
        if (actual.length != expected.length) {
            return false;
        }
        else
            return true;
    }
    public boolean checkRange(int []actual, int []expected, int delta){

        for (int i = 0; i < actual.length; ++i) {
            if (Math.abs(expected[i] - actual[i]) > delta) {
                return false;
            }
        }
        return true;
    }
}
