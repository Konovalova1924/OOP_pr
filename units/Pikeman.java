package units;
// Копейщик
public class Pikeman extends Person {
    
    public Pikeman(String name, int x, int y){
        super(name, 80, 30, 41, 30, 50, "pike", 20, "Копейщик", x, y);
    }
    public void attack(Person person){
        person.health -= this.power;
    }
    
}
