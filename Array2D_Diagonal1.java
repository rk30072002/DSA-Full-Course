import java.util.Scanner;
class Array2D_Diagonal1{
    

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter how many number in n:");
    int n=sc.nextInt();
    System.out.println("enter how many number in m:");
    int m=sc.nextInt();
    int a[][]=new int[n][m];
    for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            a[i][j]=sc.nextInt();
        }
    }

        for(int sum=0;sum<m+n-1;sum++){
            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                if(i+j==sum){
                System.out.print(a[i][j]+" ");
                }
            }
                }
            System.out.println(); 
            }
        }
       // System.out.print();
    }
    // for(int i=0;i<n;i++){
    //     System.out.print(a[i][i]);
    // }
    
    // for(int i=n-1;i>=0;i--){
    //     System.out.print(a[i][n-i-1]);
    // }
    
    
