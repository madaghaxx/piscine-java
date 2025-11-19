class HouseBuilder implements HousingBuilder {
    public House house;

    public HousingBuilder setSize(int size) {
        this.house.setSize(size);
    }

    public HousingBuilder setPrice(int price) {
        this.house.setPrice(price);
    }

    public HousingBuilder setRooms(int rooms) {
        this.house.setRooms(rooms);
    }

    public HousingBuilder setName(String name) {
        this.house.setName(name);
    }

    public Housing build() {
        return this.house;
    }
}