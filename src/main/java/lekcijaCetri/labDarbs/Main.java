package lekcijaCetri.labDarbs;

public class Main {
    public static void main(String[] args) {
        String vards = "Elina";

        House majaViens = new House(4,10,40,"liepaja",3,40000,true);

        House majaDivi = new House(3,4,5,"Maxima",5,700000,true);

        char[] mansVards = {'E', 'L', 'I',};
        for (char burts : mansVards) {
            System.out.println(burts);
        }

        House[] majas = {majaViens, majaDivi};
        for (House xx : majas) {
            xx.printHouse();
        }

        Velosipeds mansVelo = new Velosipeds();
        mansVelo.atrums = 2;
        mansVelo.printAtrums();

        Velosipeds ritenbraucejsViens = new Velosipeds();
        Velosipeds ritenbraucejsDivi = new Velosipeds();
        Velosipeds ritenix = new Velosipeds("ZZK", 21, 100);

        ritenbraucejsViens.atrums = 40;
        ritenbraucejsDivi.atrums = 30;

        ritenbraucejsViens.printAtrums();
        ritenbraucejsDivi.printAtrums();

        Velosipeds ritenbraucejsTris = new Velosipeds();
        ritenbraucejsTris.printAtrums();

        ritenbraucejsTris.paatrinajums();
        ritenbraucejsTris.paatrinajums();
        ritenbraucejsTris.paatrinajums();
        ritenbraucejsTris.paatrinajums();

        ritenbraucejsTris.printAtrums();
        System.out.println(" Priekšā izskrien kaķis");

        ritenbraucejsTris.bremzesana();
        ritenbraucejsTris.bremzesana();
        ritenbraucejsTris.bremzesana();
        ritenbraucejsTris.bremzesana();
        ritenbraucejsTris.bremzesana();
        ritenbraucejsTris.bremzesana();

        ritenbraucejsTris.printAtrums();


        Automasina jaunaAuto = new Automasina();
        jaunaAuto.zimols = "Toyota";
        jaunaAuto.durvis = 4;
        jaunaAuto.tehniskaApskate = true;
        jaunaAuto.printAutomasina();

        Rinkis rinkisViens = new Rinkis(5);

        System.out.println(
                rinkisViens.rekinatLaukumu()
        );
        System.out.println(
                rinkisViens.rekinatLinijasGarumu()
        );

    }
}
