
public class Sorcerer extends Character implements Healer {

    private final int healCapacity;

    public Sorcerer(String name, int maxHealth, int healCapacity, Weapon sla7) {
        super(name, maxHealth, sla7);
        this.healCapacity = healCapacity;
    }

    @Override
    public int getHealCapacity() {
        return this.healCapacity;
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

    public void attack(Character hero) {
        this.heal(this);
        hero.takeDamage(10);
    }

    public void takeDamage(int sub) {
        int newHealth;
        if (this.sla7 != null) {
            newHealth = (this.getCurrentHealth() - (sub+ this.sla7.getDamage()));
        } else {
            newHealth = this.getCurrentHealth() - sub;
        }
        if (newHealth > 0) {
            this.setCurrentHealth(newHealth);
        } else {
            this.setCurrentHealth(0);
        }
    }

    @Override
    public String toString() {
        if (this.getCurrentHealth() > 0) {
            return this.getName() + " is a sorcerer with " + this.getCurrentHealth() + " HP. It can heal "
                    + this.getHealCapacity() + " HP. He has the weapon " + this.sla7.toString();
        } else {
            return this.getName() + " is a dead sorcerer. So bad, it could heal " + this.getHealCapacity()
                    + " HP. He has the weapon " + this.sla7.toString();
        }
    }
}
