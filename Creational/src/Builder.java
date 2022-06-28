package Creational.src;

public class Builder {

    public static void main(String[] args) {
        Vehicle car=new Vehicle.VehicleBuilder("150CC", 4).setAirbags(4).build();
        System.out.println(car.getAirBags());
    }
}


class Vehicle {
    //required parameter
    private String engine;
    private int wheel;
    //Optional Parameter
    private int airBags;

    public String getEngine() {
        return engine;
    }

    public int getWheel() {
        return wheel;
    }

    public int getAirBags() {
        return airBags;
    }

    private Vehicle(VehicleBuilder builder) {
        this.engine=builder.engine;
        this.wheel=builder.wheel;
        this.airBags=builder.airBags;
    }

    public static class VehicleBuilder {
        private String engine;
        private int wheel;
        private int airBags;


        public VehicleBuilder(String engine, int wheel) {
            this.engine = engine;
            this.wheel = wheel;
        }

        public VehicleBuilder setAirbags(int airBags) {
            this.airBags = airBags;
            return this;
        }

        public Vehicle build() {
            return new Vehicle(this);
        }
    }
}