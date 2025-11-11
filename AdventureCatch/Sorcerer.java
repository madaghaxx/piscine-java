
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
    public void heal(Character target) throws DeadCharacterException {
        if (this.getCurrentHealth() <= 0) {
            throw new DeadCharacterException(this);
        }
        if (target.getCurrentHealth() <= 0) {
            throw new DeadCharacterException(target);

        }
        int newHealth = target.getCurrentHealth() + this.getHealCapacity();
        if (newHealth > target.getMaxHealth()) {
            target.setCurrentHealth(target.getMaxHealth());
        } else {
            target.setCurrentHealth(newHealth);
        }
    }

    public void attack(Character sub) throws DeadCharacterException {
        if (this.getCurrentHealth() <= 0) {
            throw new DeadCharacterException(this);
        }
        if (sub.getCurrentHealth() <= 0) {
            throw new DeadCharacterException(sub);

        }
        this.heal(this);
        if (this.getWeapon() != null) {
            sub.takeDamage(this.getWeapon().getDamage());
        } else {
            sub.takeDamage(10);
        }
    }

    public void takeDamage(int sub) throws DeadCharacterException {
        int newHealth;
        if (this.getCurrentHealth() <= 0) {
            throw new DeadCharacterException(this);
        }
        newHealth = this.getCurrentHealth() - sub;

        if (newHealth > 0) {
            this.setCurrentHealth(newHealth);
        } else {
            throw new DeadCharacterException(this);
        }
    }

    @Override
    public String toString() {
        if (this.getCurrentHealth() > 0) {
            return this.getName() + " is a sorcerer with " + this.getCurrentHealth() + " HP. It can heal "
                    + this.getHealCapacity() + " HP. He has the weapon " + this.getWeapon().toString();
        } else {
            return this.getName() + " is a dead sorcerer. So bad, it could heal " + this.getHealCapacity()
                    + " HP. He has the weapon " + this.getWeapon().toString();
        }
    }
}
