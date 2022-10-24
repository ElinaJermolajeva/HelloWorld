package lekcijaCetri.labDarbs;

public class Velosipeds {
    String zimols;
    int ramjaIzmers;
    int atrums = 0;

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
