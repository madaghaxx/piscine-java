public class Weapon {
    String name;
    int damage;

    public String getName() {
        return this.name;
    }

    public int getDamage() {
        return this.damage;
    }

    public Weapon(String kimi, int dmg) {
        this.name = kimi;
        this.damage = dmg;
    }

    @Override
    public String toString() {
        return this.getName() + " deals " + this.getDamage() + " damages";
    }
}
