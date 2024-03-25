package units;
// Снайпер
public class Sniper extends Person {
    
    private int arrowNum;
    boolean inGame = true;
    
    public Sniper(String name, int x, int y) {
        super(name, 60, 40, 33, 20, 40, 
        "gun", 30, "Снайпер", x, y);
    }
    public void attack(Person person){
        person.health -= this.power;
    }
    public boolean isInGame() {
        return this.arrowNum == 0 ? false : true;
    }
     
}
