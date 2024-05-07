class Dsa121{
    public static void main (String args[]){
        int[] array = {1, 2, 3, 4, 5, 2, 7, 8, 8, 9, 10};

        System.out.println("Duplicate elements in the array are:");
        // Loop through each element in the array
        for (int i = 0; i < array.length; i++) {
            // Check if the element is not already marked as visited
            if (array[Math.abs(array[i])] >= 0) {
                // If not visited, mark it as visited by negating its value
                array[Math.abs(array[i])] = -array[Math.abs(array[i])];
            } else {
                // If visited, it means it's a duplicate
                System.out.print(Math.abs(array[i]) + " ");
            }
       // Scanner sc=new Scanner(System.in);
//         int a[]={1,2,3,4,5,3,2};
//         int sum=0;
//         for(int i=0;i<a.length;i++){
// for(int j=1;j<a.length;j++){
//             if(a[i]==a[j]){
//                 System.out.println(a[i]);
//                 //sum++;
//            // a[i]=a[j];
//             }
            

//             }
//         System.out.println();
         }
//            // System.out.println(a[j]);
   }
}