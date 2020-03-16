package comp5911m.refactor;
public class StandardPrice extends Price {
    public int getPriceCode(){
        return Car.STANDARD;
    }
    public int getCharge(int daysRented){
        return 30 * daysRented;
    }
}
