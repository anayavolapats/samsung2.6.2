public class Rectangle extends Figure implements Moveable{
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

    @Override
    public void move(float dx, float dy) {
        this.x = this.x + dx;
        this.y = this.y + dy;
    }

    @Override
    public void resize(float koeff) {
        this.height = height * koeff;
        this.width = width * koeff;
    }
    @Override
    public String toString(){
        return("Rectangle" + "\n" + "Center: (" + (x + width/2) + ", " + (y + height/2) +")" + "\n" + "Height: " + height + "\n" + "Width: " + width);
    }
}