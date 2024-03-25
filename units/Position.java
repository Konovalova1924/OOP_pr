package units;

import java.util.ArrayList;
import java.util.List;

public class Position {
    protected int x;
    protected int y;
    
    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public List<Integer> getPosition(){
        List<Integer> list = new ArrayList<>();
        list.add(x);
        list.add(y);
        return list;
    }

    public int getX(){    return x;}
    public int getY(){    return y;}
    
    public float distanceTo(Position target)
    {
        float x = getX() - target.getX();
        float y = getY() - target.getY();
        return (float) Math.sqrt(x*x + y*y);
    }
}
