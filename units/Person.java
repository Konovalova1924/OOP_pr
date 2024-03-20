package units;

public abstract class Person {
    protected String name;
    protected int health;
    protected int power;
    protected int age;
    protected int armor;
    protected int endurance; // Выносливость
    protected String weapon;
    protected int gold;
    
    public Person(String name, int health, int power, int age, int armor, 
    int endurance, String weapon, int gold){
        this.name = name;
        this.health = health;
        this.power = power;
        this.age = age;
        this.armor = armor;
        this.endurance = endurance;
        this.weapon = weapon;
        this.gold = gold;
    }
    @Override
    public String toString() {
        return name;
    }    


}
