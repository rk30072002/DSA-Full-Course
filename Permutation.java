class Permutation{
    public static void PrintPermutation(int a[],int j,String perm){
        if(j==a.length){
            System.out.println(perm);
            return;
        }
        for(int i=0;i<a.length;i++){
            if(a[i]!=-1){
            int current=a[i];
            int temp=a[i];
            a[i]=-1;
            PrintPermutation(a,j+1,perm+current+" ");
            a[i]=temp;
            }
        }
    }
    public static void main(String args[]){
        int a[]={1,2,3};
        PrintPermutation(a,0,"");

    }
}