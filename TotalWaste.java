import java.util.Scanner;

public class TotalWaste {

    public static double calculateTotalWaste(double point1Waste, double point2Waste) {
        double total = point1Waste + point2Waste;
        return total;
    }

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

        System.out.print("Waste at point 1: ");
        double point1 = sc.nextDouble();

        System.out.print("Waste at point 2: ");
        double point2 = sc.nextDouble();

        double total = calculateTotalWaste(point1, point2);

        System.out.println("Total Waste Collected: " + total + " kg");

    }
}
