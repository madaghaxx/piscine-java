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
        sub.takeDamage(9);
    }

    public void takeDamage(int sub) {
        if (Math.floor((this.getCurrentHealth() - sub) * .8) > 0) {
            this.setCurrentHealth((int)Math.floor((this.getCurrentHealth() - sub) * .8));
        } else {
            this.setCurrentHealth(0);
        }
    }
}
