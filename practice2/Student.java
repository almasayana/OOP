package practice2;

public class Student {
    
	private String name;
    private int id;
    private int studyYear;

    public Student(String name) {
        this.name = name;
        this.id = 0;
        this.studyYear = 1;
    }

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
        this.studyYear = 1;
    }

    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public int getStudyYear() {
        return studyYear;
    }
    public void increaseStudyYear() {
        studyYear++;
    }


    public static void main(String[] args) {
        Student student = new Student("Alim", 1101);
        student.increaseStudyYear();
        System.out.println(student.getName());
        System.out.println(student.getId());
        System.out.println(student.getStudyYear());
    }
    
    @Override
    public String toString() {
    	return "Student name: " + name + ", ID " + id;
    }
}