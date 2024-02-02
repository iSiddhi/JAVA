public class MarksofStudent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number between 1 to 100: ");
        int marks = scanner.nextInt();

        String grade;

        if (marks > 95 && marks <= 100) {
            grade = "A+";
        } else if (marks >= 91 && marks <= 95) {
            grade = "A";
        } else if (marks >= 81 && marks <= 90) {
            grade = "B+";
        } else if (marks >= 71 && marks <= 80) {
            grade = "B";
        } else if (marks >= 61 && marks <= 70) {
            grade = "C";
        } else if (marks >= 51 && marks <= 60) {
            grade = "C+";
        } else if (marks >= 35 && marks <= 50) {
            grade = "D";
        } else if (marks < 35) {
            grade = "E";
        } else {
            grade = "Invalid marks";
        }

        System.out.println("Grade: " + grade);

        scanner.close();
    }
}
