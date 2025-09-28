package Mars;
import java.util.*;
import static java.lang.System.out;

class TurnRightCommand implements Command {
    public void execute(Rover rover) {
        rover.turnRight();
    }
}
 