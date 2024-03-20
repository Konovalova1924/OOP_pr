import units.*;

public class Main {
    public static void main(String[] args) {
        
        Crossbowman crossbowman = new Crossbowman("Viktor", 37);
        Monk monk = new Monk("Daniil", 50);
        Peasant peasant = new Peasant("Adriil", 39);
        Pikeman pikeman = new Pikeman("Serafim", 36);
        Robber robber = new Robber("Mihail", 40);
        Sniper sniper = new Sniper("Maksimiil", 35);
        Wizard wizard = new Wizard("Gektor", 37);
    
        System.out.println(crossbowman);
        System.out.println(monk);
        System.out.println(peasant);
        System.out.println(pikeman);
        System.out.println(robber);
        System.out.println(sniper);
        System.out.println(wizard);
        
    }
    
}