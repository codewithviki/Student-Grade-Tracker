import java.util.ArrayList;
import java.util.Scanner;

public class StudentGradeTracker {
    
    private ArrayList<Double> grades;

    // Constructor to initialize the ArrayList
    public StudentGradeTracker() {
        grades = new ArrayList<>();
    }

    // Method to add a grade
    public void addGrade(double grade) {
        grades.add(grade);
    }

    // Method to compute the average grade
    public double getAverage() {
        if (grades.isEmpty()) {
            return 0.0; // Avoid division by zero if there are no grades
        }
        double sum = 0;
        for (double grade : grades) {
            sum += grade;
        }
        return sum / grades.size();
    }

    // Method to find the highest grade
    public double getHighestGrade() {
        if (grades.isEmpty()) {
            return 0.0; // Return 0 if no grades are present
        }
        double highest = grades.get(0);
        for (double grade : grades) {
            if (grade > highest) {
                highest = grade;
            }
        }
        return highest;
    }

    // Method to find the lowest grade
    public double getLowestGrade() {
        if (grades.isEmpty()) {
            return 0.0; // Return 0 if no grades are present
        }
        double lowest = grades.get(0);
        for (double grade : grades) {
            if (grade < lowest) {
                lowest = grade;
            }
        }
        return lowest;
    }

    // Main method to interact with the teacher
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentGradeTracker tracker = new StudentGradeTracker();

        // Ask the teacher for the number of students
        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();
        
        // Input the grades for each student
        for (int i = 1; i <= numStudents; i++) {
            System.out.print("Enter grade for student " + i + ": ");
            double grade = scanner.nextDouble();
            tracker.addGrade(grade);
        }

        // Output the average, highest, and lowest grades
        System.out.println("\nResults:");
        System.out.println("Average grade: " + tracker.getAverage());
        System.out.println("Highest grade: " + tracker.getHighestGrade());
        System.out.println("Lowest grade: " + tracker.getLowestGrade());

        scanner.close();
    }
}
