package myjavapackage.intermediate.encapsulation.athlete;

public class AthleteApp {
    public static void main(String[] args) {
        BasketballPlayer kobe = new BasketballPlayer("kobe Bryant","Black Mamba",1978,"Lakers",83.7,25.0,1346);
        kobe.setFreeThrowPercentage(83.8);
        kobe.setPointsPerGame(25.5);
        BasketballPlayer jordan = new BasketballPlayer("Michael Jordan","MJ",1963,"Chicago Bulls",83.5,30.1,1072);
        BasketballPlayer magic = new BasketballPlayer("Earvin Johnsons","Magic",1959,"Lakers",84.5,19.5,906);

        BasketballPlayer[] basketballPlayers = new BasketballPlayer[3];
        basketballPlayers[0] = kobe;
        basketballPlayers[1] = jordan;
        basketballPlayers[2] = magic;

        for(BasketballPlayer basketballPlayer : basketballPlayers){
            System.out.println("--------------------------------------");
            basketballPlayer.playGame();
            System.out.println("---------------------------------------");
            basketballPlayer.getBio();
        }
        FootballPlayer tom = new FootballPlayer("tom Brady","tom Terrific",1977,"Tampa Bay",285,9988,6377);
        tom.increaseCompletions(35);
        tom.increasePassingYards(17);
        FootballPlayer ed = new FootballPlayer("ed Brady","ed Terrific",1979,"New England Patriots",385,8988,4377);
        ed.setTeam("Tampa Bay");
        FootballPlayer[] footballPlayers = new FootballPlayer[2];
        footballPlayers[0] = tom;
        footballPlayers[1] = ed;

        for(FootballPlayer footballPlayer : footballPlayers){
            System.out.println("--------------------------------------");
            footballPlayer.playGame();
            System.out.println("--------------------------------------");
            footballPlayer.getBio();
        }
    }
}
