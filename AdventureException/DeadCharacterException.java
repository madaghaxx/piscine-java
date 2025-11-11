public class DeadCharacterException extends Exception {
    Character hero;

    public DeadCharacterException(Character hero) {
        this.hero = hero;
    }

    public String getMessage() {
        return "The " + this.getClass().getName().toLowerCase() + " " + this.hero.getName() + " is dead.";
    }
}