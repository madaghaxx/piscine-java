
public class CelestialObject {

    public double x, y, z;
    public String name;

    public CelestialObject() {
        this.x = 0.0;
        this.y = 0.0;
        this.z = 0.0;
        this.name = "Soleil";
    }

    public CelestialObject(String name, double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.name = name;
    }

    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }

    public double getZ() {
        return this.z;
    }
    public void setX(double a){
        this.x=a;
    }
    public void setY(double a){
        this.y=a;
    }
    public void setZ(double a){
        this.z=a;
    }
    public String getName(){
        return this.name;
    }
    public void setName(String a){
        this.name=a;
    }
}