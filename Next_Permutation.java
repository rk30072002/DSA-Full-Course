import java.util.Arrays;

public class Next_Permutation {
    
    public static void main(String args[]){
        int a[]={2,1,3};
        Arrays.sort(a);
        generatePermutations(a, 0);
    }
    
    public static void generatePermutations(int[] a, int index) {
        if (index == a.length - 1) {
            // Print the permutation
            for (int i = 0; i < a.length; i++) {
                System.out.print(a[i] + " ");
            }
            System.out.println();
        } else {
            for (int i = index; i < a.length; i++) {
                // Swap current element with the element at index
                swap(a, index, i);
                // Generate permutations for the subarray starting at index + 1
                generatePermutations(a, index + 1);
                // Backtrack: undo the swap to restore the original array
                swap(a, index, i);
            }
        }
    }
    
    public static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
