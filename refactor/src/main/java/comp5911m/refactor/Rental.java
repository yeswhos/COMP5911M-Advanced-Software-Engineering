package comp5911m.refactor;
public class Rental {
  private Car car;
  int daysRented;
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
  public int getCharge() {
    return car.getCharge(daysRented);
  }
  public int getFrequentRenterPoints(Rental rental) {
    return car.getFrequentRenterPoints(rental);
  }
}


