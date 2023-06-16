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
}

public class LineComparisonComputation {
    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison Computation Program");

        
        Point startPoint = new Point(1, 2);
        Point endPoint = new Point(4, 6);

        
        Line line = new Line(startPoint, endPoint);

        
        double length = line.calculateLength();

        System.out.println("Length of the line: " + length);
    }
}
