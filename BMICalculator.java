/**
 * Week 1 Practice - Problem 3: BMI Calculator for a Team
 * Suggested method signatures:
 *   String getBmiStatus(double bmi)
 *   void printWellnessReport(double[] heights, double[] weights)
 */
public class BMICalculator {

    public static String getBmiStatus(double bmi) {
        if (bmi < 18.5) return "Underweight";
        else if (bmi <= 24.9) return "Normal";
        else if (bmi <= 29.9) return "Overweight";
        else return "Obese";
    }

    public static void printWellnessReport(double[] heights, double[] weights) {
        if (heights == null || weights == null || heights.length != weights.length) {
            System.out.println("Invalid data.");
            return;
        }
        System.out.printf("%-10s | %-12s | %-12s | %-8s | %-12s%n", "Person", "Height (m)", "Weight (kg)", "BMI", "Status");
        System.out.println("-----------------------------------------------------------------");
        for (int i = 0; i < heights.length; i++) {
            double h = heights[i];
            double w = weights[i];
            double bmi = w / (h * h);
            System.out.printf("%-10s | %-12.2f | %-12.2f | %-8.2f | %-12s%n", "Person " + (i + 1), h, w, bmi, getBmiStatus(bmi));
        }
    }

    public static void main(String[] args) {
        double[] heights = {1.75, 1.60};
        double[] weights = {70.0, 90.0};
        printWellnessReport(heights, weights);
    }
}
