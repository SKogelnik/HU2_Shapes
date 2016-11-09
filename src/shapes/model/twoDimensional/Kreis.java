package shapes.model.twoDimensional;

/**
 * Created by Stefan on 09.11.2016.
 */
public class Kreis extends Shape2D {

    private double r;

    public Kreis() {
    }

    public Kreis(double r) {
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Kreis kreis = (Kreis) o;

        return Double.compare(kreis.r, r) == 0;

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        temp = Double.doubleToLongBits(r);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public double calculateArea() {
        return Math.PI * r * r;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * r * Math.PI;
    }
}
