abstract class RacletteDecorator implements Raclette {
    Raclette decoratedRaclette;

    public int getCalories() {
        return this.decoratedRaclette.getCalories();
    }

    public String getIngredients() {
        return this.decoratedRaclette.getIngredients();
    }

    public String toString(){
        return String.format("%s pour %d calories", this.getIngredients(), this.getCalories());
    }
}