package lekcijaViens.labDarbs;

public class Main {
    public static void main(String[] args) {
        //int -integer, satur veselu skaitli
        //mainīgos raksta ar mazo burtu, ja vārds sastāv no diem vārdiem, atstarpi neliek
        // piem. cikAraIrGradi, simbolus neizmanto
        int vecums = 34;
        System.out.println("Mans vecums ir:" + vecums);
        int garums = 180;
        System.out.println("Mans garums ir:" + garums);
        int kurpjuIzmers = 44;
        System.out.println("Mans kurpju izmers ir:" + kurpjuIzmers);
        int svars = 80;
        System.out.println("Mans svars ir:" + svars);
        System.out.println("svars"+ svars+ "\nGarums"+ garums);

        String sunaVards = "Reksis";
        String teksts = "Suņa vārds ir ";
        System.out.println(teksts +sunaVards);

        //maksimālā integer vērtība
        int maxInt = 2147483647;
        int temperatura = -10;
        System.out.println( "ziemā ārā būs" + temperatura);

        //pieņem veselu skaitli -127 līdz +127
        byte vecumsDivi = 99;

//ja skaitlis ir lielāks par intmax, izmanto long
        long zivisOkeana = 98789759897L;

        float apavuIzmers = 44.5F;
        System.out.println(" Apavu izmērs:" + apavuIzmers);

        //Šodien ir sestdiena, lielveikals ir atvērts
        boolean isOpen = true;
        //Turpretim skolas ir slēgtas
        boolean isClosed = false;

        System.out.println("Vai veikals ir atvērts?" + isOpen);

        boolean vaiIrPotets = true;

        if (vaiIrPotets==true){
            System.out.println("Reksis drīkst braukt uz izstādi");
        }
        if (vaiIrPotets==false){
            System.out.println("Reksis jāiet pie vetārsta.");
        }

        String sunaSkirne = "VAS";
        char valuta = '$';
        char dzimums = 'S';
        System.out.println("test" + valuta + dzimums);

        int a = 5;
         int b = 10;

        int summa;
        summa = a + b;
        System.out.println(summa);

        int x = 10;
        int y = -45;
        int rezultats = x + y;
        System.out.println(rezultats);

        rezultats = x * y;
        System.out.println(rezultats);

       //atlikuma vērtība - 11/2 =5 un 1 atlikumā
        rezultats = 11 % 2;
        System.out.println(rezultats);

//auto
        String nosaukums = "Audi";
        String marka = "A6";
        int autoVecums = 6;
        double degvielasPaterins = 6.5;
        boolean tehniskaApskate = true;
        System.out.println("Nosaukums: " + nosaukums + "Mašīnas Marka: " + marka + "Auto vecums:  " + autoVecums);


    }
}
