package lekcijaPieci.majasDarbs;

public class Cilindrs {
    private double radiuss;
    private double augstums;

    public double getRadiuss() {return radiuss;}
    public void setRadiuss(double radiuss) {this.radiuss = radiuss;}

    public double getAugstums() {return augstums;}
    public void setAugstums(double augstums) {this.augstums = augstums;}

    public double getCilindraLaukums (){
        return 2 * Math.PI * radiuss * augstums;
    }
    public double getCilindraTilpums (){
        return Math.PI * radiuss * radiuss * augstums;
    }
    public Cilindrs(){
    }

    public Cilindrs(double radiuss, double augstums) {
        this.radiuss = radiuss;
        this.augstums = augstums;
    }

    public void printCilindrs() {
        System.out.println("Cilindra rādiuss ir " + radiuss);
        System.out.println("Cilindra augstums ir  " + augstums);
    }
}
