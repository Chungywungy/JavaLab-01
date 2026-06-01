import java.util.Scanner;

public class q3 {
    static void main() {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number of seconds: ");
        int totalTime = Integer.parseInt(input.nextLine());

        int hours = totalTime / 3600;
        int hoursRemoved = totalTime % 3600;
        int minutes = hoursRemoved / 60;
        int seconds = hoursRemoved % 60;

        System.out.printf("%d, is equivalent to: %d hours, %d minutes and %d seconds", totalTime, hours, minutes,
                seconds);
    }
}
