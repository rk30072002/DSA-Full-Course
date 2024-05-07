import java.util.Scanner;

public class Dsa5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input the coordinates of the first point
        System.out.println("Enter the coordinates of the first point (x1, y1):");
        System.out.print("x1: ");
        double x1 = scanner.nextDouble();
        System.out.print("y1: ");
        double y1 = scanner.nextDouble();
        
        // Input the coordinates of the second point
        System.out.println("Enter the coordinates of the second point (x2, y2):");
        System.out.print("x2: ");
        double x2 = scanner.nextDouble();
        System.out.print("y2: ");
        double y2 = scanner.nextDouble();
        
        // Check if the points are on the same line
        if (arePointsOnSameLine(x1, y1, x2, y2)) {
            System.out.println("The points are on the same line.");
        } else {
            System.out.println("The points are not on the same line.");
        }
        
        scanner.close();
    }
    
    // Method to check if two points are on the same line
    public static boolean arePointsOnSameLine(double x1, double y1, double x2, double y2) {
        // Check if the slope of the line joining the two points is the same
        return (y2 - y1) / (x2 - x1) == (y2 - y1) / (x2 - x1);
    }
}