package lekcijaTris.majasDarbs;

import java.util.Scanner;

public class LoopHomeWork {
    public static void main(String[] args) {

        Scanner ievade = new Scanner(System.in);
        System.out.println("Ievadi skaitli...");
        int number = ievade.nextInt();
        int summa = 0 + number;
        while (summa <100) {
            summa = summa + number;
            System.out.println("Ievadi skaitli...");
            number = ievade.nextInt();
        }
        System.out.println("Gatavs");

        int[] ienakumi = {100, 90, 45, 33, 12, 899, 5};
        int k = 0;
        while (k < 7) {
            System.out.println(ienakumi[k]);
            k++;
        }

        int [] stundas = {8,5,2,8,6,4};
        int m =0;
        do {
            System.out.println("Bija darbā " + stundas[m]);
            m++;

        } while (m<6);

        char[] vowels = {'a', 'e', 'i', 'o', 'u'};

        for (int i = 0; i < vowels.length; ++ i) {
            System.out.println(vowels[i]);
        }

        for (char item: vowels) {
            System.out.println(item);
        }
        String[] studenti = {"Jānis Bērziņš","Anna Balode", "Andris Ozols", "Ilga Upīte"};
        for (int j = 0; j < studenti.length; j++) {
            System.out.println(studenti[j]);
        }

        int i,fact=1;
        int vertiba =5;
        for(i=1;i<=vertiba;i++){
            fact=fact*i;
        }
        System.out.println("Factorial of "+vertiba+" is: "+fact);

        int n = 100;
        System.out.print("Even Numbers from 1 to "+n+" are: ");
        for (int y = 1; y <= n; y++) {
            if (y % 2 == 0) {
                System.out.print(y + " ");
            }
        }
    }



    }

