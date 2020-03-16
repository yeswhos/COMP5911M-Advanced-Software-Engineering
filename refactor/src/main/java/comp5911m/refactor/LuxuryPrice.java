package comp5911m.refactor;
public class LuxuryPrice extends Price {
    public int getPriceCode(){
        return Car.LUXURY;
    }
    public int getCharge(int daysRented){
        return 50 * daysRented;
    }
}
