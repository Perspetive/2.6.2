import java.lang.Math;
public class Circle extends Figure implements Moveable{
    private float  radius;

    Circle(float x, float y, float radius) {
        super(x, y);
        this.radius = radius;
    }

    @Override
    float getArea() {
        return (float) (Math.PI * Math.pow(radius, 2));
    }

    @Override
    float getPerimeter() {
        return 2 * (float) Math.PI * radius;
    }
    public void move(float dx, float dy) {
        this.x = x + dx;
        this.y = y + dy;
    }

    public void resize(float koeff) {
        this.radius = radius * koeff;
    }

    @Override
    public String toString() {
        System.out.println("Circle");
        System.out.println("Radius " + radius);
        return "Center: " + "(" + x + ", " + y + ")";
    }
}
