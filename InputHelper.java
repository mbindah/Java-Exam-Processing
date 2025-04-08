import java.util.Scanner;

public class InputHelper {
    public static String getStudentName(Scanner scanner) {
        while (true) {
            System.out.print("Full name: ");
            String name = scanner.nextLine().trim();
            if (!name.isEmpty() && name.matches("[A-Za-z ]+")) {
                return name;
            }
            System.out.println("Invalid name. Use alphabetic characters only.");
        }
    }

    public static String getStudentId(Scanner scanner) {
        while (true) {
            System.out.print("Student ID (6 digits, e.g., 145583): ");
            String id = scanner.nextLine().trim();
            if (id.matches("\\d{6}")) {
                return id;
            }
            System.out.println("Invalid ID. Must be 6 numeric digits.");
        }
    }

    public static int getValidMark(Scanner scanner) {
        while (true) {
            try {
                int mark = Integer.parseInt(scanner.nextLine());
                if (mark >= 0 && mark <= 100) {
                    return mark;
                }
                System.out.println("Mark must be 0-100.");
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Enter a number.");
            }
        }
    }
}