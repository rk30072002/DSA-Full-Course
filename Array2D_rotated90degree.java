// import java.util.Scanner;
// class Array2D_rotated90degree{
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         System.out.print("enter any value n: ");
//         int n=sc.nextInt();
//         // System.out.print("enter any value m: ");
//         // int m=sc.nextInt();
//         int a[][]=new int[n][n];
//        // int m[][]=new int[n][n];
//         for(int i=0;i<n;i++){
//             for(int j=0;j<n;j++){
//                 a[i][j]=sc.nextInt();
                
//             }
//         }
//         // for(int i=0;i<n;i++){
//         //     for(int j=0;j<n;j++){
//         //         m[j][n-1-i]=a[i][j];
//         //         System.out.print(m[j][n-1-i]);
//         //     }
            
//         //     System.out.println();
//         // }
//         // for(int i=0;i<n;i++){
//         //     for(int j=0;j<n;j++){
//         //         System.out.print(a[i][j]);
//         //     }
//         //     System.out.println();
//         // }
    
//     }
// }


import java.util.Scanner;
class Array2D_rotated90degree{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter any value n: ");
        int n=sc.nextInt();
        // System.out.print("enter any value m: ");
        // int m=sc.nextInt();
        int a[][]=new int[n][n];
    
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                a[i][j]=sc.nextInt();
                
            }
        }
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
            int temp=a[i][j];
            a[i][j]=a[j][i];
            a[j][i]=temp;

            }
        }
            for(int i=0;i<n;i++){
            int start=0;
            int end=n-1;
            while(start<end){
                int temp=a[i][start];
                a[i][start]=a[i][end];
                a[i][end]=temp;
                start++;
                end--;
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(a[i][j]);
            }
            System.out.println();
        }
    }
}