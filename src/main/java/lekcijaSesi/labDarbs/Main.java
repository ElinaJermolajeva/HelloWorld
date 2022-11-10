package lekcijaSesi.labDarbs;

import com.github.javafaker.Faker;

public class Main {
    public static void main(String[] args) {
        Faker faker = new Faker();
        String vards = faker.name().firstName();
        System.out.println("Mani sauc " + vards);

        System.out.println(faker.shakespeare().hamletQuote());
        System.out.println(faker.address().streetName());

        System.out.println(faker.address().city() + faker.address().country());
        System.out.println(faker.phoneNumber().phoneNumber());
        System.out.println(faker.animal().name());
        System.out.println(faker.internet().emailAddress());
    }
}
