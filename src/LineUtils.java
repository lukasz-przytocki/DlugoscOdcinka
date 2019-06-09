public class LineUtils {

    Line findLongerLine(Line Line1, Line Line2){
        double lineLenght1 = lineLenght(Line1);
        double lineLenght2 = lineLenght(Line2);
        if(lineLenght1>lineLenght2){
            return Line1;
            }else{
            return Line2;
        }
    }

    double lineLenght(Line line){
        double xx = Math.pow(line.getB().getX() - line.getA().getX(),2);
        double yy = Math.pow(line.getB().getY() - line.getA().getY(),2);
        double sum = xx+yy;
        return Math.sqrt(sum);

    }
}
