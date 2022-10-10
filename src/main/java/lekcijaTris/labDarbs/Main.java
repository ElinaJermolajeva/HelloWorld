package lekcijaTris.labDarbs;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ievade = new Scanner(System.in);
        System.out.println("Ievadi skaitli...");
        int number = ievade.nextInt();
        int summa = 0;
        while (number > 0) {
            summa = summa + number;
            System.out.println("Ievadi skaitli...");
            number = ievade.nextInt();
        }
        System.out.println("summa ir:" + summa);


        System.out.println("Sākās programma!");
        printCard();
        printNewLine();
        printCardDivi("Pēteris", "Kalniņš", "Liepāja", 53);
        System.out.println("Beidzās programma");
        int laukums = aprekinatTaisnsturaLaukumu(3, 10);
        System.out.println("Taisnstūra laukums ir: " + laukums);

        //masīvs sākas no nulles, masīva izmērs (cik tur ir elementu)
        int[] monthlyCosts = {100, 40, 23, 44, 55, 150};
        System.out.println(monthlyCosts[0]);
        System.out.println(monthlyCosts[1]);
        System.out.println(monthlyCosts[2]);
        System.out.println(monthlyCosts[3]);
        System.out.println(monthlyCosts[4]);
        System.out.println(monthlyCosts[5]);

        int[] monthlyCost = {100, 90, 45, 33, 12, 899, 5};
        int k = 0;
        while (k < 7) {
            System.out.println(monthlyCost[k]);
            k++;
        }

        String[] produktuSaraksts = {"piens", "maize", "olas"};

        String[] kartis = {"Pīķa dūzis", "Ercena kalps", "Kreiča dāma"};
        int m = 0;
        while (m < kartis.length) {
            System.out.println(kartis[m]);
            m++;
        }


        int[] menesiGada = new int[12];

        produktuSaraksts[2] = "Desa";
        System.out.println(produktuSaraksts[2]); //desa

        String[] cars = {"Volvo", "BMW", "Nissan", "Mercedes"};
        System.out.println("Masiva garums ir:" + cars.length);

        cars[1] = "Audi";
        String[] studentuSaraksts = new String[23];
        studentuSaraksts[0] = "Jānis Bērziņs";
        studentuSaraksts[1] = "Juris Kreilis";

        System.out.println(studentuSaraksts[0]);
        System.out.println(studentuSaraksts[1]);
        System.out.println(studentuSaraksts[2]);
        whileCikls();
    }

    public static void whileCikls() {
        int x = 5;
        while (x > 0) {
            System.out.println("x nav nulle, x = " + x);
            x = x - 1; //var rakstīt arī x--
        }
        int i = 10;
        while (i < 30) {
            System.out.println("i ir" + i);
            i = i + 1;
        }
        String[] cars = {"Volvo", "BMW", "Nissan", "Mercedes"};
        int z = 0;
        String visiAuto = "";
        while (z < 4) {
            System.out.println(cars[z]);
            visiAuto = visiAuto + cars[z];
            z = z + 1;
        }
        System.out.println(visiAuto);

        Scanner scanner = new Scanner(System.in);
        String parole = "SuperSecretPassword123";
        String ievaditaParole;
        do {
            System.out.println("Ievadi paroli");
            ievaditaParole = scanner.nextLine();
            System.out.println("Pārbaudām paroli");
        } while (!ievaditaParole.equals(parole));

        System.out.println("Pareiza parole");

    }

    public static void printNewLine() {
        System.out.println("\n");
    }


    public static void printCard() {
        System.out.println("@@@@@@@@@@");
        System.out.println("Elina Jermolajeva");
        System.out.println("Daugavpils");
        System.out.println("$$$$$$$$$$$");
        printNewLine();

        String[] kartis2 = {"Pīķa dūzis", "Ercena kalps", "Kreiča dāma"};

        for (int j = 0; j < kartis2.length; j++) {
            System.out.println(kartis2[j]);
        }
        for (int v = 0; v <= 20; v = v + 2) {
            if (v == 6) {
                break;
            }
            System.out.println(v);
        }
        long[] telefonaNumuri = {12345678, 90875764, 36457898, 33333333, 77777777};
        for (long number : telefonaNumuri) {
            System.out.println(number);
        }
        int count = 0;
        for (int j = 0; j <= 50; j++) {
            if (!(j % 3 == 0 || j % 5 == 0)) {
                count++;
            }
        }
        System.out.println("Der " + count + "Māju numuri");

        char[] burti = {'e', 'l', 'i', 'n', 'a'};
        for (char vards : burti) {
            System.out.println(vards);
        }

    }

    public static int aprekinatTaisnsturaLaukumu(int platums, int garums) {
        return platums * garums;
    }

    public static void printCardDivi(String vards, String uzvards, String pilseta, int vecums) {
        System.out.println("@@@@@@@@@@");
        System.out.println(vards + " " + uzvards);
        System.out.println(pilseta);
        System.out.println("Vecums" + vecums);
        System.out.println("$$$$$$$$$$$");
    }

    //mājas darba uzd. par vidējo aritmētisko
    public static double average(double x, double y, double z) {
        return (x + y + z) / 3;
    }
}





