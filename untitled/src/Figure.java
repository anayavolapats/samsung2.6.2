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

}