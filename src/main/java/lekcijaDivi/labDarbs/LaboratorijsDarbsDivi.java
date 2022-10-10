package lekcijaDivi.labDarbs;

import java.util.Scanner;

public class LaboratorijsDarbsDivi {
    public static void main(String[] args) {
        //salīdzināšanas izteiksmes
        int x = 3;
        int y = 2;
        System.out.println(x > y);
        x = 5;
        y = 7;
        System.out.println(x > y);
        //mazāks
        x = 5;
        y = 3;
        System.out.println(x < y);

        //vienāds
        System.out.println(x == y);

        String luksoforaKrasa = "green";
        System.out.println(luksoforaKrasa.equals("green"));
        System.out.println(luksoforaKrasa.equals("red"));

        //nav vienāds
        System.out.println(x != y);

        System.out.println(!luksoforaKrasa.equals("red"));

        //mazāks vienāds
        x = 5;
        y = 6;
        int z = 8;
        System.out.println(x <= y);
// un &&
        System.out.println(x > 6 && z > y);
        // vai ||
        System.out.println(x > 6 || z > y);


        int age = 15;
        boolean hasVoted = false;

        if (age >= 18 && hasVoted == false) {
            System.out.println("Drīkst balsot");
        } else {
            System.out.println("Nedrīkst balsot");
        }


        System.out.println("Paskaties cilvēka pasē");
        if (age >= 18) {
            System.out.println("Drīkst balsot");
        }
        System.out.println("Tālākas darbības");

        //pārbaudīt, vai skaitlis ir negatīvs. Ja ir, izvadīt uz ekrāna tekstu NEGATĪVS
        int skaitlis = -5;
        if (skaitlis < 0) {
            System.out.println("NEGATĪVS");
        }
        if (skaitlis < 0) {
            System.out.println("NEGATĪVS");
        } else {
            System.out.println("Skaitlis nav negatīvs");
        }

        String luksofors = "green";
        if (luksofors.equals("green")) {
            System.out.println("Ej");
        } else {
            System.out.println("Stāvi");
        }

        System.out.println("Ievadīsim skaitli i");
        int i = 20;
        if (i == 10) {
            System.out.println("Skaitlis ir 10");
        } else if (i == 15) {
            System.out.println("skaitlis ir 15");
        } else if (i == 20) {
            System.out.println("skaitlis ir 20");
        } else {
            System.out.println("Skaitlis nav neviens no vajadzīgajiem");
        }

        String gaisma = "yellow";
        if (gaisma.equals("zaļš")) {
            System.out.println("Ej");
        } else if (gaisma.equals("red")) {
            System.out.println("Stāvi!");
        } else if (gaisma.equals("yellow")) {
            System.out.println("Gaidi!");
        } else {
            System.out.println("Nedarbojas!");
        }

        int number = 56;
        //noteikt vai ievadītais skaitlis ir pāra vai nepāra
        if (number % 2 == 0) {
            System.out.println("ir pāra skaitlis");
        } else {
            System.out.println(number + " ir nepāra skaitlis");
        }

        int monthNumber = 2;
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
            default:
                System.out.println("Šāds mēnesis neeksistē");
        }

        String animal = "DOG";
        String result;
        switch (animal) {
            case "DOG":
                result = "Domestic animal";
                break;
            case "CAT":
                result = "Domestic animal";
                break;
            case "TIGER":
                result = "Wild animal";
            default:
                result = "Unknown animal";

        }
        System.out.println("This animal is " + result);


        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello Lekcija Divi");

        //printējas tikai tad, ja ir true
        int vecums;
        System.out.println("Kā tevi sauc?");
       String name = scanner.nextLine();
       System.out.println("Labdien" + name + "! Esi sveicināts manā programmā!");

       System.out.println(" Ievadi cilvēka vecumu..");
               vecums = scanner.nextInt();
       if(vecums>=18){
           System.out.println("Cilvēks drīkst balsot");

           System.out.println("Ievadi skaitli a");
           int a = scanner.nextInt();
           System.out.println("Ievadi skaitli b");
            int b = scanner.nextInt();
           int summa = a+b;
           System.out.println("Skaitļa " + a + "un Skaitļa " +b + "summa ir" + summa);
        }
    }
}
