import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class City extends Polygon{
    public final Point center;
    String name;
    private boolean isPort = false;
    Set<Resource.Type> resources;
    
   public City(Point center, String name, double wallLength){
        super(calculateCityCorners(center, wallLength));
        this.center = center;
        this.name = name;
   }

   public Set<Resource.Type> getResources(){                //Zbiór Set obiektów xyz.xyz
        return resources;
   }

   private static List<Point> calculateCityCorners(Point center, double wallLength){
        List<Point> corners = new ArrayList<Point>();
        double halfLength = wallLength / 2;
        corners.add(new Point(center.liczba1 - halfLength, center.liczba2 - halfLength));
        corners.add(new Point(center.liczba1 + halfLength, center.liczba2 - halfLength));
        corners.add(new Point(center.liczba1 - halfLength, center.liczba2 + halfLength));
        corners.add(new Point(center.liczba1 + halfLength, center.liczba2 + halfLength));
        return corners;
   }


    public void setPort(Land land){
        for(Point point : land.getPoints()){
            if(!land.isInside(point)){
                isPort = true;
                return;
            }
        }
   }

    void addResourcesInRange(List<Resource> resources, double range){
        for(Resource resource : resources) {
            if(range <= Math.hypot(this.center.liczba1 - resource.localization.liczba1, this.center.liczba2 - resource.localization.liczba2)) {
                if(!resource.type.equals(Resource.Type.Fish)) {
                    this.resources.add(resource.type);
                } else {
                    if(this.isPort) {
                        this.resources.add(resource.type);
                    }
                }
            }
        }
    }
}
