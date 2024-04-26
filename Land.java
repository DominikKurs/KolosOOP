import java.util.ArrayList;
import java.util.List;

public class Land extends Polygon{
    public Land(List<Point> points) {
        super(points);
    }
    
    private List<City> cities = new ArrayList<City>();           //TWORZENIE LISTY!!!!


    public void addCity(City city){
        if(isCityOnLand(city)){                 //METODA KTÓRA SPRAWDZA CZY DANE MIASTO ZNAJDUJE SIĘ NA LĄDZIE, isCityOnLand jest poniżej!!!
            cities.add(city);
        }
        else{
            throw new RuntimeException("Miasto " + city.name + " nie znajduję się na lądzie.");         //throw new RuntimeException, można naprzemiennie użyć z try{} i catch{}
        }
    }

    private boolean isCityOnLand(City city){
        double cityCenterX = city.center.getX();
        double cityCenterY = city.center.getY();

        double x_min = 0;
        double x_max = 100;
        double y_min = 0;
        double y_max = 100;

        return cityCenterX >= x_min && cityCenterX <= x_max && cityCenterY >= y_min && cityCenterY <=y_max;
    }
}
/*
 * kod zastępczy do linii 17:
 * try{
 *  land.addCity(city);
 * }
 * catch(RuntimeException e){
 *  System.out.println(xyz + e.getMessage());
 * }
 */