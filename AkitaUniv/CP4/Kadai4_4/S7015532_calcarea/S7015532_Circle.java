package Kadai4_4.S7015532_calcarea;

public class S7015532_Circle {
    private double area;

    public double getArea(double rad, double r) {
        area = Math.PI * Math.pow(r, 2) * ((rad * 57.2958) / 360);
        return area;
    }
}