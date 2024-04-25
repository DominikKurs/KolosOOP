import java.util.List;

public class Main{
    public static void main(String[] args){
        Polygon polygon = new Polygon(List.of(
            new Point(0, 0),
            new Point(4, 0),
            new Point(4, 4),
            new Point(0,4)
        ));
    

        Point pointInside = new Point(2, 2);

        System.out.println("Czy punkt leży w wielokącie?: " + polygon.isInside(pointInside));

        Point pointBelow = new Point(2, 1);

        System.out.println("Czy punkt leży pod wielokątem?: " + polygon.isInside(pointBelow));

        Point pointRight = new Point(5, 2);

        System.out.println("Czy punkt leży na prawo od wielokąta?: " + polygon.isInside(pointRight));
    }   
}