package fuel_injection;

public class Avante extends Car{
    public Avante(double distance) {
        super.distance = distance;
    }

    @Override
    double getDistancePerLiter() {
        return 15;
    }

    @Override
    double getTripDistance() {
        return super.distance;
    }

    @Override
    String getname() {
        return "Avante";
    }
}
