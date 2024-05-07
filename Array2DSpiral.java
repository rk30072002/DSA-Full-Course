import java.util.Scanner;
class Array2DSpiral{
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.print("enter how many value n: ");
    int n=sc.nextInt();
    System.out.print("enter how many value m: ");
    int m=sc.nextInt();
    int a[][]=new int[n][m];

    for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            a[i][j]=sc.nextInt();
    
        }
    }
    int left=0;
    int right=m-1;
    int top=0;
    int bottom=n-1;
    while(left<=right && top<=bottom ){
        for(int i=left;i<=right;i++){
            System.out.print(a[top][i]+" ");
        }
        top++;
        for(int i=top;i<=bottom;i++){
            System.out.print(a[i][right]+" ");
        }
        right--;
        if(top<=bottom){
        for(int i=right;i>=left;i--){
            System.out.print(a[bottom][i]+" ");
        }
        bottom--;
        }
        if(left<=right){
        for(int i=bottom;i>=top;i--){
            System.out.print(a[i][left]+" ");
        }
        left++;
        }
    }


    }
}