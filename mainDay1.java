package ResortFurama;
import java.util.*;
public class mainDay1 {
    public static void main(String[] args) {
        Scanner L = new Scanner(System.in);
        Villa customer1 = new Villa();
        customer1.setName("Obama");
        customer1.setAge(52);
        customer1.setMoney(100);
        customer1.setNameVilla("CC01");
        customer1.setNumberBed(5);
        customer1.setPriceOneday(10);
        customer1.setTotalDate(4);
        System.out.println(customer1);
        System.out.println("Customer : " + customer1.getName() + " have " + customer1.getMoney() + " use Service  "
                + customer1.numberDateStayResort() + " day");
        Swimming sw1 = new Swimming();
        System.out.println("Time to Open : ");
        sw1.setTimeToOpen(L.nextFloat());
        System.out.println("Time To Close : ");
        sw1.setTimeToClose(L.nextFloat());
        System.out.println("Use Service Swimming At Time");
        sw1.setTimeSwimming(L.nextFloat());
        sw1.openSwim();
        sw1.CheckOpenTime();
    }
}
