

package Mars;
import java.util.*;
import static java.lang.System.out;

class Grid {
    private final int width;
    private final int height;
    private final Set<Position> obstacles = new HashSet<>();

    public Grid(int width, int height, Set<Position> obstacles) {
        this.width = width;
        this.height = height;
        this.obstacles.addAll(obstacles);
    }

    public boolean isValidPosition(Position pos) {
        boolean withinBounds = pos.getX() >= 0 && pos.getX() < width &&
                               pos.getY() >= 0 && pos.getY() < height;
        boolean noObstacle = !obstacles.contains(pos);
        return withinBounds && noObstacle;
    }
}
