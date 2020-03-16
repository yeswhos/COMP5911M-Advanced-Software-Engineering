package comp5911m.testing;


import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class MoneyTest {
  private Money oneFortyNine, oneFifty, oneNinety, oneNinty, twoNinetyNine;


  @BeforeEach
  public void setUp() {
    oneFortyNine = new Money(1, 49);
    oneFifty = new Money(1, 50);

  }

  @Test
  public void creation() {
    assertThat(oneFifty.getEuros(), is(1));
    assertThat(oneFifty.getCents(), is(50));
  }

  @Test
  public void centsTooLow() {
    assertThrows(IllegalArgumentException.class, () -> new Money(1, -1));
  }

  @Test
  public void centsTooHigh(){
    assertThrows(IllegalArgumentException.class, () -> new Money(1, 100));
  }

  @Test
  public void eurosTooLow(){
    assertThrows(IllegalArgumentException.class, () -> new Money(-1,1));
  }

  @Test
  public void euqalTest(){
    oneNinety = new Money(1,90);
    oneNinty = new Money(1,90);
    assertThat(oneFortyNine.equals(oneFifty), is(false));
    assertThat(oneNinety.equals(oneNinety), is(true));
  }

  @Test
  public void hashcodeTest(){
    oneNinety = new Money(1,90);
    oneNinty = new Money(1,90);
    assertThat((oneNinety.hashCode() == oneNinty.hashCode()), is(true));
    assertEquals((oneFortyNine.hashCode() == oneFifty.hashCode()), false);
  }

  @Test
  public void plusTest(){
    twoNinetyNine = new Money(2,99);
    assertThat(oneFortyNine.plus(oneFifty), is(twoNinetyNine));
  }
  @Test
  public void stringConversion() {
    Money oneFive = new Money(1, 5);
    assertAll(
      () -> assertThat(oneFifty.toString(), is("\u20ac1.50")),
      () -> assertThat(oneFive.toString(), is("\u20ac1.05"))

    );
  }
}
