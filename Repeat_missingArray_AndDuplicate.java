import java.util.Arrays;
class Repeat_missingArray_AndDuplicate{
    public static void main(String args[]){
        int a[]={2,3,1,4,4,5};
        int n=a.length-1;
        int k=n(n+1)/2;
        int sum=0;
        
        Arrays.sort(a);
        int n=a.length-1;
        for(int i=0;i<n;i++){
            
            if(a[i]==a[i+1]){
                System.out.println(a[i]);
            }
            for(int i=0;i<n;i++){
            sum=sum+i;
            int temp=k-sum;
            a[i]=temp+a[i];
            System.out.println(a[i]);

            }
        }

    }

}