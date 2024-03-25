package units;
// Разбойник
public class Robber extends Person {
    public Robber (String name, int x, int y){
        super(name, 100, 50, 28, 20, 40, 
        "knife", 50, "Разбойник", x, y);        
    }
    public void attack(Person person){
        person.health -= this.power;
    }
    public void stealGold(int val){
        this.gold +=val; 
    }
    
}
