package lekcijaCetri.labDarbs;

public class Rinkis {
    double r;
    final double PI = Math.PI;
    //final, lai neviens nevarētu mainīt


    public Rinkis(double r) {
        this.r = r;
    }

    public double rekinatLaukumu (){
        return r*r*PI;
    }
    public double rekinatLinijasGarumu (){
        return 2* PI*r;
    }
}
