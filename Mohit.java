public class Mohit{
    public static void main(String args[]){
        int A= 65;

        for(int i=0; i<5; i++){

            for(int j=i; j>=0; j--){
                System.out.print((char)(A+j)+" ");
            }
            
            for(int k= 1; k<=i; k++){
                System.out.print((char)(A+k)+" ");
            }
            System.out.println();
        }
    }
}