public class Figure {
    public double x;
    public double y;

    private double getArea(){
        return x*y;
    }

    private double getPerimeter(){
        return (x + y)*2;
    }

    public Figure(float x, float y){
        this.x = x;
        this.y = y;
    }

    public static void main(String[] args) {
        Circle circle = new Circle(10, 10, 1);
        Rectangle rectangle = new Rectangle(10, 10, 1, 1);
        System.out.println(circle.getArea());
        System.out.println(rectangle.getPerimeter());
    }
}