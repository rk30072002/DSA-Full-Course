class Dsa82{
    public static void main(String args[]){
        int n=5;
        char C='A';
        for(int i=0;i<n;i++){
            for(int j=0;j<2*i+1;j++){
                System.out.print(C);
            }
            System.out.println();
            C++;
        }
    }
}