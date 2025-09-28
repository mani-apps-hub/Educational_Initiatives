package Mars;
import java.util.*;
import static java.lang.System.out;

class TurnLeftCommand implements Command {
    public void execute(Rover rover) {
        rover.turnLeft();
    }
}

