public class Circle extends Figure implements Moveable{
    public double radius;
    final double Pi = 3.1415927;

    public Circle(float x, float y, float radius) {
        super(x, y);
        this.radius = radius;
    }

    public double getArea(){
        return radius*radius*Pi;
    }

    @Override
    public void move(float dx, float dy) {
        this.x = this.x + dx;
        this.y = this.y + dy;
    }

    @Override
    public void resize(float koeff) {
        this.radius = this.radius * koeff;
    }
    @Override
    public String toString(){

        return("Circle" + "\n" + "Center: (" + x + ", " + y +")" + "\n" + "Radius: " + radius);
    }
}
