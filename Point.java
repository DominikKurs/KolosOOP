public class Point {
    public final double liczba1; //X
    public final double liczba2; //Y

    public Point(double liczba1, double liczba2){
        this.liczba1 = liczba1;                     //KONSRTUKTOR
        this.liczba2 = liczba2;
    }

    public double getX(){
        return liczba1;
    }                                               //GETERY
    public double getY(){
        return liczba2;
    }

}
