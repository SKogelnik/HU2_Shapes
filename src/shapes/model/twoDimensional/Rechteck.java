package shapes.model.twoDimensional;

/**
 * Created by Stefan on 09.11.2016.
 */
public class Rechteck extends Shape2D {

    private Double a, b;

    public Rechteck() {
    }

    public Rechteck(Double a, Double b) {
        this.a = a;
        this.b = b;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Rechteck rechteck = (Rechteck) o;

        if (a != null ? !a.equals(rechteck.a) : rechteck.a != null) return false;
        return b != null ? b.equals(rechteck.b) : rechteck.b == null;

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (a != null ? a.hashCode() : 0);
        result = 31 * result + (b != null ? b.hashCode() : 0);
        return result;
    }

    @Override
    public double calculateArea() {
        return a * b;
    }

    @Override
    public double calculatePerimeter() {
        return 2*a + 2*b;
    }
}
