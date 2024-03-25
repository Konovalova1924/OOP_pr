package units;
// Монах
public class Monk extends Person {
    private int mana;
    private int healVal;
    private int healPrice;

    public Monk (String name, int x, int y) {
        super(name, 60, 40, 34, 20, 40, 
        "spirit", 30,"Монах", x, y); 
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
    }
}
