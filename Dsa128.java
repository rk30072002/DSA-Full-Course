//import java.util.Arrays;
class Dsa128{
    public static void main(String args[]){
        int a[]= {12,4,2,7,9};

        // Arrays.sort(a);
        // for(int i : a){
        //     System.out.println(i);
        // }

        for(int i=0; i< a.length; i++){
            int min= i;
            for(int j=i; j<a.length; j++){
                if(a[min] > a[j]){
                    min= j;
                }
            }
            int temp= a[min];
            a[min]= a[i];
            a[i]= temp;
        }

        for(int i: a){
            System.out.print(i+" ");
        }
    }
}