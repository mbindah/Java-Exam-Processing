public class Student {
    private final String name;
    private final String id; // Stored as String but validated as numeric
    private final int[] marks;

    public static final String[] SUBJECTS = {
        "Object-Oriented Programming",
        "Discrete Mathematics",
        "Database Systems",
        "Artificial Intelligence",
        "Professional Ethics"
    };

    public Student(String name, String id, int[] marks) {
        if (!id.matches("\\d{6}")) { // Ensures 6-digit numeric ID
            throw new IllegalArgumentException("Student ID must be 6 digits (e.g., 145583)");
        }
        this.name = name;
        this.id = id;
        this.marks = marks;
    }

    // Getters
    public String getName() { return name; }
    public String getId() { return id; }
    public int[] getMarks() { return marks; }
}