class Dsa101{
    public static void main(String args[]){
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<i+1;j++){
                System.out.print(j);
            }
            System.out.println();
        }
        for(int i=1;i<n;i++ ){
            for(int k=1;k<=n-i;k++){
                System.out.print(k);
            }
            System.out.println();
        }
    }
}