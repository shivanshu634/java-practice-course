package myjavapackage.intermediate.encapsulation.car;

public class DodgeChallanger extends Car {

       public DodgeChallanger(String color, byte numberOfOwners, short power, short horsePower, int price, int mileage, boolean isDamaged){
           super("DodgeChallanger",color, numberOfOwners, power, horsePower,price, mileage, isDamaged );

        }

    @Override
    public void startEngine() {
        System.out.println("Dodge Challanger engine is started..");
    }
}

