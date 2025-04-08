import java.text.DecimalFormat;

public class ReportCard {
    private static final DecimalFormat DF = new DecimalFormat("0.00");

    public static void generate(Student student, String date) {
        System.out.println("\nSTRATHMORE UNIVERSITY - ACADEMIC TRANSCRIPT");
        System.out.println("--------------------------------------------");
        System.out.println("Student: " + student.getName());
        System.out.println("ID:      " + student.getId()); // Displays numeric ID
        System.out.println("Date:    " + date);

        System.out.println("\nSUBJECTS AND MARKS");
        System.out.println("--------------------------------------------");
        for (int i = 0; i < student.getMarks().length; i++) {
            System.out.printf("%-25s: %3d%%\n", 
                Student.SUBJECTS[i], student.getMarks()[i]);
        }

        double average = GradeEvaluator.calculateAverage(student.getMarks());
        String grade = GradeEvaluator.determineGrade(average);

        System.out.println("\nSUMMARY");
        System.out.println("--------------------------------------------");
        System.out.println("Average: " + DF.format(average) + "%");
        System.out.println("Grade:   " + grade);
        System.out.println("Remarks: " + GradeEvaluator.getPerformanceRemark(grade));
        System.out.println("\nEND OF REPORT\n");
    }
}