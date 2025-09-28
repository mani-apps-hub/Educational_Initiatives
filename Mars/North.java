package Mars;
import java.util.*;
import static java.lang.System.out;
public class North implements Direction {
    public Direction turnLeft() { return new West(); }
    public Direction turnRight() { return new East(); }
    public Position moveForward(Position pos) { return pos.move(0, 1); }
    public String name() { return "N"; }
}
