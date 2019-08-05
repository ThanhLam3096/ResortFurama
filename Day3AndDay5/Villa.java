package ResortFurama.Day3AndDay5;

public class Villa extends Accomodation implements Service {
    public Villa(){

    }
    public Villa(String name,int priceOneday,int totalDate,int numberBed){
        super(name,priceOneday,totalDate,numberBed);
    }
    @Override
    public int totalPrice(){
        return getPriceOneday()*getTotalDate();
    }
    @Override
    public int numberDateStayInResort(int money){
        int date = 0;
        switch (money) {
            case 100:
                date = money/getPriceOneday();
                break;
            case 50:
                date = money/getPriceOneday();
                break;
            case 30:
                date = money/getPriceOneday();
                break;
            default:
                date = 0;
        }
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
