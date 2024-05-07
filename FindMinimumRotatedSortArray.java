class FindMinimumRotatedSortArray{
    public static void main(String args[]){
        int a[]={4,5,6,7,8,9,1,2,3};
       // int min=Integer.MAX_VALUE;
        int s=0;
        int e=a.length-1;
        while(s<e){
            int m=s+(e-s)/2;
            if(a[m]>a[e]){
                s=m+1;
        
        
            }
            else{
                e=m;
            }

        }
    System.out.println(a[s]);
    }
}