class Dsa127{
    public static void main(String args[]){
        int a[]={1,2,3,4,5};
        // int b[]= new int[a.length];

        // for(int i=0 ; i<a.length; i++){
        //     b[i]= a[a.length-i-1];
        // }
        int sp= 0;
        int ep= a.length-1;
        while(sp< ep){
            int temp= a[sp];
            a[sp]= a[ep];
            a[ep]= temp;

            sp++;
            ep--;
        }


        for(int i=0; i<a.length; i++){
            System.out.print(a[i]+" ");
        }


    }
}