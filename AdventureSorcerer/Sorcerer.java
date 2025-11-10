
public abstract class Sorcerer extends Character implements Healer {

    int healCapacity;

    public Sorcerer(String name, int max, int ss) {
        super(name, max);
        this.healCapacity = ss;
    }

    @Override
    public int getHealCapacity() {
        return this.healCapacity;
    }

    @Override
    public void heal(Character c) {
        int newHealth = c.getCurrentHealth() + this.getHealCapacity();
        if (newHealth > c.getMaxHealth()) {
            c.setCurrentHealth(c.getMaxHealth());
        } else {
            c.setCurrentHealth(newHealth);
        }
    }

    @Override
    public String toString() {
        if (this.getCurrentHealth() > 0) {
            return this.getName() + " is a sorcerer with " + this.getCurrentHealth() + " HP. It can heal " + this.getHealCapacity() + " HP.";
        } else {
            return this.getName() + " is a dead sorcerer. So bad, it could heal " + this.getHealCapacity() + " HP.";
        }
    }
}
