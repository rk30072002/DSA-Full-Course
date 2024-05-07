//import java.util.Arrays;
class Dsa130{
    public static void main(String args[]){
        int a[]={1,7,5,3,9,6};
        int b[]={4,5,6,8,9};
//Arrays.sort(a);
//Arrays.sort(b);
        int merge[]=new int[a.length+b.length];
        int j=0;
        int i;

    for(i=0;i<a.length;i++){
        merge[j++]=a[i];
    }
    for(i=0;i<b.length;i++){
        merge[j++]=b[i];
        
    
    }
    for(i=0;i<merge.length;i++){
    System.out.print(merge[i]+" ");

}

        // int b[]={4,5,6,8,9};
        // for(int i=0;i<a.length-1||i<b.length-1;i++){
        //     if(a[i]==b[i]){
        //         System.out.print(b[i]);
        //     }
            //else{
            //    System.out.println(a[i])
          //  }
        
        }
    }
//}