import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        LineReader lineReader = new LineReader();
        System.out.println("Tworzenie pierwszego odcinka");
        Line line1 = lineReader.createLine();

        System.out.println("Tworzenie drugiego odcinka");
        Line line2 = lineReader.createLine();

        LineUtils lineUtils = new LineUtils();
        Line longerLine = lineUtils.findLongerLine(line1,line2);
        System.out.println("Początek odcinka: " + longerLine.getA().getX() + " " + longerLine.getA().getY());
        System.out.println("Koniec odcinka: " +longerLine.getB().getX() + " " + longerLine.getB().getY());
        System.out.println("Długość dłuższego odcinka: " + lineUtils.lineLenght(longerLine));

    }
}
