import java.util.Arrays;
class BitManipulation5{
    public static void main(String args[]){
        int n=9;
       // int r;
       // int i=0;
       //B_Number=0;

        
        // while(n>0){
        // r=n%2;
        //double c = Math.pow(10, cnt); 
        // B_Number += rem * c; 
        // n=n/2;
        // i++; reverse the number
        // System.out.print(r);
        // }
        for(int i=25;i>=0;i--){
            int k=n>>i;
            if((k & 1)>0)
            System.out.print("1");
            else
            System.out.print("0");
        }
    
    }
}