package lekcijaCetri.labDarbs;

public class Main {
    public static void main(String[] args) {
        String vards = "Elina";
        House majaViens = new House();
        majaViens.adrese = "Brīvības iela 123";
        majaViens.durvjuSkaits = 5;
        majaViens.griestuAugstums = 3.2;
        majaViens.loguSkaits = 10;
        majaViens.vaiPrivatipasums = true;
        majaViens.kadastralaVertiba = 10000;
        majaViens.stavuDaydzums = 2;


        House majaDivi = new House();
        majaDivi.adrese = "Tallinas iela 123";
        majaDivi.durvjuSkaits = 3;
        majaDivi.griestuAugstums = 2.2;
        majaDivi.loguSkaits = 12;
        majaDivi.vaiPrivatipasums = false;
        majaDivi.kadastralaVertiba = 13000;
        majaDivi.stavuDaydzums = 1;

        char [] mansVards = {'E', 'L', 'I',};
        for(char burts : mansVards){
            System.out.println(burts);
        }

        House [] majas = {majaViens, majaDivi};
        for (House xx  : majas) {
            xx.printHouse();
        }

        Velosipeds mansVelo = new Velosipeds();
        mansVelo.atrums = 2;
        mansVelo.printAtrums();

        Velosipeds ritenbraucejsViens = new Velosipeds();
        Velosipeds ritenbraucejsDivi = new Velosipeds();
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



    }
}
