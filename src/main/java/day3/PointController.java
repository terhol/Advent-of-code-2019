package day3;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class PointController {

    private String[] directions;


    public PointController(String[] directions) {
        this.directions = directions;
    }

    public List<Point> makeListOfPoints() {
        List<Point> finalLine = new ArrayList<>();
        Point originalPoint = new Point();
        for (String coordinates : directions) {
            int coordinatesNumber = makeNumber(coordinates);
            Direction coordinatesDirection = makeDirection(coordinates);
            for (int i = 0; i < coordinatesNumber; i++) {
                Point currentPoint = movePoint(originalPoint, coordinatesDirection);
                finalLine.add(currentPoint);
                originalPoint.setLocation(currentPoint);
            }
        }
        return finalLine;
    }

    private Point movePoint(Point originalPoint, Direction direction) {
        Point newPoint = new Point();
        switch (direction) {
            case U:
                newPoint.setLocation(originalPoint.getX(), originalPoint.getY() + 1);
                break;
            case D:
                newPoint.setLocation(originalPoint.getX(), originalPoint.getY() - 1);
                break;
            case L:
                newPoint.setLocation(originalPoint.getX() - 1, originalPoint.getY());
                break;
            case R:
                newPoint.setLocation(originalPoint.getX() + 1, originalPoint.getY());
                break;
        }
        return newPoint;

    }

    private Direction makeDirection(String coordination) {
        String direction = coordination.substring(0, 1);
        return Enum.valueOf(Direction.class, direction);
    }

    private int makeNumber(String coordination) {
        String direction = coordination.substring(1);
        return Integer.valueOf(direction);
    }
}
