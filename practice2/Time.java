package practice2;

public class Time {

    private int hour;
    private int minute;
    private int second;

    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    public Time(int hour, int minute) {
    	this.hour = hour;
    	this.minute = minute;
    }

    public String toUniversal() {
        StringBuilder sb = new StringBuilder();
        if (hour < 10) sb.append("0" + hour + ":");
        else sb.append(hour + ":");
        if (minute < 10) sb.append("0" + minute + ":");
        else sb.append(minute + ":");
        if (second < 10) sb.append("0" + second);
        else sb.append(second);
        return sb.toString();
    }

    public String toStandard() {
        int h = hour;
        boolean pm = false;
        if (h >= 12) {
            pm = true;
            if (h > 12) h -= 12;
        }
        if (h == 0) h = 12;
        StringBuilder sb = new StringBuilder();
        if (h < 10) sb.append("0" + h + ":");
        else sb.append(h + ":");
        if (minute < 10) sb.append("0" + minute + ":");
        else sb.append(minute + ":");
        if (second < 10) sb.append("0" + second);
        else sb.append(second);
        sb.append(pm ? " PM" : " AM");
        return sb.toString();
    }

    public Time add(Time other) {
        int totalSeconds = this.second + other.second;
        int totalMinutes = this.minute + other.minute + totalSeconds / 60;
        int totalHours = this.hour + other.hour + totalMinutes / 60;
        int newSecond = totalSeconds % 60;
        int newMinute = totalMinutes % 60;
        int newHour = totalHours % 24;
        return new Time(newHour, newMinute, newSecond);
    }

    public static void main(String[] args) {
        Time t = new Time(23, 5, 6);
        System.out.println(t.toUniversal());
        System.out.println(t.toStandard());
        Time t2 = new Time(4, 24, 33);
        Time sum = t.add(t2);
        System.out.println(sum.toStandard());
    }
}
