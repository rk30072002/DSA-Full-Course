class Dsa66{
    public static void main(String args[]){
        int n=5;
        char C='E';
        for(int i=0;i<n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(C);
                C--;
            }
            System.out.println();
            C='E';
        }
    }
}