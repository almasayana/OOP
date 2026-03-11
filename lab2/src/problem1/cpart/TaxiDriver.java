package problem1.cpart;

import java.util.Objects;

public class TaxiDriver {

    private String name;
    private int driverId;
    
    public String getName() {
    	return name;
    }
    
    public int getDriverId() {
    	return driverId;
    }
    
    public void setName(String name) {
    	this.name = name;
    }

    public void setDriverId(int driverId) {
    	this.driverId = driverId;
    }
    
    public TaxiDriver(String name, int driverId) {
        this.name = name;
        this.driverId = driverId;
    }

    @Override
    public String toString() {
        return "Driver name: " + name + ", driver ID: " + driverId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TaxiDriver)) return false;

        TaxiDriver d = (TaxiDriver) o;

        return driverId == d.driverId && Objects.equals(name, d.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, driverId);
    }
}