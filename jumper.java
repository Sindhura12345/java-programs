import java.util.*;

public class jumper {

    public static int findMinimumJumps(int laneLength, int targetDistance) {
        if (targetDistance == 0) {
            return 0;
        }

        if (targetDistance > laneLength) {
            return -1;  // Target distance is beyond the lane length
        }

        int prev1 = 1;
        int prev2 = 1;
        int currentJump = 1;
        int position = 0;
        int jumps = 0;

        while (position < targetDistance) {
            jumps++;
            int nextPosition = position + currentJump;

            if (nextPosition == targetDistance) {
                return jumps;
            }

            if (nextPosition > laneLength) {
                return -1;  // Impossible to reach the target distance within the lane
            }

            position = nextPosition;

            // Update for the next Fibonacci-like number
            int nextJump = prev1 + prev2;
            prev1 = prev2;
            prev2 = nextJump;
            currentJump = prev1;
        }

        // If we reach here, we couldn't land exactly on targetDistance
        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Reading the input
        int laneLength = scanner.nextInt();
        int targetDistance = scanner.nextInt();

        // Find the minimum jumps to reach the target distance
        int result = findMinimumJumps(laneLength, targetDistance);

        if (result != -1) {
            System.out.println(result);
        } else {
            System.out.println("Not possible to reach the exact distance within the given lane length.");
        }

        scanner.close();
    }
}
