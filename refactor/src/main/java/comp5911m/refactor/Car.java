package comp5911m.refactor;
public class Car {
  public static final int STANDARD = 0;
  public static final int LUXURY = 1;
  public static final int NEW_MODEL = 2;
  private String model;
  private int priceCode;
  private Price price;
  public Car(String model, int priceCode) {
    this.model = model;
    this.priceCode = priceCode;
    this.setPriceCode(priceCode);
  }
  public String getModel() {
    return model;
  }
  public int getPriceCode() {
    return price.getPriceCode();
  }
  public void setPriceCode(int code) {
      switch (code) {
        case STANDARD:
            price = new StandardPrice();
            break;
        case LUXURY:
            price = new LuxuryPrice();
            break;
        case NEW_MODEL:
            price = new NewModelPrice();
            break;
        default:
            throw new IllegalArgumentException("Invalid price code");
        }
    }
    public int getCharge(int daysRented) {
        return price.getCharge(daysRented);
    }
    public int getFrequentRenterPoints(Rental rental) {
        return price.getFrequentRenterPoints(rental);
    }
}
