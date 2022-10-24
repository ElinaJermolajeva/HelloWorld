package lekcijaPieci.staticPiemers;

public class Cilveks {
    public static int id = 0;
    public String name;

    public Cilveks(String name) {
        this.name = name;
        id++;
    }
    public void printName(){
        System.out.println("Cilvēka vārds ir" + name);
        System.out.println("Darbinieka numurs ir " + id);
    }
}
