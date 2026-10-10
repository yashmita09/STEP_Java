import java.util.Scanner;

/**
 * Week 1 - Assignment Problem 1: The Exam Hall Seat Duplication Checker
 * Suggested method signature: void checkDuplicateSeats(int[] seatNumbers)
 */
public class ExamSeatDuplicationChecker {

    public static void checkDuplicateSeats(int[] seatNumbers) {
        if (seatNumbers == null || seatNumbers.length == 0) {
            System.out.println("No Duplicate Seats Found");
            return;
        }

        boolean foundAnyDuplicate = false;
        int[] reported = new int[seatNumbers.length];
        int reportedCount = 0;

        for (int i = 0; i < seatNumbers.length; i++) {
            boolean isDuplicate = false;
            for (int j = i + 1; j < seatNumbers.length; j++) {
                if (seatNumbers[i] == seatNumbers[j]) {
                    isDuplicate = true;
                    break;
                }
            }

            if (isDuplicate) {
                boolean alreadyReported = false;
                for (int k = 0; k < reportedCount; k++) {
                    if (reported[k] == seatNumbers[i]) {
                        alreadyReported = true;
                        break;
                    }
                }
                if (!alreadyReported) {
                    reported[reportedCount++] = seatNumbers[i];
                    System.out.println("Duplicate Seat Number Found: " + seatNumbers[i]);
                    foundAnyDuplicate = true;
                }
            }
        }

        if (!foundAnyDuplicate) {
            System.out.println("No Duplicate Seats Found");
        }
    }

    public static void main(String[] args) {
        System.out.println("--- Sample 1 ---");
        int[] seats1 = {101, 102, 103, 102, 105};
        checkDuplicateSeats(seats1);

        System.out.println("\n--- Sample 2 ---");
        int[] seats2 = {101, 102, 103, 104, 105};
        checkDuplicateSeats(seats2);
    }
}
