package lekcijaCetri.labDarbs;

import java.util.Date;

public class Velosipeds {
    String zimols;
    int ramjaIzmers;
    int atrums = 0;
    Date izgatavosanasDatums;

    Velosipeds(){
        System.out.println( "Taisām jaunu VELO!!!");
        izgatavosanasDatums = new Date();
        System.out.println("Izgatavošanas datums " + izgatavosanasDatums);
    }
    //konstruktors tiek padots, katru reizi, kad taisa jaunu velo

    Velosipeds(String zimols, int ramjaIzmers, int atrums){
        izgatavosanasDatums = new Date();
        this.zimols = zimols;
        this.ramjaIzmers = ramjaIzmers;
        this.atrums = atrums;
    }
    public void printAtrums(){
        System.out.println(atrums);
    }
    public void paatrinajums(){
        System.out.println("Velo paātrinās");
        atrums = atrums + 5;
    }
    public void bremzesana (){

        if(atrums>=5) {
            System.out.println("Velo bremzē");
            atrums = atrums - 5;
        }else {
            System.out.println("Beidz bremzēt, tu jau stāvi");
        }
    }

}
