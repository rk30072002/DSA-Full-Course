import java.util.Scanner;
class Test2{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[][]=new int[n][n];

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                a[i][j]=sc.nextInt();
            }
        }
        int island=1;
        int count=-1;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(a[i][j]==island){
                    if(i-1>0 && a[i-1][j]==island)
                    count++;
                    if(j+1<n && a[i][j+1]==island)
                    count++;
                    if(i+1<n && a[i+1][j]==island)
                    count++;
                    if(j-1>0 && a[i][j-1]==island)
                    count++;
                    if(i-1>0 && j+1<n && a[i-1][j+1]==island)
                    count++;
                    if(i+1<n && j+1<n && a[i+1][j+1]==island)
                    count++;
                    if(i+1<n && j-1>0 && a[i+1][j-1]==island)
                    count++;
                    if(i-1>0 && j-1>0 && a[i-1][j-1]==island)
                    count++;
                
                }
            }
        }
        System.out.print(count/2);
    }
}