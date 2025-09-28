package Mars;
import java.util.*;
import static java.lang.System.out;
public class South implements Direction {
    public Direction turnLeft() { return new East(); }
    public Direction turnRight() { return new West(); }
    public Position moveForward(Position pos) { return pos.move(0, -1); }
    public String name() { return "S"; }
}
