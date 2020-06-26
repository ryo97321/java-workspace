package S7015532_calcarea;

public class S7015532_Triangle extends Polygon {
    public double getArea(double base, double height) {
        this.base = base;
        this.height = height;

        double area = this.base * this.height / 2.0;
        return area;
    }
}