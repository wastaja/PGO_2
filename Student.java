public class Student {

    String fname;
    String lname;
    int indexNumber;
    String email;
    String address;
    int[] grades;
    int gradeCount;

    public Student(String fname, String lname, int indexNumber, String email, String address) {
        this.fname = fname;
        this.lname = lname;
        this.indexNumber = indexNumber;
        this.email = email;
        this.address = address;
        this.grades = new int[20];
        this.gradeCount = 0;
    }
    public double calculateAverageGrade() {
        if (grades.length == 0) {
            throw new IllegalArgumentException("Student nie ma żadnych ocen.");
        }

        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        double avg = (double) sum / grades.length;
        return Math.round(avg * 2) / 2.0; // Zaokrąglanie do 0.5
    }
    public void addGrade(int grade) {
        if (gradeCount == 20) {
            throw new IllegalStateException("Student może mieć maksymalnie 20 ocen.");
        }

        grades[gradeCount++] = grade;
    }
}
