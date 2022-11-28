package lekcijaPieci.majasDarbs;

public class Main {
    public static void main(String[] args) {
        Cilindrs pirmaisCilindrs = new Cilindrs(3,5);
        Cilindrs otraisCilindrs = new Cilindrs();
        otraisCilindrs.setRadiuss(4);
        otraisCilindrs.setAugstums(8);

        System.out.println("Pirmā cilindra rādiuss ir " + pirmaisCilindrs.getRadiuss());
        System.out.println("Pirmā cilindra augstums ir " + pirmaisCilindrs.getAugstums());

        System.out.println("Otrā cilindra rādiuss ir " + otraisCilindrs.getRadiuss());
        System.out.println("Otrā cilindra augstums ir " + otraisCilindrs.getAugstums());

        System.out.println("Pirmā cilindra virsmas laukums ir " + pirmaisCilindrs.getCilindraLaukums());
        System.out.println("Pirmā cilindra tilpums ir " + pirmaisCilindrs.getCilindraTilpums());
        System.out.println("Otrā cilindra virsmas laukums ir " + otraisCilindrs.getCilindraLaukums());
        System.out.println("Otrā cilindra virsmas tilpums ir " + otraisCilindrs.getCilindraTilpums());


    }
}
