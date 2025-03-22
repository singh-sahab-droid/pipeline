// StudentGradeCalculator.java
import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int numStudents = scanner.nextInt();
        scanner.nextLine();  // Consume newline

        String[] names = new String[numStudents];
        int[] scores = new int[numStudents];
        String[] grades = new String[numStudents];

        // Input names and scores
        for (int i = 0; i < numStudents; i++) {
            System.out.print("Enter name for student " + (i + 1) + ": ");
            names[i] = scanner.nextLine();

            while (true) {
                System.out.print("Enter score for " + names[i] + " (0-100): ");
                int score = scanner.nextInt();
                scanner.nextLine();  // Consume newline

                if (score >= 0 && score <= 100) {
                    scores[i] = score;
                    break;
                } else {
                    System.out.println("Invalid score! Please enter a value between 0 and 100.");
                }
            }
        }

        // Calculate grades
        for (int i = 0; i < numStudents; i++) {
            if (scores[i] >= 90) grades[i] = "A";
            else if (scores[i] >= 80) grades[i] = "B";
            else if (scores[i] >= 70) grades[i] = "C";
            else if (scores[i] >= 60) grades[i] = "D";
            else grades[i] = "F";
        }

        // Display results
        System.out.println("\nStudent Grades:");
        for (int i = 0; i < numStudents; i++) {
            System.out.printf("%s - Score: %d, Grade: %s%n", names[i], scores[i], grades[i]);
        }

        scanner.close();
    }
}
