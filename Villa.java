package ResortFurama;

public class Villa extends Customer {
    private String nameVilla;
    private int priceOneday;
    private int totalDate;
    private int numberBed;

    public Villa() {

    }
    public Villa(String nameVilla,int totalDate,int priceOneday,int numberBed){
        this.nameVilla = nameVilla;
        this.totalDate = totalDate;
        this.priceOneday = priceOneday;
        this.numberBed = numberBed;
    }
    public Villa(String name, int age, int money, String nameVilla, int totalDate, int priceOneday, int numberBed) {
        super(name, age, money);
        this.nameVilla = nameVilla;
        this.totalDate = totalDate;
        this.priceOneday = priceOneday;
        this.numberBed = numberBed;
    }

    public String getNameVilla() {
        return nameVilla;
    }

    public void setNameVilla(String nameVilla) {
        this.nameVilla = nameVilla;
    }

    public int getTotalDate() {
        return totalDate;
    }

    public void setTotalDate(int totalDate) {
        this.totalDate = totalDate;
    }

    public int getPriceOneday() {
        return priceOneday;
    }

    public void setPriceOneday(int priceOneday) {
        this.priceOneday = priceOneday;
    }

    public int getNumberBed() {
        return numberBed;
    }

    public void setNumberBed(int numberBed) {
        this.numberBed = numberBed;
    }

    public int payment() {
        return getTotalDate() * 10;
    }

    public int numberDateStayResort() {
        int date = 0;
        switch (money){
            case 100:
                date = money/this.priceOneday;
                break;
            case 50:
                date = money/this.priceOneday;
                break;
            case 30:
                date = money/this.priceOneday;
                break;
            default:
                date = 0;
        }
        return date;
    }

    @Override
    public String toString() {
        return super.toString() + ", Name Villa : " + getNameVilla() + ", Total Day Use Service : " + getTotalDate() +
                ", PayMent : " + payment() + "USD";
    }

}
