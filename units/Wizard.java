package units;
// Колдун
public class Wizard extends Person {
    private int mana;
    private int healVal;
    private int healPrice;
    private int attackPrice;

    public Wizard(String name, int x, int y) {
        super(name, 80, 30, 50, 
        5, 30, "Stick", 30, "Колдун", x, y);
        this.mana = 10;
        this.healPrice = 2;
        this.attackPrice = 1;
    }
    
    public void attack(Person person){
        person.health -= this.power;
        this.mana -= price("attack");
    }
    public void heal(Person person, int val) {
        person.health += this.healVal;
        this.mana -= price("heal");
    }
    public void heal(int val) {
        super.health +=this.healVal;
        this.mana -= price("heal");
    }
    private int price(String action) {
        if (action == "heal") return healPrice;
        else if (action == "attack") return attackPrice;
    }
}
