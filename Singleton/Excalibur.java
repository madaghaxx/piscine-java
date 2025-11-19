class Excalibur {

    String name;
    Excalibur INSTANCE$;

    public Excalibur(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public Excalibur getInstance() {
        return new Excalibur("Sword");
    }
}