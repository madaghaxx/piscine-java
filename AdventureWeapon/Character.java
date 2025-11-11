
import java.util.List;

public abstract class Character {

    private final int maxHealth;
    private Weapon sla7;

    public Weapon getWeapon() {
        return this.sla7;
    }

    public int getMaxHealth() {
        return this.maxHealth;
    }

    private int currentHealth;

    public int getCurrentHealth() {
        return this.currentHealth;
    }

    private final String name;

    public String getName() {
        return this.name;
    }

    protected void setCurrentHealth(int test) {
        this.currentHealth = test;
    }

    public Character(String nm, int max, Weapon sif) {
        this.maxHealth = max;
        this.currentHealth = max;
        this.name = nm;
        this.sla7 = sif;
        allCharacters.add(this);
    }

    @Override
    public String toString() {
        if (this.currentHealth > 0) {
            return this.getName() + " : " + this.currentHealth + "/" + this.maxHealth;
        } else {
            return this.getName() + " : KO";
        }
    }

    public abstract void takeDamage(int sub);
    // if (this.currentHealth - sub > 0) {
    // this.currentHealth -= sub;
    // } else {
    // this.currentHealth = 0;
    // }

    public abstract void attack(Character hero);
    // hero.takeDamage(9);

    private static List<Character> allCharacters = new java.util.ArrayList<>();

    public static String printStatus() {
        if (allCharacters.isEmpty()) {
            return """
                    ------------------------------------------
                    Nobody's fighting right now !
                    ------------------------------------------\n""";
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("------------------------------------------\n");
            sb.append("Characters currently fighting :\n");
            for (Character c : allCharacters) {
                sb.append(" - ").append(c.toString()).append("\n");
            }
            sb.append("------------------------------------------\n");
            return sb.toString();
        }
    }

    public static Character fight(Character hero1, Character hero2) {
        while (hero1.getCurrentHealth() > 0 && hero2.getCurrentHealth() > 0) {
            hero1.attack(hero2);
            if (hero2.getCurrentHealth() == 0) {
                return hero1;
            }
            hero2.attack(hero1);
            if (hero1.getCurrentHealth() == 0) {
                return hero2;
            }
        }
        return hero1.getCurrentHealth() > 0 ? hero1 : hero2;
    }
}
