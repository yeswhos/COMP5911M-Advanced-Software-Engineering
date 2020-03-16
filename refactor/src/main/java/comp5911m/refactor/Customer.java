package comp5911m.refactor;
import java.util.ArrayList;
import java.util.List;
public class Customer {
  private String name;
  private List<Rental> rentals;
  private Car car;
  public Customer(String name) {
    this.name = name;
    rentals = new ArrayList<>();
  }
  public String getName() {
    return name;
  }
  public void addRental(Rental rental) {
    rentals.add(rental);
  }
  public String statement() {
    //int totalAmount = 0;
    //int frequentRenterPoints = 0;
    StringBuilder result = new StringBuilder();
    result.append("Rental record for ");
    result.append(getName());
    result.append(":\n");
    // Determine amounts for each rental
    for (Rental rental : rentals) {
      // Each rental earns a frequent renter point...
      //frequentRenterPoints += getFrequentRenterPoints(rental);
      // Show figures for this rental
      result.append("- ");
      result.append(rental.getCar().getModel());
      result.append(": ");
      result.append(rental.getDaysRented());
      result.append(" days, £");
      result.append(rental.getCharge());
      result.append("\n");
      result.append(rental.getFrequentRenterPoints(rental));
      //totalAmount += rental.getCharge();
    }
    // Add footer lines
    result.append("Amount owed is £");
    result.append(getTotalCharge());
    result.append("\nYou earned ");
    //result.append(frequentRenterPoints);
    result.append(getFrequentRenter());
    result.append(" frequent renter points\n");
    return result.toString();
  }
    private int getFrequentRenterPoints(Rental rental) {
        return rental.getFrequentRenterPoints(rental);
    }
    private int getTotalCharge() {
        int result = 0;
        for (Rental rental : rentals) {
            result += rental.getCharge();
        }
        return result;
    }
    private int getFrequentRenter(){
      int frequentRenterPoints = 0;
      for (Rental rental : rentals) {
          frequentRenterPoints += rental.getFrequentRenterPoints(rental);
     }
      return frequentRenterPoints;
    }
    public String htmlstatement() {
        //int totalAmount = 0;
        //int frequentRenterPoints = 0;
        StringBuilder result = new StringBuilder();
        result.append("<h1><em>Rental record for </em></h1>");
        result.append(getName());
        result.append("<p>:<p/><br/>\n");
        // Determine amounts for each rental
        for (Rental rental : rentals) {
            // Each rental earns a frequent renter point...
            //frequentRenterPoints += getFrequentRenterPoints(rental);
            // Show figures for this rental
            result.append("<p>- <p/>");
            result.append(rental.getCar().getModel());
            result.append("<p>: <p/>");
            result.append(rental.getDaysRented());
            result.append("<h1><em> days, </h1></em>£");
            result.append(rental.getCharge());
            result.append("<br/>\n");
            result.append(rental.getFrequentRenterPoints(rental));
            //totalAmount += rental.getCharge();
        }
        // Add footer lines
        result.append("<h1><em>Amount owed is £</em></h1>");
        result.append(getTotalCharge());
        result.append("<br/>\n<h1><em>You earned </h1></em>");
        //result.append(frequentRenterPoints);
        result.append(getFrequentRenter());
        result.append("<h1><em> frequent renter points</h1></em><br/>\n");
        return result.toString();
    }
}
