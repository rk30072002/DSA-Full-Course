class Dsa147{
    public static void main(String args[]){
    
        // int a = 1; // starting number
        // int d = 6; // difference between consecutive terms
        // int termsN = 10; // number of terms to print, you can change it as needed
        
        // System.out.print("Series: ");
        // for (int i = 0; i < termsN; i++) {
        //     System.out.print(a);
        //     if (i < termsN - 1) {
        //         System.out.print(" + ");
        //     }
        //     a += d; // incrementing by the difference for the next term
        //     d += 5; // updating the difference for the next term
        //     }

        int a=1;
        int n=10;
        int sum=1;

        for(int i=0;i<n;i++){
            if(i%2==0){
                sum=sum+6;
                System.out.print("+"+sum);
            }
            if(i%2!=0){
                sum=sum+5;
                System.out.print("+"+sum);
            }
        }
        }
    }

