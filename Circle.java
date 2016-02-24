
import java.awt.*;

public class Circle implements CircleMBean, Cloneable {

    private double radius;
    private Circle originalCircle;
    private Circle clonedCircle;

    //constructors
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public Circle(double radius, Circle originalCircle) {
        this.radius = radius;
        this.originalCircle = originalCircle;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle() {
    }

    //methods
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    @Override
    public double getArea() {
        return Math.PI * radius;
    }

    @Override
    public double getPerimeter() {
        return Math.PI * 2 * radius;
    }

    //getters & setters
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public double getRadius() {
        return radius;
    }

    @Override
    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Circle getOriginalCircle() {
        return originalCircle;
    }

    public void setOriginalCircle(Circle c) {
        this.originalCircle = originalCircle;
    }

    public void setClonedCircle(Circle clonedCircle) {
        this.clonedCircle = clonedCircle;
    }

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    @Override
    public String toString() {
        return "RADIUS = " + radius + "\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Circle)) return false;

        Circle circle = (Circle) o;

        return Double.compare(circle.getRadius(), getRadius()) == 0;
    }

    @Override
    public int hashCode() {
        long temp = Double.doubleToLongBits(getRadius());
        return (int) (temp ^ (temp >>> 32));
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Circle clone = (Circle) super.clone();
        return clone;
    }

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    @Override
    public void createObjectFromBaseEntity() throws CloneNotSupportedException {

        Circle clonedCircle = (Circle) originalCircle.clone();
        this.clonedCircle = clonedCircle;

    }

    @Override
    public String getInformationAboutObject() {
        return "RADIUS = " + clonedCircle.radius + "\n";
    }

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

}



