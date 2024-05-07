class MinimumNumberOfSwapSortedArray{
    public static void main(String args[]){
        int a[]={4,3,2,1};
        int count=0;
        int i=0;
        int j=a.length-1;
    
            while(a[i]>a[j]){
            int temp=a[i];
            a[i]=a[j];
            a[j]=temp;
            count++;
            i++;
            j--;
          //  }
            
          //  }
        }
        for(i=0;i<a.length;i++){
            System.out.println(a[i]+" "+count);
        }
        
    }
}