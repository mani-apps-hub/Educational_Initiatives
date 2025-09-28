package Mars;
import java.util.*;
import static java.lang.System.out;

public interface Direction {
    Direction turnLeft();
    Direction turnRight();
    Position moveForward(Position position);
    String name();
}
