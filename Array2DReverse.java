import java.util.Scanner;
class Array2DReverse{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter howe number input n ");
        int n=sc.nextInt();
        System.out.print("enter howe number input m ");
        int m=sc.nextInt();
        int a[][]=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                a[i][j]=sc.nextInt();
                
            }
        }
for(int i=0;i<n;i++){
    int start=0;
    int end=a[i].length-1;
    while(start<end){

        int temp=a[i][start];
        a[i][start]=a[i][end];
        a[i][end]=temp;
        start++;
        end--;
    }
}
System.out.println("Reversed array:");
for(int i=0;i<n;i++){
    for(int j=0;j<m;j++){
        System.out.print(a[i][j]+" ");
    }
    System.out.println();
}


        
    }
}
