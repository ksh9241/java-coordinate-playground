package fuel_injection;

public class K5 extends Car {
    public K5(double distance) {
        super.distance = distance;
    }

    @Override
    double getDistancePerLiter() {
        return 13;
    }

    @Override
    double getTripDistance() {
        return super.distance;
    }

    @Override
    String getname() {
        return "K5";
    }
}
