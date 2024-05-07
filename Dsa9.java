import java.util.Scanner;

public class Dsa9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input the coordinates of the four corner points of the window
        System.out.println("Enter the coordinates of the four corner points of the window:");
        System.out.print("x1: ");
        double x1 = scanner.nextDouble();
        System.out.print("y1: ");
        double y1 = scanner.nextDouble();
        System.out.print("x2: ");
        double x2 = scanner.nextDouble();
        System.out.print("y2: ");
        double y2 = scanner.nextDouble();
        System.out.print("x3: ");
        double x3 = scanner.nextDouble();
        System.out.print("y3: ");
        double y3 = scanner.nextDouble();
        System.out.print("x4: ");
        double x4 = scanner.nextDouble();
        System.out.print("y4: ");
        double y4 = scanner.nextDouble();
        
        // Input the coordinates of the point to check
        System.out.println("Enter the coordinates of the point to check:");
        System.out.print("x: ");
        double x = scanner.nextDouble();
        System.out.print("y: ");
        double y = scanner.nextDouble();
        
        // Check if the point lies within the window
        if (isPointWithinWindow(x1, y1, x2, y2, x3, y3, x4, y4, x, y)) {
            System.out.println("The point lies within the window.");
        } else {
            System.out.println("The point does not lie within the window.");
        }
        
        scanner.close();
    }
    
    // Method to check if a point lies within a window defined by four corner points
    public static boolean isPointWithinWindow(double x1, double y1, double x2, double y2,
                                        double x3, double y3, double x4, double y4,
                                        double x, double y) {
        // Calculate the cross product of vectors (AB)x(AM) and (BC)x(BM)
        double crossProduct1 = crossProduct(x1, y1, x2, y2, x, y);
        double crossProduct2 = crossProduct(x2, y2, x3, y3, x, y);
        double crossProduct3 = crossProduct(x3, y3, x4, y4, x, y);
        double crossProduct4 = crossProduct(x4, y4, x1, y1, x, y);
        
        // If all cross products have the same sign, the point lies within the window
        return (crossProduct1 > 0 && crossProduct2 > 0 && crossProduct3 > 0 && crossProduct4 > 0) ||
        (crossProduct1 < 0 && crossProduct2 < 0 && crossProduct3 < 0 && crossProduct4 < 0);
    }
    
    // Method to calculate the cross product of vectors (AB)x(AM)
    private static double crossProduct(double Ax, double Ay, double Bx, double By, double Mx, double My) {
        return (Bx - Ax) * (My - Ay) - (By - Ay) * (Mx - Ax);
    }
}