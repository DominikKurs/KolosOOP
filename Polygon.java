import java.util.List;
import java.lang.Math;

public class Polygon {
    private List<Point> points;

    public Polygon(List<Point> points){
        this.points = points;
    }

    public double obliczDlugosc(Point x, Point y){
        double d = Math.sqrt(Math.pow(x.getX() - y.getX(), 2) + Math.pow(x.getY() - y.getY(), 2));
        return d;
    }

    public boolean isInside(Point point){
        int counter = 0;
        int n = points.size();

        for(int i = 0; i < n; i++){
            Point pa = points.get(i);
            Point pb = points.get((i + 1) % n);
            double x = 0;

            if(pa.getY() > pb.getY()){
                Point temp = pa;
                pa = pb;
                pb = temp;
            }

            if(pa.getY() < point.getY() && point.getY() < pb.getY()){
                double d = pb.getX() - pa.getX();
                if(pa.getX() == pb.getX()){
                    x = pa.getX();
                }
                else{
                    double a = (pb.getY() - pa.getY()) / d;
                    double b = pa.getY() - a * pa.getX();
                    x = (point.getY() - b) / a;
                }
            }
            
            if(x < point.getX()){
                counter++;
            }
        }

        return counter % 2 != 0;
    }
}
