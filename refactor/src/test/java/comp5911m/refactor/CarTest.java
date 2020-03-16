package comp5911m.refactor;


import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class CarTest {
  private Car car;

  @BeforeEach
  public void setUp() {
    car = new Car("Ford Focus", Car.STANDARD);
  }

  @Test
  public void creation() {
    assertThat(car.getModel(), is("Ford Focus"));
    assertThat(car.getPriceCode(), is(Car.STANDARD));
  }

  @Test
  public void changePriceCode() {
    car.setPriceCode(Car.NEW_MODEL);
    assertThat(car.getPriceCode(), is(Car.NEW_MODEL));
  }
}
