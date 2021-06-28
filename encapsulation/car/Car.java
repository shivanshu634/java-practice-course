package myjavapackage.intermediate.encapsulation.car;

import java.util.Random;

public class Car {
    private byte numberOfSeats = 5;
    private byte numberOfDoors = 5;
    private byte numberOfOwners = 1;
    private byte emissionSticker = 4;

    private short power = 362;
    private short horsePower = 492;
    private short co2Emission = 333;
    private short cubicCapacity = 6417;


    private int price = 29999;
    private int mileage = 1499;

    private long registrationNumber = 2983948738748371L;

    private float fuelConsumptionCombined = 15.5F;
    private float fuelConsumptionUrban = 21.5F;
    private float fuelConsumptionExtraUrban = 13.5F;

    private double fuelConsumptionPreciseAverage = 12.6767676776;

    private boolean isDamaged = true;

    private char energyEfficiency = 'G';

    private String color;
    private String carName;

    public void startEngine(){

        System.out.println("The engine is started..");
    }

    public Car(String carName, String color, byte numberOfOwners, short power, short horsePower, int price, int mileage, boolean isDamaged){
        this.carName = carName;
        this.color = color;
        this.numberOfOwners = numberOfOwners;
        this.power = power;
        this.horsePower = horsePower;
        this.price = price;
        this.mileage = mileage;
        this.isDamaged = isDamaged;
        Random randomNumberGenerator = new Random();
        this.registrationNumber = randomNumberGenerator.nextLong();

    }

    public void getDescription(){

        System.out.println("A " + color + carName +" is created..");
        System.out.println("Price:" + price + "euro");
        System.out.println("Mileage: " + mileage + "Km");
        System.out.println("The car is Damaged: " + isDamaged);
        System.out.println("Registration number:" + registrationNumber);
        System.out.println("Cubic Capacity: " + cubicCapacity + "ccm");
        System.out.println("Power: " + power + "KW(" + horsePower + "hp)");
        System.out.println("CO2 emission: " + co2Emission + "g/km");
        System.out.println("Emission sticker: " + emissionSticker + "( Energy efficiency category: " + energyEfficiency + ")");
        System.out.println("Combined Fuel Consumption: " + fuelConsumptionCombined + "l/100Km");
        System.out.println("Urban Fuel Consumption: " + fuelConsumptionUrban + "l/100Km");
        System.out.println("Extra Urban Fuel Consumption: " + fuelConsumptionExtraUrban + "l/100Km");
        System.out.println("Precised Combined Fuel consumption:  " + fuelConsumptionPreciseAverage + "l/100Km");
        System.out.println("Precised Combined Fuel consumption:  " + fuelConsumptionPreciseAverage + "l/100Km");
        System.out.println("Number of Owner:  " + numberOfOwners);
        System.out.println("Number of Doors:  " + numberOfDoors);
        System.out.println("Number of Seats:  " + numberOfSeats);
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = Math.abs(price);
    }

    public int getMileage() {
        return mileage;
    }

    public void drive(int mileage){
        this.mileage += Math.abs(mileage);

    }
    public String getCarName(){
        return carName;
    }
}
