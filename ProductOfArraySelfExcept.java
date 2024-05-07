class ProductOfArraySelfExcept{
    public static void main(String args[]){
        int a[]={1,2,3,4};
        
        int left[]=new int[a.length];
        int right[]=new int[a.length];
        left[0]=1;
        for(int i=1;i<a.length;i++){
            left[i]=left[i-1]*a[i-1];
        }
        right[a.length-1]=1;//O(n)//O(n)

            for(int j=a.length-2;j>-1;j--){
                
        
                right[j]=right[j+1]*a[j+1];
            
            
            
        }

        int ans[]=new int[a.length];
        for(int i=0;i<ans.length;i++){
            ans[i]=left[i]*right[i];
            System.out.print(ans[i]+" ");
        }
    }
}