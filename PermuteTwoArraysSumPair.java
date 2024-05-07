// import java.util.Arrays;
// import java.util.Collections;
 import java.util.*;
class PermuteTwoArraysSumPair{
    // public static void main(String args[]){
    //     int a[]={2,1,3};
    //     int b[]={7,8,9};
    //     int k=10;
    //     int n=a.length;
    //    // int start=0;
    //    // int end=b.length-1;
    //     Arrays.sort(a);
    //     Arrays.sort(b, Collections.reverseOrder());
        

    //     // System.out.print("ascending order a[]:");
    //     // for(int i=0;i<a.length;i++){
    //     //     System.out.print(a[i]);
    //     // }
    //     // System.out.print("descending order b[]:");
    
    //     // for(int i=0;i<b.length;i++){
    //     //     System.out.print(b[i]);
    //     // }
    

    //     for(int i=0;i<n;i++){
    //     if(a[i]+b[i]<k){
    //         System.out.print("false");
    //     }
    //     else{
    //         System.out.print("true");
        
    //     }
    //     }
    // }
    // Java program to check whether 
// permutation of two arrays satisfy 
// the condition a[i] + b[i] >= k. 



// Check whether any permutation 
// exists which satisfy the condition. 
static boolean isPossible(Integer a[], int b[], 
								int n, int k) 
{ 
	// Sort the array a[] in decreasing order. 
	Arrays.sort(a, Collections.reverseOrder()); 

	// Sort the array b[] in increasing order. 
	Arrays.sort(b); 

	// Checking condition on each index. 
	for (int i = 0; i < n; i++) 
	if (a[i] + b[i] < k) 
		return false; 

	return true; 
} 

// Driver code 
public static void main(String[] args) { 
	Integer a[] = {2, 1, 3}; 
	int b[] = {7, 8, 9}; 
	int k = 10; 
	int n = a.length; 

	if (isPossible(a, b, n, k)) 
	System.out.print("Yes"); 
	else
	System.out.print("No"); 
} 
} 
