package problem2;

public class Main {
    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant();

        Cat cat = new Cat();
        System.out.println("--- Serving pizza to Cat ---");
        boolean result1 = restaurant.servePizza(cat);
        System.out.println("Served successfully: " + result1);
        System.out.println();

        Student student = new Student("Alice");
        System.out.println("--- Serving pizza to Student ---");
        boolean result2 = restaurant.servePizza(student);
        System.out.println("Served successfully: " + result2);
    }
}