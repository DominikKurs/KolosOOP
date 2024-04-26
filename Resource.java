public class Resource{
    public enum Type{           //ENUM = TYP WYLICZENIOWY
        Coal,
        Wood,
        Fish
    }

    public Point localization;
    public Type type;

    public Resource(Point point, Type type){
        this.localization = localization;
        this.type = type;
    }
}