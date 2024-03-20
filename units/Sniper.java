package units;
// Снайпер
public class Sniper extends Person {
    
    private int arrowNum;
    boolean inGame = true;
    
    public Sniper(String name, int age) {
        super(name, 60, 40, age, 20, 40, 
        "gun", 30);
    }
    public void attack(Person person){
        person.health -= this.power;
    }
    public boolean isInGame() {
        return this.arrowNum == 0 ? false : true;
    }
}
