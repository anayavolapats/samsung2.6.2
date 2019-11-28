public class Rectangle extends Figure{
    public double height;
    public double width;

    public Rectangle(float x, float y, float height, float width) {
        super(x, y);
        this.height = height;
        this.width = width;
    }
    public double getArea(){
        return height*width;
    }
    public double getPerimeter(){
        return (height + width)*2;
    }

}