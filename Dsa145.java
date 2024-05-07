// class Dsa145{
//     public static void main(String args[]){
//         int a=1/2;
//         int d=1/11;
//         int sum=0;
//         for(int i=0;i<5;i++){
//             if(i%2==0){
//                 sum=sum+a;
//                 System.out.print(sum+"+");
//             }else{
//                 sum=sum*d;
//                 System.out.print(sum);
//             }
//         }
//     }
// }
import java.util.Scanner;

public class Dsa145 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();
        
        double sum = sumOfSeries(n);
        
        System.out.println("Sum of the series up to " + n + " terms: " + sum);
        
        scanner.close();
    }
    
    // Method to calculate the sum of the series up to nth term
    public static double sumOfSeries(int n) {
        double sum = 0.0;
        
        for (int i = 1; i <= n; i++) {
            sum += 1.0 / Math.pow(2, i);
        }
        
        return sum;
    }
}
