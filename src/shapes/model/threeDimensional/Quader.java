package shapes.model.threeDimensional;

/**
 * Created by Stefan on 09.11.2016.
 */
public class Quader extends Shape3D {

    private Double a, b , c;

    public Quader() {
    }

    public Quader(Double a, Double b, Double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }


    public Double getA() {
        return a;
    }

    public void setA(Double a) {
        this.a = a;
    }

    public Double getB() {
        return b;
    }

    public void setB(Double b) {
        this.b = b;
    }

    public Double getC() {
        return c;
    }

    public void setC(Double c) {
        this.c = c;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Quader quader = (Quader) o;

        if (a != null ? !a.equals(quader.a) : quader.a != null) return false;
        if (b != null ? !b.equals(quader.b) : quader.b != null) return false;
        return c != null ? c.equals(quader.c) : quader.c == null;

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (a != null ? a.hashCode() : 0);
        result = 31 * result + (b != null ? b.hashCode() : 0);
        result = 31 * result + (c != null ? c.hashCode() : 0);
        return result;
    }

    @Override
    public double calculateVolume() {
        return a * b * c;
    }

    @Override
    public double calculateSurfaceArea() {
        return 2 * (a*b + a*c + b*c);
    }
}
