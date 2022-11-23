abstract public class Figure {

    Figure(float x, float y){
        this.x = x;
        this.y = y;
    }
    float x;
    float y;

    abstract float getArea();

    abstract float getPerimeter();
}
