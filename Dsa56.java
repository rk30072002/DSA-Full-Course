class Dsa56{
    public static void main(String args[]){
        int n=5;
        char C='E';
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(C);
                C--;
            }
            System.out.println();
            C='E';
        }
    }
}