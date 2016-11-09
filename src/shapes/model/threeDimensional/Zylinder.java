package shapes.model.threeDimensional;

/**
 * Created by Stefan on 09.11.2016.
 */
public class Zylinder extends Shape3D {

    private double r, h;

    public Zylinder() {
    }

    public Zylinder(double r, double h) {
        this.r = r;
        this.h = h;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Zylinder zylinder = (Zylinder) o;

        if (Double.compare(zylinder.r, r) != 0) return false;
        return Double.compare(zylinder.h, h) == 0;

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        temp = Double.doubleToLongBits(r);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(h);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public double calculateVolume() {
        return Math.PI * r * r * h;
    }

    @Override
    public double calculateSurfaceArea() {
        return 2 * Math.PI * r * r + 2 * Math.PI * r * h;
    }
}
