
public class Sorcerer extends Character implements Healer {

    // Healing capacity should not change after creation
    private final int healCapacity;

    public Sorcerer(String name, int maxHealth, int healCapacity) {
        super(name, maxHealth);
        this.healCapacity = healCapacity;
    }

    @Override
    public int getHealCapacity() {
        return this.healCapacity;
    }

    @Override
    public void heal(Character target) {
        // If either the sorcerer or the target is dead, healing has no effect
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
    public String toString() {
        if (this.getCurrentHealth() > 0) {
            return this.getName() + " is a sorcerer with " + this.getCurrentHealth() + " HP. It can heal " + this.getHealCapacity() + " HP.";
        } else {
            return this.getName() + " is a dead sorcerer. So bad, it could heal " + this.getHealCapacity() + " HP.";
        }
    }
}
