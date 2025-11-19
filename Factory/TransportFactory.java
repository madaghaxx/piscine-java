class TransportFactory {
    public Transport getTransport(String type) {
        if (type.equals("Car")) {
            return new Car();
        } else if (type.equals("Plane")) {
            return new Plane();
        }
        return null;
    }
}