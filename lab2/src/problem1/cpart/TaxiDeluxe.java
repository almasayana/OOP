package problem1.cpart;
import java.util.Objects;

public class TaxiDeluxe extends TaxiDriver {

    private String mission;

    public TaxiDeluxe(String name, int driverId, String mission) {
        super(name, driverId);
        this.mission = mission;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TaxiDeluxe)) return false;
        if (!super.equals(o)) return false;
        TaxiDeluxe d = (TaxiDeluxe) o;
        return Objects.equals(mission, d.mission);
        
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), mission);
    }
}
