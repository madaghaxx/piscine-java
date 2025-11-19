class DriverFactory {
    public static Driver getDriver(String driver) {
        if (driver == "Car") {
            return new CarDriver();
        } else {
            return new PlaneDriver();
        }
    }

}