package ResortFurama.Day3AndDay5;

public class Tent extends Accomodation implements Service {
    public Tent(){

    }
    public Tent(String name,int priceOneday,int totalDate,int numberBed){
        super(name,priceOneday,totalDate,numberBed);
    }
    @Override
    public int totalPrice(){
        return getPriceOneday()*getTotalDate();
    }
    @Override
    public int numberDateStayInResort(int money){
        int date;
        date = money/getPriceOneday();
        return date;
    }
    @Override
    public void paymentWithVisa(){
        System.out.println("You Choose Payment With Visa...");
    }
    @Override
    public void paymentWithCart(){
        System.out.println("You Choose Payment With Cart...");
    }
}
