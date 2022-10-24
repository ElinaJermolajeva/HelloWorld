package lekcijaPieci.labDarbs;

public class Main {
    public static void main(String[] args) {
        Cat muris = new Cat();
        Dog reksis = new Dog(6);
        Cow govs = new Cow();
        Fish zivs = new Fish();

        muris.age = 3;
        muris.canClimbTrees = true;

        reksis.canClimbTrees = false;

        muris.breathe();
        reksis.breathe();
        zivs.breathe();

        muris.makeSound();
        reksis.makeSound();
        govs.makeSound();

        muris.eat();
        reksis.eat();

        muris.nagusAsina();
        reksis.ruc();

        muris.printClimbing();

        House house = new House(1, 2, 3, "Brīvības", 4, 5555, true);
        house.printHouse();
        house.setKadastralaVertiba(30000L);
        house.printHouse();

        System.out.println("Mājas adrese ir " + house.getAdrese());
        house.printHouse();

        Calculator kalkulators = new Calculator();
        System.out.println(kalkulators.add(5,10));
        System.out.println(kalkulators.add(5.7,10.5));
        System.out.println(kalkulators.add(4,9,5));
    }
}
