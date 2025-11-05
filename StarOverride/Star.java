
public class Star extends CelestialObject {

    private double magnitude;

    public double getMagnitude() {
        return this.magnitude;
    }

    public void setMagnitude(double test) {
        this.magnitude = test;
    }

    public Star() {
        super();
        this.magnitude = 0;
    }

    public Star(String a, double b, double c, double d, double e) {
        this.name = a;
        this.x = b;
        this.y = c;
        this.z = d;
        this.magnitude = e;
    }

    public String toString() {
        java.text.DecimalFormatSymbols sym = java.text.DecimalFormatSymbols.getInstance(java.util.Locale.US);
        java.text.DecimalFormat df = new java.text.DecimalFormat("0.000", sym);
        return this.name + " shines at the " + df.format(this.magnitude) + " magnitude";
    }

    public Boolean equals(Star object) {
        if (object == this) {
            return true;
        }
        if (getClass() != object.getClass() || object == null) {
            return false;
        }
        return (this.x == object.x && this.y == object.y && this.z == object.z && this.name.equals(object.name) && this.magnitude == object.magnitude);
    }

    public int hashCode() {
        return java.util.Objects.hash(x, y, z, name, magnitude);
    }
}
