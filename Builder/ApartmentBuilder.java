class ApartmentBuilder implements HousingBuilder {
    public Apartment apartment;

    public HousingBuilder setSize(int size) {
        this.apartment.setSize(size);
    }

    public HousingBuilder setPrice(int price) {
        this.apartment.setPrice(price);
    }

    public HousingBuilder setRooms(int rooms) {
        this.apartment.setRooms(rooms);
    }

    public HousingBuilder setName(String name) {
        this.apartment.setName(name);
    }

    public Housing build() {
        return this.apartment;
    }
}