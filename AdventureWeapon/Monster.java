public class Monster extends Character {

    public Monster(String name, int max, Weapon sla7) {
        super(name, max, sla7);
    }

    @Override
    public String toString() {
        if (this.getCurrentHealth() > 0) {
            return this.getName() + " is a monster with " + this.getCurrentHealth() + " HP. He has the weapon "
                    + this.sla7.toString();
        } else {
            return this.getName() + " is a monster and is dead. He has the weapon " + this.sla7.toString();
        }
    }

    public void attack(Character sub) {
        sub.takeDamage(7);
    }

    public void takeDamage(int sub) {
        int damage;
        if (this.sla7 != null) {
            damage = (int) Math.floor(sub * 0.8) + this.sla7.getDamage();
        } else {
            damage = (int) Math.floor(sub * 0.8);
        }
        int newHealth = this.getCurrentHealth() - damage;
        if (newHealth > 0) {
            super.setCurrentHealth(newHealth);
        } else {
            super.setCurrentHealth(0);
        }
    }
}
