package lekcijaPieci.staticPiemers;

public class Main {
    public static void main(String[] args) {
        Cilveks persona1 = new Cilveks("Peteris");
        Cilveks persona2 = new Cilveks("Anna");

        persona1.printName();
        Cilveks.id = 3;
        persona2.printName();
    }
}
