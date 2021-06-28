package myjavapackage.intermediate.encapsulation.car;

public class ToyotaSupra extends Car {


    public ToyotaSupra( String color, byte numberOfOwners, short power, short horsePower, int price, int mileage, boolean isDamaged) {
        super("Toyota Supra", color, numberOfOwners, power, horsePower, price, mileage, isDamaged);
    }

    @Override
    public void startEngine() {
        System.out.println("Toyota Supra engine is started..");
    }
}
