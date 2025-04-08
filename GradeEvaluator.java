public class GradeEvaluator {
    private GradeEvaluator() {} // Utility class

    public static double calculateAverage(int[] marks) {
        int sum = 0;
        for (int mark : marks) sum += mark;
        return (double) sum / marks.length;
    }

    public static String determineGrade(double average) {
        if (average >= 75) return "A";
        if (average >= 65) return "B+";
        if (average >= 60) return "B";
        if (average >= 50) return "C";
        if (average >= 40) return "D";
        return "E";
    }

    public static String getPerformanceRemark(String grade) {
        switch (grade) {
            case "A":  return "Excellent Performance";
            case "B+": return "Very Good Performance";
            case "B":  return "Good Performance";
            case "C":  return "Satisfactory Performance";
            case "D":  return "Marginal Pass";
            default:   return "Unsatisfactory Performance";
        }
    }
}