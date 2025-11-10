
public class Character {

    int maxHealth;

    public int getMaxHealth() {
        return this.maxHealth;
    }

    int currentHealth;

    public int getCurrentHealth() {
        return this.currentHealth;
    }

    private String name;

    public String getName() {
        return this.name;
    }

    public Character(String nm, int max) {
        this.maxHealth = max;
        this.currentHealth = max;
        this.name = nm;
    }

    @Override
    public String toString() {
        if (this.currentHealth > 0) {
            return this.getName() + " : " + this.currentHealth + "/" + this.maxHealth;
        } else {
            return this.getName() + " : KO";
        }
    }

    public void takeDamage(int sub) {
        if (this.currentHealth - sub > 0) {

            this.currentHealth -= sub;
        } else {
            this.currentHealth = 0;
        }

    }

    public void attack(Character hero) {
        hero.takeDamage(9);
    }
}
