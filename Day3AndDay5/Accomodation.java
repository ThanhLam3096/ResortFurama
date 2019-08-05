package ResortFurama.Day3AndDay5;

public abstract class Accomodation {
    private static String nameService;
    private static int priceOneday;
    private static int totalDate;
    private static int numberBed;
    public Accomodation(){

    }
    public Accomodation(String nameService,int priceOneday,int totalDate,int numberBed){
        this.nameService = nameService;
        this.priceOneday = priceOneday;
        this.totalDate = totalDate;
        this.numberBed = numberBed;
    }
    public String getNameService() {
        return nameService;
    }

    public void setNameService(String nameService) {
        this.nameService = nameService;
    }

    public int getPriceOneday() {
        return priceOneday;
    }

    public void setPriceOneday(int priceOneday) {
        this.priceOneday = priceOneday;
    }

    public int getTotalDate() {
        return totalDate;
    }

    public void setTotalDate(int totalDate) {
        this.totalDate = totalDate;
    }

    public int getNumberBed() {
        return numberBed;
    }

    public void setNumberBed(int numberBed) {
        this.numberBed = numberBed;
    }

}
