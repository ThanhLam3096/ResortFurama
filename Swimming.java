package ResortFurama;

public class Swimming extends Customer {
    private float timeToOpen;
    private float timeToClose;
    private float timeSwimming;
    public Swimming(){

    }
    public Swimming(float timeToOpen,float timeToClose,float timeSwimming){
        this.timeToOpen = timeToOpen;
        this.timeToClose = timeToClose;
        this.timeSwimming = timeSwimming;
    }

    public float getTimeToOpen() {
        return timeToOpen;
    }

    public void setTimeToOpen(float timeToOpen) {
        this.timeToOpen = timeToOpen;
    }

    public float getTimeToClose() {
        return timeToClose;
    }

    public void setTimeToClose(float timeToClose) {
        this.timeToClose = timeToClose;
    }

    public float getTimeSwimming() {
        return timeSwimming;
    }

    public void setTimeSwimming(float timeSwimming) {
        this.timeSwimming = timeSwimming;
    }

    public void openSwim(){
        System.out.println("Time to Open begin At : " + getTimeToOpen() + "h to " + getTimeToClose() + "h close" );
    }
    public void CheckOpenTime(){
        if(getTimeSwimming() < getTimeToOpen() || getTimeSwimming() > getTimeToClose()){
                System.out.println("Sorry Service Stop Come Back " + getTimeToOpen() + "h");
        }
        else{
            System.out.println("Welcome ");
        }
    }
}
