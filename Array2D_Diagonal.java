import java.util.Scanner;
class Array2D_Diagonal{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("enter the how many element n:");
int n=sc.nextInt();
System.out.println("enter the how may element m:");
int m=sc.nextInt();
int a[][]=new int[n][m];
for(int i=0;i<n;i++){
    for(int j=0;j<m;j++){
        a[i][j]=sc.nextInt();
    }
}

// for(int i=0;i<n;i++){
//     for(int j=0;j<m;j++){
//         System.out.print(a[i][j]+" ");
//         }
//         System.out.println();
//     }
System.out.print("Right Diagonal : ");
    for(int i=0; i<n; i++){
        System.out.print(a[i][i]+" ");
    }

System.out.print("Left Diagonal : ");
    for(int i=0; i<n; i++){
        System.out.print(a[i][n-i-1]+" ");
    }
    }
}