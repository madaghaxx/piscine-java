
public class Templar extends Character implements Healer, Tank {
    private final int healCapacity;
    private final int shield;

    public Templar(String name, int max, int healCap, int guard, Weapon sla7) {
        super(name, max, sla7);
        this.healCapacity = healCap;
        this.shield = guard;
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
            return String.format(
                    "%s is a strong Templar with %d HP. It can heal %d HP and has a shield of %d. He has the weapon "
                            + this.getWeapon().toString(),
                    this.getName(), this.getCurrentHealth(), this.getHealCapacity(), this.getShield());
        } else {
            return String.format(
                    "%s has been beaten, even with its %d shield. So bad, it could heal %s HP. He has the weapon "
                            + this.getWeapon().toString(),
                    this.getName(), this.getShield(), this.getHealCapacity());
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
            sub.takeDamage(6);
        }
    }

    public void takeDamage(int sub) throws DeadCharacterException {
        int newHealth;
        newHealth = this.getCurrentHealth() - (sub - this.getShield());
        if (newHealth > 0) {
            this.setCurrentHealth(newHealth);
        } else {
            throw new DeadCharacterException(this);
        }
        if (this.getCurrentHealth() <= 0) {
            throw new DeadCharacterException(this);
        }
    }
}
