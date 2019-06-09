import java.util.Scanner;

public class LineReader {
    Scanner scanner = new Scanner(System.in);


    Line createLine(){
        System.out.printf("Enter first point x coordinate: ");
        int p1x= (scanner.nextInt());
        System.out.printf("Enter first point y coordinate: ");
        int p1y =(scanner.nextInt());
        System.out.printf("Enter second point x coordinate: ");
        int p2x =(scanner.nextInt());
        System.out.printf("Enter second point y coordinate: ");
        int p2y =(scanner.nextInt());
        Line line = new Line(new Point(p1x,p1y), new Point(p2x,p2y));
        return line;
    }

}
