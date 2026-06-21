package Week_3.OOPS.Random;

import java.util.Random;

abstract class Compartment {
    public abstract String notice();
}

class FirstClass extends Compartment {

    public String notice() {
        return "First Class:Comfortable travel.Reserved passengers only.";
    }
}

class Ladies extends Compartment {

    public String notice() {
        return "Ladies  Compartment:Reserved for women passengers.";
    }
}

class General extends Compartment {

    public String notice() {
        return "Open for all passengers.";
    }
}

class Luggage extends Compartment {

    public String notice() {
        return "Luggage Compartment:Goods and luggage only.";
    }
}

public class TestCompartment {

    public static void main(String[] args) {

        Compartment[] coach = new Compartment[10];
        Random random = new Random();

        for (int i = 0; i < coach.length; i++) {
            int choice = random.nextInt(4) + 1;
            switch (choice) {
                case 1:
                    coach[i] = new FirstClass();
                    break;

                case 2:
                    coach[i] = new Ladies();
                    break;

                case 3:
                    coach[i] = new General();
                    break;

                case 4:
                    coach[i] = new Luggage();
                    break;

            }
        }

        System.out.println("Railway Compartments:\n");
        for (int i = 0; i < coach.length; i++) {
            System.out.println("Compartment" + (i + 1) + ":" + coach[i].notice());
        }
    }

}