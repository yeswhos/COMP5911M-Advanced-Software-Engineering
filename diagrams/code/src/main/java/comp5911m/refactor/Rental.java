package comp5911m.refactor;


public class Rental {
  private Car car;
  private int daysRented;

  public Rental(Car car, int daysRented) {
    this.car = car;
    this.daysRented = daysRented;
  }

  public Car getCar() {
    return car;
  }

  public int getDaysRented() {
    return daysRented;
  }
}
