class FindMinimumRotatedSortArrayDuplicate{
    public static void main(String args[]){
        int a[]={3,3,3,4,1,2,3};
        int s=0;
        int e=a.length-1;
        while(s<e){
            int m=s+(e-s)/2;
            if(a[m]>a[e]){
                s=m+1;
            }
            else if(a[m]<a[e]){
                e=m;
            }
            else{
                e--;
            }
        }
        System.out.print(a[s]);
    }
}