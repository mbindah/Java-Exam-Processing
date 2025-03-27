import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student[] students = new Student[10];

        System.out.println("Enter details for 10 students:");

        for (int i = 0; i < 10; i++) {
            System.out.println("\nEnter details for Student " + (i + 1) + ":");
            
            String name = getValidName(scanner);
            String id = getValidId(scanner);
            
            int[] scores = new int[5];
            for (int j = 0; j < 5; j++) {
                System.out.print("Enter score for " + Student.subjects[j] + " (0-100): ");
                scores[j] = getValidScore(scanner);
            }

            students[i] = new Student(name, id, scores);
        }

        // Display Report Cards
        System.out.println("\n=== REPORT CARDS ===");
        String date = new SimpleDateFormat("yyyy-MM-dd").format(new Date());

        for (Student student : students) {
            System.out.println("\n-----------------------------");
            System.out.println("Student Name: " + student.name);
            System.out.println("Student ID: " + student.id);
            System.out.println("Subjects and Scores:");
            for (int j = 0; j < 5; j++) {
                System.out.println(Student.subjects[j] + ": " + student.scores[j]);
            }
            System.out.println("Average Score: " + student.getAverage());
            System.out.println("Grade: " + student.getGrade());
            System.out.println("Recommendation: " + getRecommendation(student.getGrade()));
            System.out.println("Date: " + date);
        }

        scanner.close();
    }

    // Method to ensure name contains only letters
    public static String getValidName(Scanner scanner) {
        String name;
        while (true) {
            System.out.print("Enter student name (letters only): ");
            name = scanner.nextLine();
            if (name.matches("[A-Za-z ]+")) {
                break;
            }
            System.out.println("Invalid name. Only letters are allowed.");
        }
        return name;
    }

    // Method to ensure ID contains only numbers
    public static String getValidId(Scanner scanner) {
        String id;
        while (true) {
            System.out.print("Enter student ID (numbers only): ");
            id = scanner.nextLine();
            if (id.matches("[0-9]+")) {
                break;
            }
            System.out.println("Invalid ID. Only numbers are allowed.");
        }
        return id;
    }

    // Method to ensure score is between 0 and 100
    public static int getValidScore(Scanner scanner) {
        int score;
        while (true) {
            if (scanner.hasNextInt()) {
                score = scanner.nextInt();
                if (score >= 0 && score <= 100) {
                    scanner.nextLine(); // Consume newline
                    break;
                }
            } else {
                scanner.next(); // Clear invalid input
            }
            System.out.println("Invalid score. Enter a number between 0 and 100.");
        }
        return score;
    }

    // Method to return recommendation based on grade
    public static String getRecommendation(String grade) {
        switch (grade) {
            case "A": return "Excellent!";
            case "B": return "Good!";
            case "C": return "Fair!";
            case "D": return "Needs Improvement!";
            default: return "Poor Performance!";
        }
    }
}


