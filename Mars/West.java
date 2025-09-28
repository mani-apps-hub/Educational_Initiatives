package Mars;
import java.util.*;
import static java.lang.System.out;

class West implements Direction {
    public Direction turnLeft() { return new South(); }
    public Direction turnRight() { return new North(); }
    public Position moveForward(Position pos) { return pos.move(-1, 0); }
    public String name() { return "W"; }
}
