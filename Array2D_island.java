import java.util.Scanner;
class Array2D_island{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[][]=new int[n][n];

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                a[i][j]=sc.nextInt();
            }
        }
        int water=0;
        int island=1;
        int count=0;
        int row=0;
        int col=0;

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(a[row][i]==island ){
                    
                
                }
                row++;
                if(a[])
                
            }
        }
    }
}