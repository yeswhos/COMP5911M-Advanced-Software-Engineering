package comp5911m.refactor;
public class NewModelPrice extends Price {
    public int getPriceCode(){
        return Car.NEW_MODEL;
    }
    public int getCharge(int daysRented){
        return 40 * daysRented;
    }
    public int getFrequentRenterPoints(Rental rental) {
        if  (rental.getCar().getPriceCode() == Car.NEW_MODEL && rental.getDaysRented() >= 3) {
            return 2;
        } else {
            return 1;
        }
    }
}
