class Dsa90{
    public static void main(String args[]){
        int n=5;
        char C='A';
        for(int i=0;i<n;i++){
            C+=i;
            for(int j=0;j<=i;j++){
                System.out.print(C);
                C--;
            }
            System.out.println();
            C='A';
        }
    }
}