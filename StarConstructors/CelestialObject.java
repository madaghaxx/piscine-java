
public class CelestialObject {

    public double x, y, z;
    public String name;

    public CelestialObject() {
        x = 0.0;
        y = 0.0;
        z = 0.0;
        name = "Soleil";
    }

    public CelestialObject(double a, double b, double c, String iwa) {
        x = a;
        y = b;
        z = c;
        name = iwa;
    }
}
