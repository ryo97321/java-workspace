package S7015532_conversion;

public class S7015532_LengthConversion {
    private double km;

    public double getMile(double km) {
        this.km = km;
        double mile = km * 0.6214;
        return mile;
    }

    public double getYard(double km) {
        this.km = km;
        double yard = km * 1093.6133;
        return yard;
    }

}