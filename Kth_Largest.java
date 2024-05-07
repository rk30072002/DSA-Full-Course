import java.util.Arrays;
class Kth_Largest{
    //     public int findKthLargest(int[] num, int k){

    // }
    // public static void main(String args[]){
    //     int a[]={3,2,3,1,2,4,5,5,6};
    //     int k=4;
    //     for(int i=0;i<num.length;i++){
    //         if(num[i]==a[k+1]){
    //             System.out.println(findKthLargest(a[],4));
    //         }
    //     }
    // }
    public static void main(String args[]){
        int a[]={34,22,32,11,23,14,55,54,61};
        int k=4;
        int n=a.length-1;
        Arrays.sort(a);
        for(int i=0;i<a.length;i++){
            i=n-k;
            System.out.print(a[i]+" ");
            break;
        }
        

        
        
    }
}