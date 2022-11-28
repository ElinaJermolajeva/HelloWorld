package lekcijaCetri.majasDarbs.homework;

public class Main {
    public static void main (String [] args) {
        Trijsturis abc = new Trijsturis(8, 4, 6);

        System.out.println(abc.vaiVienadmalu());
        System.out.println(abc.vaiVienadsanu());

        Trijsturis def = new Trijsturis(4,7,6);
        System.out.println(def.vaiVienadmalu());
        System.out.println(def.vaiVienadsanu());
        System.out.println("Trijstūra laukums ir: " + def.area);
    }
}
