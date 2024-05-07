class interview{
    public static void main(String args[]){
        int n=3;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==0 && j==1 || i==2 && j==1 || i==1 && j==0 || i==1 && j==2){
                System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}