package design_patterns;

interface Vehicle{}
class Swift implements Vehicle{}
class Alto implements Vehicle{}
class Benz implements Vehicle{}
class Audi implements Vehicle{}

interface VehicleFactory{}
class LuxuryVehicleFactory implements VehicleFactory{
}
class OrdinaryVehicleFactory implements VehicleFactory{}




public class AbstractFactory {
    public static void main(String[] args) {
        VehicleFactory vf = new LuxuryVehicleFactory();
    }
}
