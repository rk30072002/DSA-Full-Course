import java.util.Arrays;
class Counting_Sort{
    public static void main(String args[]){
        int a[]={2,5,3,0,2,3,0,3};
       // Scanner sc=new Scanner(System.in);
        //int max=sc.nextInt();
        int n=a.length;
        int Max=0;
        Arrays.sort(a);
        for(int i=0;i<n;i++){
            System.out.print(a[i]);
            Max = Math.max(Max,a[i]);
        }
        
        
        int countArray[]=new int[Max+1];
        for(int i=0;i<n;i++){
            countArray[a[i]]++;
        }
            for(int i=1;i<=Max;i++){
                countArray[i]=countArray[i]+countArray[i-1];
            
        }
        int sortedArray[]=new int[n];
        for(int i=n-1;i>=0;i--){
            sortedArray[countArray[a[i]]-1]=a[i];
            countArray[a[i]]--;

        }
        for(int i=0;i<n;i++){
            System.out.print(a[i]);
        }
        System.out.println();
    }
}