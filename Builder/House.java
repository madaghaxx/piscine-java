class House implements Housing {
    private String name;
    private int size;
    private int price;
    private int rooms;

    public House() {
        
    }
    public void setSize(int size) {
        this.size = size;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setRooms(int rooms) {
        this.rooms = rooms;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return String.format("House{size=%d, price=%d, rooms=%d, name='%s'}", this.size, this.price, this.rooms,
                this.name);
    }
}