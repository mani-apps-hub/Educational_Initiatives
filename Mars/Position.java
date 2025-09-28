package Mars;
import java.util.*;
import static java.lang.System.out;

public class Position{
    private final int x;
    private final int y;
    public Position(int X,int Y){
        x=X;
        y=Y;
    }
    public Position move(int dx,int dy){
        return new Position(x+dx , y+dy);
    }
    public int getX() { return x; }
    public int getY() { return y; }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Position)) return false;
        Position p = (Position) obj;
        return p.x == this.x && p.y == this.y;
    }
    @Override
    public int hashCode() {
        return x * 31 + y;
    }
    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}