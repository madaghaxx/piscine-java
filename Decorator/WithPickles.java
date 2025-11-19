class WithPickles extends RacletteDecorator {

    public WithPickles(Raclette raclette) {
        this.decoratedRaclette = raclette;
    }

    public int getCalories() {
        return this.decoratedRaclette.getCalories() + 50;

    }

    public String getIngredients() {
        return this.decoratedRaclette.getIngredients() + ", cornichons";
    }

    public String toString() {
        return String.format("%s pour %d calories", this.getIngredients(), this.getCalories());
    }
}