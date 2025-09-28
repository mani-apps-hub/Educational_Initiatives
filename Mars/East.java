package Mars;
import java.util.*;
import static java.lang.System.out;

public class East implements Direction {
    public Direction turnLeft() { return new North(); }
    public Direction turnRight() { return new South(); }
    public Position moveForward(Position pos) { return pos.move(1, 0); }
    public String name() { return "E"; }
}
