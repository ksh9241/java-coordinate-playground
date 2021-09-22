package fuel_injection;

public class Sonata extends Car{
    //private double distance;

    public Sonata (double distance) {
        super.distance = distance;
    }

    @Override
    double getDistancePerLiter() {
        return 10;
    }

    @Override
    double getTripDistance() {
        return super.distance;
    }

    @Override
    String getname() {
        return "Sonata";
    }
}
