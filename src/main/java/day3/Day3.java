package day3;

import utils.InputReader;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Day3 {
    private List<Point> pointsForFirstWire;
    private List<Point> pointsForSecondWire;
    private List<Point> samePoints;


    public Day3() throws IOException {
        List<String> bothWires = InputReader.readLines(new File("C:\\Users\\teholm\\Downloads\\Advent-of-code-2019\\src\\main\\resources\\Day3.txt"));
        String[] firstWire = bothWires.get(0).split(",");
        String[] secondWire = bothWires.get(1).split(",");
        PointController firstWireController = new PointController(firstWire);
        PointController secondWireController = new PointController(secondWire);
        this.pointsForFirstWire = firstWireController.makeListOfPoints();
        this.pointsForSecondWire = secondWireController.makeListOfPoints();
        this.samePoints = findSamePoints(pointsForFirstWire, pointsForSecondWire);
    }

    public double solveDayThree() {
        return findLowestDistance(samePoints);
    }

    public int solveDayThreePartTwo() {
        return findLowestNumberOfSteps(samePoints, pointsForFirstWire, pointsForSecondWire);

    }

    private List<Point> findSamePoints(List<Point> firstWire, List<Point> secondWire) {
        List<Point> samePoints = new ArrayList<>();
        for (Point coordinates : firstWire) {
            if (secondWire.contains(coordinates)) {
                samePoints.add(coordinates);
            }
        }
        return samePoints;
    }

    private double findLowestDistance(List<Point> points) {
        double lowestDistance = 1000000;
        for (Point point : points) {
            double distance = Math.abs(point.getX()) + Math.abs(point.getY());
            if (distance < lowestDistance) {
                lowestDistance = distance;
            }
        }
        return lowestDistance;
    }

    private int findLowestNumberOfSteps(List<Point> samePoints, List<Point> firstList, List<Point> secondList) {
        int numberOfSteps = 1000000000;
        for (Point point : samePoints) {
            if (firstList.indexOf(point) + secondList.indexOf(point) < numberOfSteps) {
                numberOfSteps = firstList.indexOf(point) + secondList.indexOf(point);
            }
        }
        return numberOfSteps + 2;
    }

}
