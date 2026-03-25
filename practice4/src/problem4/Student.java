package problem4;

public class Student implements Comparable<Student> {
	public String name;
    public double gpa;

    Student(String name, double gpa) {
        this.name = name;
        this.gpa = gpa;
    }
	public int compareTo(Student s) {
		return this.name.compareTo(s.name);
	}

    public String toString() {
        return name + " " + gpa;
    }
}
