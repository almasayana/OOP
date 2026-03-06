package problem4;

import practice2.Student;
import java.util.*;

public class GradeBook {
    private Course course;
    private LinkedHashMap<Student, Integer> grades;
    
    public GradeBook(Course course) {
        this.course = course;
        this.grades = new LinkedHashMap<>();
    }

    public void addStudentGrade(Student student, int grade) {
        grades.put(student, grade);
    }

    public void displayMessage() {
        System.out.println("Welcome to the grade book for " + course.getName() + "!");
    }

    public void displayGradeReport() {
        displayMessage();
        System.out.println("Grade report:");
        determineClassAverage();
        findHighLow();
        outputBarChart();
    }

    public void determineClassAverage() {
        if (grades.isEmpty()) {
            System.out.println("No grades available");
            return;
        }
        double sum = 0;
        for (int g : grades.values()) {
            sum += g;
        }
        double avg = sum / grades.size();
        System.out.println("Class average is " + avg);	
    }

    public void findHighLow() {
        if (grades.isEmpty()) {
            System.out.println("No grades available");
            return;
        }
        
        int highest = -1; 
        int lowest = 101;
        Student highStudent = null;
        Student lowStudent = null;
        for (Student s : grades.keySet()) {
            int g = grades.get(s); 
            
            if (g > highest) { 
                highest = g; 
                highStudent = s; 
            }
            if (g < lowest) { 
                lowest = g; 
                lowStudent = s; 
            }
        }

        System.out.println("Lowest grade is " + lowest + " (" + lowStudent.getName() + ", id: " + lowStudent.getId() + ").");
        System.out.println("Highest grade is " + highest + " (" + highStudent.getName() + ", id: " + highStudent.getId() + ").");
    }

    public void outputBarChart() {
        int[] freq = new int[11];
        for (int g : grades.values()) {
            if (g == 100) freq[10]++;
            else {
                int index = g / 10;
                freq[index]++;
            }
        }

        System.out.println("Grades distribution:");
        for (int i = 0; i < freq.length; i++) {
            if (i == 10) {
                System.out.print("100: ");
            } else {
                System.out.print(i * 10 + "-" + (i * 10 + 9) + ": ");
            }
            
            for (int j = 0; j < freq[i]; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    @Override
    public String toString() {
        return "GradeBook for " + course.getName() + " with " + grades.size() + " students";
    }
}