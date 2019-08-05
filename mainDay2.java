package ResortFurama;

public class mainDay2 {
    public static void main(String[] args) {
        mainDay2 main2 = new mainDay2();
        main2.runDay2();
    }
    public static void showAllHouse(){
        House house1 = new House();
        house1.setNameHouse("Vip1");
        House house2 = new House();
        house2.setNameHouse("Vip2");
        House[] listAllHouse = new House[2];
        listAllHouse[0] = house1;
        listAllHouse[1] = house2;
        System.out.println("List All House : ");
        for(int i = 0;i<listAllHouse.length;i++){
            System.out.println("Code 00" + (i+1) + " : " + listAllHouse[i].getNameHouse() );
        }
    }
    public static void showAllVilla(){
        Villa villa1 = new Villa();
        villa1.setNameVilla("CC001");
        Villa villa2 = new Villa();
        villa2.setNameVilla("CC002");
        Villa villa3 = new Villa();
        villa3.setNameVilla("CC003");
        Villa villa4 = new Villa();
        villa4.setNameVilla("CC004");
        Villa villa5 = new Villa();
        villa5.setNameVilla("CC005");
        Villa[] listAllVilla = new Villa[5];
        listAllVilla[0] = villa1;
        listAllVilla[1] = villa2;
        listAllVilla[2] = villa3;
        listAllVilla[3] = villa4;
        listAllVilla[4] = villa5;
        System.out.println("List All Villa : ");
        for(int i=0;i<listAllVilla.length;i++){
            System.out.println("Code 00" + (i+1) + " : " + listAllVilla[i].getNameVilla());
        }

    }
    public void runDay2(){
        showAllHouse();
        showAllVilla();
    }
}
