package Mars;
import java.util.*;
import static java.lang.System.out;

class MoveCommand implements Command {
    public void execute(Rover revor){ revor.moveForward(); }
}
