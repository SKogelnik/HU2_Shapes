package shapes.model.threeDimensional;

/**
 * Created by Stefan on 09.11.2016.
 */
public class Pyramide extends Shape3D {

    private Double a, b, c, ha, hb, h;

    public Pyramide() {
    }

    public Pyramide(Double a, Double b, Double c, Double ha, Double hb, Double h) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.ha = ha;
        this.hb = hb;
        this.h = h;
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

    public Double getHa() {
        return ha;
    }

    public void setHa(Double ha) {
        this.ha = ha;
    }

    public Double getHb() {
        return hb;
    }

    public void setHb(Double hb) {
        this.hb = hb;
    }

    public Double getH() {
        return h;
    }

    public void setH(Double h) {
        this.h = h;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Pyramide pyramide = (Pyramide) o;

        if (a != null ? !a.equals(pyramide.a) : pyramide.a != null) return false;
        if (b != null ? !b.equals(pyramide.b) : pyramide.b != null) return false;
        if (c != null ? !c.equals(pyramide.c) : pyramide.c != null) return false;
        if (ha != null ? !ha.equals(pyramide.ha) : pyramide.ha != null) return false;
        if (hb != null ? !hb.equals(pyramide.hb) : pyramide.hb != null) return false;
        return h != null ? h.equals(pyramide.h) : pyramide.h == null;

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (a != null ? a.hashCode() : 0);
        result = 31 * result + (b != null ? b.hashCode() : 0);
        result = 31 * result + (c != null ? c.hashCode() : 0);
        result = 31 * result + (ha != null ? ha.hashCode() : 0);
        result = 31 * result + (hb != null ? hb.hashCode() : 0);
        result = 31 * result + (h != null ? h.hashCode() : 0);
        return result;
    }

    @Override
    public double calculateVolume() {
        return 1/3 * a * b * h;
    }

    @Override
    public double calculateSurfaceArea() {
        return a*b + a*ha + b*hb;
    }
}
