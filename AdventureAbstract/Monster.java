public class Monster extends Character {

    public Monster(String name, int max) {
        super(name, max);
    }

    @Override
    public String toString() {
        if (this.getCurrentHealth() > 0) {
            return this.getName() + " is a monster with " + this.getCurrentHealth() + " HP";
        } else {
            return this.getName() + " is a monster and is dead";
        }
    }

    public void attack(Character sub) {
        sub.takeDamage(7);
    }

    public void takeDamage(int sub) {
        int damage = (int)Math.floor((sub) * 0.8);
        int newHealth = this.getCurrentHealth() - damage;
        if (newHealth > 0) {
            super.setCurrentHealth(newHealth);
        } else {
            super.setCurrentHealth(0);
        }
    }
}
