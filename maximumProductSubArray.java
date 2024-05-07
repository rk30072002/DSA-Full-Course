class maximumProductSubArray{
    public static void main(String args[]){
        int a[]={2,3,-2,4};
        int max=Integer.MIN_VALUE;
        int product=1;
        for(int i=0;i<a.length-1;i++){
        for(int j=i;j<a.length;j++){
            int temp=i;
            product=1;
            while(temp>=i && temp<=j){
                product*=a[temp];
                temp++;
            }
            
        max=max<product ? product:max;
    
    }
        }
        System.out.print(max);
    
    }
}