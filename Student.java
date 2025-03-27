public class Student {
    String name;
    String id;
    int[] scores;
    
    // Subject names as per your request
    static final String[] subjects = {"Object Oriented Programming 1", "Calculus 1", "Database Systems", "Artificial Intelligence", "Ethics"};

    public Student(String name, String id, int[] scores) {
        this.name = name;
        this.id = id;
        this.scores = scores;
    }

    public double getAverage() {
        int total = 0;
        for (int score : scores) {
            total += score;
        }
        return (double) total / scores.length;
    }

    public String getGrade() {
        double avg = getAverage();
        if (avg >= 70) return "A";
        else if (avg >= 60) return "B";
        else if (avg >= 50) return "C";
        else if (avg >= 40) return "D";
        else return "F";
    }
}
