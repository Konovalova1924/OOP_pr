import java.util.ArrayList;
import java.util.Random;

import units.*;

public class Main {
    public static void main(String[] args) {
        hollyTeam = teamCreator(0, 0);
        darkTeam = teamCreator(0, 3);
        System.out.println("hollyTeam : " + hollyTeam);
        System.out.println();
        System.out.println("darkTeam : " + darkTeam);
        
        Sniper sniper = new Sniper("Leomont", 5, 4);
        Person target = sniper.findNearestPerson(hollyTeam);
        System.out.println("Nearest hollyTeam target at " + target);
        target = sniper.findNearestPerson(darkTeam);
        System.out.println("Nearest darkTeam target at " + target);
        
    } 
       
        public static ArrayList<Person> hollyTeam;

        public static ArrayList<Person> darkTeam;

        private static ArrayList<Person> teamCreator(int val, int numm) {
            ArrayList<Person> team = new ArrayList<Person>();
            int teamCount = 10;
            for (int i = 0; i < teamCount; i++) {
                switch (new Random().nextInt(4) + numm) {
                    case 0: team.add(new Crossbowman(fillName(), 0, i));
                        break;
                    case 1: team.add(new Monk(fillName(), 0, i));
                        break;
                    case 3: team.add(new Peasant(fillName(), numm*3, i));
                        break;
                    case 2: team.add(new Pikeman(fillName(), 0, i));
                        break;
                    case 4: team.add(new Robber(fillName(), 9, i));
                        break;
                    case 5: team.add(new Sniper(fillName(), 9, i));
                        break;
                    case 6: team.add(new Wizard(fillName(), 9, i));
                        break;
                }
            }
        return team;
        }        

    private static String fillName(){
        return String.valueOf(Names.values()[new Random().nextInt(Names.values().length - 1)]);
    }


}