class MosQuerySquareRootDecomposition{
    public static void main(String args[]){
        int a[]=new int[] {1,1,2,1,3,4,5,2,8};
        int queries[][]={{0,4},{1,3},{2,4}};
        
        for(int query[]:queries){
        int L=query[0];
        int R=query[1];
        int sum=0;
        System.out.println(L+" "+R);
        
        for(int i=L;i<=R;i++){
            sum=sum+a[i];
        }
            System.out.println(+L+" "+R+" "+sum);
        }

    }
}