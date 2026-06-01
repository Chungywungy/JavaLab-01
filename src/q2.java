import java.util.Scanner;

public class q2 {
    static void main() {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the video length in minutes: ");
        float seconds = Float.parseFloat(input.nextLine()) * 60;

        System.out.println("Enter the frames per second: ");
        int fps = Integer.parseInt(input.nextLine());

        System.out.println("Enter the size of the frames in MB: ");
        float frameSize = Float.parseFloat(input.nextLine());

        float totalFrames = fps * seconds;

        float totalSize = frameSize * totalFrames;

        float totalSizeGB = totalSize / 1024;

        System.out.printf("Total Frames: %.0f\n", totalFrames);
        System.out.printf("Total Size in MB: %.0f\n", totalSize);
        System.out.printf("Total Size in GB: %.2f\n", totalSizeGB);
    }
}
