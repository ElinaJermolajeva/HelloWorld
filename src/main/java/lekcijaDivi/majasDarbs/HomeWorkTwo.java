package lekcijaDivi.majasDarbs;

import static java.lang.Math.*;;
import static java.lang.Math.max;

public class HomeWorkTwo {
    public static void main(String[] args) {
        int x = 7;
        System.out.println(x > 0);
        System.out.println(x < 0);
        System.out.println(x >= 5 && x <= 10);
        System.out.println(x != 5 && x < 10);
        System.out.println(x == 1 || x == 10);
        System.out.println(x * x > 10);

        int monthNumber = 5;
        switch (monthNumber) {
            case 1:
                System.out.println("Janvāris");
                break;
            case 2:
                System.out.println("Februāris");
                break;
            case 3:
                System.out.println("Marts");
                break;
            case 4:
                System.out.println("Aprīlis");
                break;
            case 5:
                System.out.println("Maijs");
                break;
            case 6:
                System.out.println("Jūnijs");
                break;
            case 7:
                System.out.println("Jūlijs");
                break;
            case 8:
                System.out.println("Augusts");
                break;
            case 9:
                System.out.println("Septembris");
                break;
            case 10:
                System.out.println("Oktobris");
                break;
            case 11:
                System.out.println("Novembris");
                break;
            case 12:
                System.out.println("Decembris");
                break;
            default:
                System.out.println("Šāds mēnesis neeksistē");
        }
        int a = 5;
        int b = 7;
        int c = 9;
        System.out.println(Math.max(Math.max(a, b), c));

        String krasa = "brūna";
        if (krasa.equals("zaļa")) {
            System.out.println("Ej");
        } else if (krasa.equals("sarkana")) {
            System.out.println("Stāvi!");
        } else if (krasa.equals("dzeltena")) {
            System.out.println("Gaidi!");
        } else {
            System.out.println("Nedarbojas!");
        }
    }
}
