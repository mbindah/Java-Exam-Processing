import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student[] students = new Student[10];

        System.out.println("STRATHMORE UNIVERSITY EXAMINATION PROCESSING SYSTEM");
        System.out.println("==================================================");

        for (int i = 0; i < 10; i++) {
            System.out.println("\nSTUDENT " + (i + 1) + " DETAILS:");
            String name = InputHelper.getStudentName(scanner);
            String id = InputHelper.getStudentId(scanner); // Now validates numeric IDs
            int[] marks = new int[5];

            for (int j = 0; j < 5; j++) {
                System.out.print(Student.SUBJECTS[j] + " mark (0-100): ");
                marks[j] = InputHelper.getValidMark(scanner);
            }

            students[i] = new Student(name, id, marks);
        }

        String reportDate = new SimpleDateFormat("dd-MMM-yyyy").format(new Date());
        System.out.println("\nGENERATING REPORT CARDS...");
        System.out.println("==================================================");

        for (Student student : students) {
            ReportCard.generate(student, reportDate);
        }

        scanner.close();
    }
}