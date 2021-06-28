package myjavapackage.intermediate.encapsulation.car;

public class CarsApp {
    public static void main(String[] args) {

        DodgeChallanger redDodgeChallanger = new DodgeChallanger("red",(byte)3,(short)395,(short)592,35000,9000,false);
        System.out.println(redDodgeChallanger.getCarName() + "'s price is $ " + redDodgeChallanger.getPrice());
        redDodgeChallanger.setPrice(40000);
        System.out.println(redDodgeChallanger.getCarName()+"'s new price is $" + redDodgeChallanger.getPrice());
        redDodgeChallanger.startEngine();
        System.out.println("The car has " + redDodgeChallanger.getMileage()+ " Miles");
        redDodgeChallanger.drive(100);
        System.out.println("After driving the car, it has " + redDodgeChallanger.getMileage()+ " Miles");



        System.out.println("-----------------------------------");
        ToyotaSupra blackToyotaSupra = new ToyotaSupra("black", (byte)1, (short)225, (short)717,40000, 15000, false);
        System.out.println(blackToyotaSupra.getCarName() + "'s price is $ " + blackToyotaSupra.getPrice());
        blackToyotaSupra.setPrice(45000);
        System.out.println(blackToyotaSupra.getCarName()+"'s new price is $" + blackToyotaSupra.getPrice());
        redDodgeChallanger.startEngine();
        System.out.println("The car has " + blackToyotaSupra.getMileage()+ " Miles");
        blackToyotaSupra.drive(100);
        System.out.println("After driving the car, it has " + blackToyotaSupra.getMileage()+ " Miles");
    }
}
