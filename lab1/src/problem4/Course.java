package problem4;

public class Course {
	private String name;
    private String description;
    private int credits;
    private String prerequisites; // List<C

    public Course(String name, String description, int credits, String prerequisites) {
        this.name = name;
        this.description = description;
        this.credits = credits;
        this.prerequisites = prerequisites;
    }

    @Override
    public String toString() {
        return name + " - " + description + " (" + credits + " credits). Prereq: " + prerequisites;
    }

    public String getName() { return name; }
}
