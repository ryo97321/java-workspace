package S7015532_calcarea;


public class S7015532_Rectangle extends Polygon {
    public double getArea(double base, double height) {
        this.base = base;
        this.height = height;

        double area = this.base * this.height;
        return area;
    }
}