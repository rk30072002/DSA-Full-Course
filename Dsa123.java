class Dsa123{
    public static void main(String args[]){
        int a[]={1,2,3,4,2,3};
        int n=a.length;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
            if(a[i]==a[j]){
                // Shift elements to the left to overwrite duplicate
                for(int k=j;k<n-1;k++){
                    a[j]=a[k+1];
                }
                n--;
 // Since we've overwritten an element, recheck the current index
                j--;
                
            }
            }
        }
        System.out.println("Array after removing duplicates:");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
}