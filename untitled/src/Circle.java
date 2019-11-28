public class Circle extends Figure{
    public double radius;
    final double Pi = 3.1415927;

    public Circle(float x, float y, float radius) {
        super(x, y);
        this.radius = radius;
    }

    public double getArea(){
        return radius*radius*Pi;
    }
}
