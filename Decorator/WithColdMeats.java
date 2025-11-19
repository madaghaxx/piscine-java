class WithColdMeats extends RacletteDecorator {

    public WithColdMeats(Raclette raclette) {
        this.decoratedRaclette = raclette;
    }

    public int getCalories() {
        return this.decoratedRaclette.getCalories() + 350;

    }

    public String getIngredients() {
        return this.decoratedRaclette.getIngredients() + ", charcuterie";
    }

    public String toString() {
        return String.format("%s pour %d calories", this.getIngredients(), this.getCalories());
    }
}