public class DeadCharacterException extends Exception {
    Character hero;

    public DeadCharacterException(Character hero) {
        this.hero = hero;
    }

    public String getMessage() {
        return "The " + this.getClass().getName().toLowerCase() + " " + this.hero.getName() + " is dead.";
    }
}
AdventureException/Templar.java,
 AdventureException/Healer.java,
AdventureException/Tank.java,
 AdventureException/Character.java,
AdventureException/Sorcerer.java,
AdventureException/Monster.java,
AdventureException/Weapon.java,
AdventureException/DeadCharacterException.java