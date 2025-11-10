
public class Templar extends Character implements Healer, Tank {
    final int healCapacity;
    final int shield;

    public Templar(String name, int max, int healCap, int guard) {
        super(name, max);
        this.healCapacity = healCap;
        this.shield = guard;
    }

    @Override
    public void heal(Character target) {
        if (this.getCurrentHealth() <= 0 || target.getCurrentHealth() <= 0) {
            return;
        }
        int newHealth = target.getCurrentHealth() + this.getHealCapacity();
        if (newHealth > target.getMaxHealth()) {
            target.setCurrentHealth(target.getMaxHealth());
        } else {
            target.setCurrentHealth(newHealth);
        }
    }

    @Override
    public int getHealCapacity() {
        return this.healCapacity;
    }

    @Override
    public int getShield() {
        return this.shield;
    }

    @Override
    public String toString() {
        if (this.getCurrentHealth() > 0) {
            return String.format("%s  is a strong Templar with %d HP. It can heal %d HP and has a shield of %d.",
                    this.getName(), this.getCurrentHealth(), this.getHealCapacity(), this.getShield());
        } else {
            return String.format("%s has been beaten, even with its %d shield. So bad, it could heal %s HP.",this.getName(),this.getShield(),this.getHealCapacity())
        }
    }
}
