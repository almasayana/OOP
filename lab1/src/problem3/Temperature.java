package problem3;

public class Temperature {
	private double degrees;
	private char scale;
	
	public Temperature(){
		degrees = 0.0;
		scale = 'C';
	}

	public Temperature(double degrees){
		this.degrees = degrees;
		this.scale = 'C';
	}
	
	public Temperature(char scale){
		this.degrees = 0.0;
		this.scale = scale;
	}
	
	public Temperature(double degrees, char scale){
		this.degrees = degrees;
		this.scale = Character.toUpperCase(scale);
	}
	
	public double getDegreesC() {
		if(scale == 'C') return degrees;
		return (5.0 * degrees - 32.0 ) / 9.0;
	}
	
	public double getDegreesF() {
		if(scale == 'F') return degrees;
		return (9.0 * degrees / 5.0 ) + 32.0;
	}
	
	public void setDegrees(double degrees) {
		this.degrees = degrees;
	}
	
	public void setScale(char scale) {
		this.scale = Character.toUpperCase(scale);
	}
	
	public void setAll(double degrees, char scale) {
		this.setDegrees(degrees);
		this.setScale(scale);
	}
	
	public char getScale() {
		return scale;
	}
	
	@Override
	public String toString() {
		return "Temp is " + this.degrees;
	}
}
