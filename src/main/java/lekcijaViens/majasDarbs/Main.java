package lekcijaViens.majasDarbs;

public class Main {
    public static void main(String[] args) {
        String nosaukums = "Ungārija";
        System.out.println("Nosaukums: " + nosaukums);
        int iedzivotajuSkaits = 9979000;
        System.out.println("Iedzīvotāju skaits: " + iedzivotajuSkaits);
        int platiba = 93030;
        System.out.println("Platība: " + platiba + " km2");
        String galvaspilseta = "Budapešta";
        System.out.println("Galvaspilsēta: " + galvaspilseta);
        String valoda = "ungāru";
        System.out.println("Oficiālā valoda: " + valoda);
        boolean vaiIrEs = true;
        if (vaiIrEs == true) {
            System.out.println("Ungārija ir ES dalībvalsts.");
        }
        String valuta = "HUF";
        System.out.println("Valūta: " + valuta);

        System.out.println(nosaukums + " ir valsts Eiropā. Tās platība ir " + platiba + " km2. Ungārijas galvaspilsēta ir " + galvaspilseta + ". Ungārijā dzīvo " + iedzivotajuSkaits + " iedzīvotāji.");

        int a = 10;
        int b = 3;

        int summa = a + b;
        int starpiba = a - b;
        float dalit = a/b;
        int reizinat = a * b;
        int atlikums = a%b;

        System.out.println(summa);
        System.out.println(starpiba);
        System.out.println(dalit);
        System.out.println(reizinat);
        System.out.println(atlikums);

        int x = 12;
        int y = 5;
        int rezultats = x+y;
        System.out.println(rezultats);
        rezultats = x - y;
        System.out.println(rezultats);
        rezultats = x*y;
        System.out.println(rezultats);
        rezultats = x/y;
        System.out.println(rezultats);
        rezultats = x%y;
        System.out.println(rezultats);

    }
}
