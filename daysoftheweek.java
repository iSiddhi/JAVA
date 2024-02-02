import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number between 1 and 7: ");
        int dayNumber = scanner.nextInt();

        String dayOfWeek;

        if (dayNumber == 1) {
            dayOfWeek = "Sunday";
        } else if (dayNumber == 2) {
            dayOfWeek = "Monday";
        } else if (dayNumber == 3) {
            dayOfWeek = "Tuesday";
        } else if (dayNumber == 4) {
            dayOfWeek = "Wednesday";
        } else if (dayNumber == 5) {
            dayOfWeek = "Thursday";
        } else if (dayNumber == 6) {
            dayOfWeek = "Friday";
        } else if (dayNumber == 7) {
            dayOfWeek = "Saturday";
        } else {
            dayOfWeek = "Invalid day number";
        }

        System.out.println("The day of the week is: " + dayOfWeek);

        scanner.close();
    }
}
