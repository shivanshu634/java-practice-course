package myjavapackage.intermediate.encapsulationPractice;


import myjavapackage.intermediate.inheritancePactice.Diablo;

public class GameApp {

    //Main Class Method

    public static void main(String[] args) {

        myjavapackage.intermediate.inheritancePactice.Diablo diablo = new Diablo("Diablo","RPG","Blizzard North",(short)1977,
                (byte)3,24000000,(float)4.5,(float)59.8);
        System.out.println("The game name: "+diablo.getGameName());
        System.out.println("The previous game chapters: "+ diablo.getNumberOfChapter());
        diablo.setLatestGamePrice((float)49.8);
        diablo.setNumberOfChapter((byte)4);
        System.out.println("The new number of Chapters: "+diablo.getNumberOfChapter());

        System.out.println("----------------------------------------");

        Warcraft warcraft = new Warcraft("Warcraft","RTS","Blizzard Entertainment",(short)1994,(byte)4,25000000,(float)4.6,(float)11.2);
        System.out.println("The game name: "+warcraft.getGameName());
        System.out.println("The previous game chapter: "+ warcraft.getNumberOfChapter());
        warcraft.setLatestGamePrice((float)49.8);
        warcraft.setNumberOfChapter((byte)5);
        System.out.println("The new number of Chapters: "+warcraft.getNumberOfChapter());

    }

}
