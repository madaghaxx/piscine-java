
import java.util.List;

public class Character {

    private final int maxHealth;

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

    public Character(String nm, int max) {
        this.maxHealth = max;
        this.currentHealth = max;
        this.name = nm;
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

    private static List<Character> allCharacters;

    public static String printStatus() {
        if (allCharacters.isEmpty()) {
            return """
                   ------------------------------------------
                   Nobody's fighting right now !
                   ------------------------------------------""";
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("------------------------------------------\n");
            sb.append("Characters currently fighting :\n");
            for (Character c : allCharacters) {
                sb.append(" - ").append(c.toString()).append("\n");
            }
            sb.append("------------------------------------------");
            return sb.toString();
        }
    }
}
