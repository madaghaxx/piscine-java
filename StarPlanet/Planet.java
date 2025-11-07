
public class Planet extends CelestialObject {

    private Star centerStar;

    public Planet() {
        super();
        centerStar = new Star();
    }

    public Planet(String name, double x, double y, double z, Star center) {
        super(name, x, y, z);
        centerStar = center;
    }

    public Star getCenterStar() {
        return this.centerStar;
    }

    public void setCenterStar(Star center) {
        this.centerStar = center;
    }

    public Boolean equals(Planet object) {
        if (this == object) {
            return true;
        }
        if (object == null || getClass() != object.getClass()) {
            return false;
        }

        return (this.x == object.x && this.y == object.y && this.z == object.z && this.name.equals(object.name) && this.centerStar.equals(object.centerStar));
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(name, x, y, z, centerStar);
    }

    @Override
    public String toString() {
        double dis = CelestialObject.getDistanceBetween(this, this.centerStar);
        return String.format("%s circles around %s at the %.3f AU", getName(), centerStar.getName(), dis);
    }
}
