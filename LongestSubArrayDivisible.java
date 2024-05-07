class LongestSubArrayDivisible{
    public static void main(String args[]){
        int a[]={2,7,6,1,4,5};
        int k=3;
        
        int maxSum=Integer.MIN_VALUE;
        
        for(int i=0;i<a.length;i++){
            int sum=0;
            for(int j=i;j<a.length;j++){
        sum=sum+a[j];
        
        if(sum%k==0){
            maxSum=Math.max(maxSum,j-i+1);
            System.out.print(" "+maxSum+" ");
            
        }
            }
        System.out.println();
        }
    }
}