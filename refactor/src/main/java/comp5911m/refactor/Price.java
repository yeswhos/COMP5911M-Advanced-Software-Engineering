package comp5911m.refactor;
public abstract class Price {
    public abstract int getPriceCode();
    public abstract int getCharge(int daysRented) ;
    public int getFrequentRenterPoints(Rental rental) {
        return 1;
    }
}
