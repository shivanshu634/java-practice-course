package myjavapackage.intermediate.endSectionPractice;

import java.util.Random;

public class Police {

    private Detective adamPalmar;

    Police(){
        Item[] adamItems = new Item[2];
        adamItems[0] = new Item("Revolver",500.0);
        adamItems[1] = new Item("Magnifying Glass",10.0);

        adamPalmar = new Detective("Adam Palmar","Coyote",1960,"Chess",adamItems);
    }

    public boolean catchCriminals(Gang gang){
        if(areCriminalsCaught()){
            System.out.println(adamPalmar.getName()+ " managed to catch the gang");
            if(gang.getSumRobbedValue() > 0){
                System.out.println("The stolen items are Recovered");
                System.out.println("The overall value estimated to $" + gang.getSumRobbedValue());
            }else{
                System.out.println("The gang couln't steal anything");
            }
            return true;
        }else{
            System.out.println(adamPalmar.getName() + "failed to catch the gang");
            System.out.println("The gang managed to steal items valued $"+ gang.getSumRobbedValue());
            return false;
        }
    }



    private boolean areCriminalsCaught(){
        Random randomNumberGenerator = new Random();

        if(randomNumberGenerator.nextInt(101) >= Detective.SUCCESS_PERCENTAGE){

            return false;
        }
        return true;
    }
}
