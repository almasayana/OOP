package problem3;

public class Iphone implements SellableAndPluggable {
    @Override
    public void sell() { System.out.println("iPhone: being sold at the Apple Store"); }

    @Override
    public void plug() { System.out.println("iPhone: plugging in via USB-C"); }
}