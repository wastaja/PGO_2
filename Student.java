public class Student {

    String fname;
    String lname;
    int indexNumber;
    String email;
    String address;
    static int[] grades;


    public static void AverageGrade() {
        int len = grades.length;


        if (len >= 21) {
            throw new IllegalArgumentException("Student może mieć maksymalnie 20 ocen.");

        } else {
            int sum = 0;
            for (int number : grades) {
                sum += number;
            }
            double avg = (double) sum / grades.length;
            int output = (int) Math.round(avg);
            System.out.println(output);
            }
        }

    public static void AddToGroup() {

    }
}





