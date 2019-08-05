package ResortFurama.Day3AndDay5;

public class Customer {
    public String name;
    public int age;
    public int money;
    public Customer(){

    }
    public Customer(String name, int age,int money){
        this.name = name;
        this.age = age;
        this.money = money;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    @Override
    public String toString(){
        return "Name : " + getName() + ", Age : " + getAge();
    }
}
