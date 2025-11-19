class DriverFactory {
    public Driver getDriver(String driver) {
        if (driver == "Car") {
            return new CarDriver();
        } else {
            return new PlaneDriver();
        }
    }

}