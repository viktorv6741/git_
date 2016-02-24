package jmx;

public interface CircleMBean {

    double getArea();

    double getPerimeter();

    void setRadius(double radius);

    void createObjectFromBaseEntity() throws CloneNotSupportedException;

    String getInformationAboutObject();
}
