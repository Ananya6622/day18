class Point {
    private final int x;
    private final int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}

class Line {
    private final Point startPoint;
    private final Point endPoint;

    public Line(Point startPoint, Point endPoint) {
        this.startPoint = startPoint;
        this.endPoint = endPoint;
    }

    public double calculateLength() {
        int x1 = startPoint.getX();
        int y1 = startPoint.getY();
        int x2 = endPoint.getX();
        int y2 = endPoint.getY();

        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public boolean equals(Line otherLine) {
        return this.startPoint.equals(otherLine.startPoint) && this.endPoint.equals(otherLine.endPoint);
    }
}

public class LineComparisonComputation {
    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison Computation Program");

        
        Point startPoint1 = new Point(1, 2);
        Point endPoint1 = new Point(4, 6);
        Line line1 = new Line(startPoint1, endPoint1);

        Point startPoint2 = new Point(2, 3);
        Point endPoint2 = new Point(5, 7);
        Line line2 = new Line(startPoint2, endPoint2);

        
        boolean areEqual = line1.equals(line2);

        if (areEqual) {
            System.out.println("The two lines are equal.");
        } else {
            System.out.println("The two lines are not equal.");
        }
    }
}
