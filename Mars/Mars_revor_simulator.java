package Mars;
import java.util.*;
import static java.lang.System.out;

public class Mars_revor_simulator {
    public static void main(String[] args) {
        Set<Position> obstacles = new HashSet<>(Arrays.asList(
            new Position(2, 2),
            new Position(3, 5)
        ));

        Grid grid = new Grid(10, 10, obstacles);
        Rover rover = new Rover(new Position(0, 0), new North(), grid);

        List<Command> commands = Arrays.asList(
            new MoveCommand(),
            new MoveCommand(),
            new TurnRightCommand(),
            new MoveCommand(),
            new TurnLeftCommand(),
            new MoveCommand()
        );

        for (Command command : commands) {
            rover.execute(command);
        }

        out.println(rover.report());
    }
}
