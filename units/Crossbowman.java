package units;
// Арбалетчик
public class Crossbowman extends Person{
    
    public Crossbowman(String name, int x, int y) {
        super(name, 60, 40, 38, 20, 40, 
        "crossbow", 30, "Арбалетчик", x, y);
    }
    
    public void attack(Person person){
        person.health -= this.power;
    }

}
