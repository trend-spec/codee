

import java.util.Scanner;

abstract class Car {
    protected String type;

    public Car(String type) {
        this.type = type;
    }

    protected abstract void build();

    public void allocateAccessories() {
        System.out.println("Allocate accessories for " + type);
    }

    public void assembleBody() {
        System.out.println("Assemble body for " + type);
    }

    public void paint() {
        System.out.println("Painting " + type);
    }

    public void installInterior() {
        System.out.println("Install interior for " + type);
    }
}

class Hatchback extends Car {
    public Hatchback() {
        super("Hatchback");
    }

    public void build() {
        allocateAccessories();
        assembleBody();
        paint();
        installInterior();
        System.out.println("Hatchback built successfully");
    }
}

class Sedan extends Car {
    public Sedan() {
        super("Sedan");
    }

    public void build() {
        allocateAccessories();
        assembleBody();
        paint();
        installInterior();
        System.out.println("Sedan built successfully");
    }
}

class SUV extends Car {
    public SUV() {
        super("SUV");
    }

    public void build() {
        allocateAccessories();
        assembleBody();
        paint();
        installInterior();
        System.out.println("SUV built successfully");
    }
}

class CarFactory {
    public static Car createCar(String type) {
        switch (type.toLowerCase()) {
            case "hatchback":
                return new Hatchback();
            case "sedan":
                return new Sedan();
            case "suv":
                return new SUV();
            default:
                throw new IllegalArgumentException("Invalid car type: " + type);
        }
    }
}

public class TestFactoryCar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nSelect a car type to build:");
            System.out.println("1. Hatchback");
            System.out.println("2. Sedan");
            System.out.println("3. SUV");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Building a Hatchback...");
                    Car hatchback = CarFactory.createCar("Hatchback");
                    hatchback.build();
                    break;
                case 2:
                    System.out.println("Building a Sedan...");
                    Car sedan = CarFactory.createCar("Sedan");
                    sedan.build();
                    break;
                case 3:
                    System.out.println("Building an SUV...");
                    Car suv = CarFactory.createCar("SUV");
                    suv.build();
                    break;
                case 4:
                    System.out.println("Exiting the program.");
                    break;
                default:
                    System.out.println("Invalid choice. Please select a valid option.");
                    break;
            }
        } while (choice != 4);

        scanner.close();
}
}