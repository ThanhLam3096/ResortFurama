package ResortFurama.Day3AndDay5;
import java.util.*;
public class mainDay3AndDay5 {
    public static void main(String[] args) {
        mainDay3AndDay5 Day3 = new mainDay3AndDay5();
        Day3.run();
    }
    public static void showAllHouse(){
        House house1 = new House();
        house1.setNameService("House 001");
        House house2 = new House();
        house2.setNameService("House 002");
        House[] listAllHouse = new House[2];
        listAllHouse[0] = house1;
        listAllHouse[1] = house2;
        System.out.println("List All House -- ");
        for(int i = 0;i<listAllHouse.length;i++){
            System.out.println("Code 00" + (i+1) + " : " + listAllHouse[i].getNameService() );
        }
    }
    public static void showAllVilla(){
        Villa villa1 = new Villa();
        villa1.setNameService("Villa CC001");
        Villa villa2 = new Villa();
        villa2.setNameService("Villa CC002");
        Villa villa3 = new Villa();
        villa3.setNameService("Villa CC003");
        Villa villa4 = new Villa();
        villa4.setNameService("Villa CC004");
        Villa villa5 = new Villa();
        villa5.setNameService("Villa CC005");
        Villa[] listAllVilla = new Villa[5];
        listAllVilla[0] = villa1;
        listAllVilla[1] = villa2;
        listAllVilla[2] = villa3;
        listAllVilla[3] = villa4;
        listAllVilla[4] = villa5;
        System.out.println("List All Villa -- ");
        for(int i=0;i<listAllVilla.length;i++){
            System.out.println("Code 00" + (i+1) + " : " + listAllVilla[i].getNameService());
        }
    }
    public static void showAllTent(){
        Tent tent1 = new Tent();
        tent1.setNameService("Tent TMK001");
        Tent tent2 = new Tent();
        tent2.setNameService("Tent TMK001");
        Tent tent3 = new Tent();
        tent3.setNameService("Tent TMK001");

        Tent[] listAllTent = new Tent[3];
        listAllTent[0] = tent1;
        listAllTent[1] = tent2;
        listAllTent[2] = tent3;

        System.out.println("List All Tent -- ");
        for(int i=0;i<listAllTent.length;i++){
            System.out.println("Code 00" + (i+1) + " : " + listAllTent[i].getNameService());
        }
    }
    public void choosePayment(Tent tent1){
        int choice;
        Scanner KLL = new Scanner(System.in);
        do{
            System.out.println("~~~~~~~");
            System.out.println("Choose Method Payment : ");
            System.out.println("1.Payment With Visa...");
            System.out.println("2.Payment With Cart...");
            System.out.println("~~~~~~~");
            choice = KLL.nextInt();
        }while(choice > 2 || choice < 1);
        switch (choice){
            case 1:
                tent1.paymentWithVisa();
                break;
            case 2:
                tent1.paymentWithCart();
                break;
            default:
        }
    }
    public void run(){
        showAllHouse();
        showAllVilla();
        showAllTent();
        Tent tent1 = new Tent();
        choosePayment(tent1);
    }
}
