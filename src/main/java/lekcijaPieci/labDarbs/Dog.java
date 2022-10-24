package lekcijaPieci.labDarbs;

public class Dog extends Animal {

    private int legCount= 4;
    //private var izmantot tikai klasē
    public void makeSound() {
        System.out.println("vau, vau, vau");
    }

    public void ruc() {
        System.out.println("Es dusmigi rucu!");
    }

    public Dog(int age) {
        //this atbilst mainīgajam šai klasei, super - paņem mainīgo no augstākas klases
        super.age = age;
    }
}

