import java.util.Scanner;

public class Scores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();

        int[] scores = new int[numStudents];
        System.out.print("Enter " + numStudents + " scores: ");
        for (int i = 0; i < numStudents; i++) {
            scores[i] = scanner.nextInt();
        }

        int bestScore = findBestScore(scores);

        for (int i = 0; i < numStudents; i++) {
            System.out.print("Student " + i + " score is " + scores[i] + ", and their grade is ");
            printGrade(scores[i], bestScore);
        }
    }

    public static int findBestScore(int[] scores) {
        int bestScore = scores[0];
        for (int i = 1; i < scores.length; i++) {
            if (scores[i] > bestScore) {
                bestScore = scores[i];
            }
        }
        return bestScore;
    }

    public static void printGrade(int score, int bestScore) {
        if (score >= bestScore - 10) {
            System.out.println("A");
        } else if (score >= bestScore - 20) {
            System.out.println("B");
        } else if (score >= bestScore - 30) {
            System.out.println("C");
        } else if (score >= bestScore - 40) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }
    }
}
