package Mars;
import java.util.*;
import static java.lang.System.out;

public class Rover {
    private Position position;
    private Direction direction;
    private final Grid grid;

    public Rover(Position position, Direction direction, Grid grid) {
        this.position = position;
        this.direction = direction;
        this.grid = grid;
    }

    public void execute(Command command) {
        command.execute(this);
    }

    public void moveForward() {
        Position newPosition = direction.moveForward(position);
        if (grid.isValidPosition(newPosition)) {
            this.position = newPosition;
        } else {
            System.out.println("Blocked: Obstacle or out-of-bounds at " + newPosition);
        }
    }

    public void turnLeft() {
        this.direction = direction.turnLeft();
    }

    public void turnRight() {
        this.direction = direction.turnRight();
    }

    public Position getPosition() {
        return position;
    }

    public Direction getDirection() {
        return direction;
    }

    public String report() {
        return "Rover is at " + position + " facing " + direction.name() + ".";
    }
}
