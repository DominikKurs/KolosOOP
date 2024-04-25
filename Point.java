public class Point {
    public final float liczba1; //X
    public final float liczba2; //Y

    public Point(float liczba1, float liczba2){
        this.liczba1 = liczba1;                     //KONSRTUKTOR
        this.liczba2 = liczba2;
    }

    public float getX(){
        return liczba1;
    }                                               //GETERY
    public float getY(){
        return liczba2;
    }

}
