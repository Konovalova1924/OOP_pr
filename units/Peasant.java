package units;
// Крестьянин 
public class Peasant extends Person {
    private int arrowNum;
    boolean inGame = true;
    public Peasant(String name, int x, int y){
        super(name, 20, 5, 44, 0, 20, 
        "nothing", 50, "Крестьянин", x, y);
    }
    public void giveArrows(int val) {
        this.arrowNum -= val;
        if (!isInGame()) { 
            inGame = false;
        }
    }
    public boolean isInGame() {
        return this.arrowNum == 0 ? false : true;
    }
}
