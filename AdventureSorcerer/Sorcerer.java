
public abstract class Sorcerer extends Character implements Healer {

    int healCapacity;

    public Sorcerer(String name, int max, int healCapacity) {
        super(name, max);
        this.healCapacity = healCapacity;
    }

    @Override
    public int getHealCapacity() {
        return this.healCapacity;
    }

    public void heal() {
        if (this.getCurrentHealth() + this.getHealCapacity() >= this.getMaxHealth()) {
            this.setCurrentHealth(this.getMaxHealth());
        } else {
            this.setCurrentHealth(healCapacity);
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
