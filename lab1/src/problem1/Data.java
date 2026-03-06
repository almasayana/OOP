package problem1;

public class Data {
	private int cnt;
	private double sum;
	private double max;
	
	public Data() {
		cnt = 0;
		sum = 0.0;
		max = 0.0;
	}
	
	public void addValue(double a) {
		sum += a;
		cnt++;
		if(a > max || cnt ==0) max = a;
		
	}
	
	public double getAverage() {
		if(cnt == 0) return 0;
		return sum /cnt;
	}
	
	public double getMaximum() {
        if (cnt == 0) return 0;
        return max;
    }
	

}
