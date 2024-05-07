class Dsa100{
    public static void main(String args[]){
        int n=5;
        char C='E';
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i;j++){
                System.out.print(C);
            }
            System.out.println();
            C--;
        }
    }
}