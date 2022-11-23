public class Rectangle extends Figure implements Moveable {
    private float height;
    private float width;

    Rectangle(float x, float y, float height, float width) {
        super(x, y);
        this.width = width;
        this.height = height;
    }

    @Override
    float getArea() {
        return width * height;
    }

    @Override
    float getPerimeter() {
        return 2 * (width + height);
    }

    public void move(float dx, float dy) {
        this.x = x + dx;
        this.y = y + dy;
    }

    public void resize(float koeff) {
        this.width = width * koeff;
        this.height = height * koeff;
    }

    @Override
    public String toString() {
        System.out.println("Rectangle");
        System.out.println("Height " + height);
        System.out.println("Width " + width);
        return "Center: " + "(" + (width / 2 + x) + ", " + (height / 2 + y) + ")";
    }
}
