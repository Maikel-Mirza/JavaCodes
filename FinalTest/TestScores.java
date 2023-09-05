public class TestScores {
    private double[] scores;

    public TestScores(double[] scores) {
        this.scores = scores;
    }

    public double calculateAverage() {
        if (scores.length == 0) {
            throw new IllegalArgumentException("No scores provided.");
        }

        double sum = 0;
        for (double score : scores) {
            if (score < 0 || score > 100) {
                throw new IllegalArgumentException("Invalid score detected.");
            }
            sum += score;
        }

        return sum / scores.length;
    }

    public static void main(String[] args) {
        // Example usage of the TestScores class
        double[] testScores = { 95.5, 56.0, 58.5, 88.0 };
        TestScores testScoresCalculator = new TestScores(testScores);

        try {
            double average = testScoresCalculator.calculateAverage();
            System.out.println("Average Test Score: " + average);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}