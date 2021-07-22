package myjavapackage.intermediate.endSectionPractice;

import java.util.Random;

public class Gang {

    private Criminal[] criminals = new Criminal[2];
    private Random randomNumberGenerator = new Random();
    private double sumRobbedValue;

    Gang(){
        Item[] robItems = new Item[2];
        robItems[0] = new Item("Blunt Swiss Knife",10.5);
        robItems[1] = new Item("Rotten apple",0.0);
        Criminal rob = new Criminal("Rob","The head",1976,"breaking in",robItems);
        criminals[0] = rob;

        Item[] bobbyItems = new Item[2];
        bobbyItems[0] = new Item("Baseball bat",20.5);
        bobbyItems[1] = new Item("Toothpick",0.5);
        Criminal bobby = new Criminal("Bobby","The Mountain",1978,"Knocking out",bobbyItems);
        criminals[1] = bobby;
    }

    public double getSumRobbedValue(){
        return sumRobbedValue;
    }

    public void printGangInfo(){
        for (Criminal criminal : criminals){
            System.out.println("-----------------------------");
            criminal.printBioData();
        }
    }

    private boolean  isSuccessPercentage(){
        int randomNumber = randomNumberGenerator.nextInt(101);
        int summarizedSuccessPercentage = criminals.length * Criminal.SUCCESS_PERCENTAGE;

        if(randomNumber >= summarizedSuccessPercentage){
            return false;
        }
        return true;
    }

    public void letsRob(Building[] buildings){
        int randomBuildingIndex = randomNumberGenerator.nextInt(4);
        System.out.println("-------------------------------------------------");
        if(isSuccessPercentage()){
            System.out.println("The gang managed to Rob the following items from the  " + buildings[randomBuildingIndex].getName() + ":");
            for(Item item : buildings[randomBuildingIndex].getItems()){
                sumRobbedValue += item.getValue();
                System.out.println("-" + item.getName());
            }
        }

        else{
            System.out.println("The gang tried to rob the "+ buildings[randomBuildingIndex].getName() + "but get failed");
        }
    }


}
