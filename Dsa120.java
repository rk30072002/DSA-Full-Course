import java.util.Scanner;
class Dsa120{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int i=sc.nextInt();
//int n=5;
//for(int i=0;i<n;i++){
   // for(int j=0;j<i+1;j++){
     //   System.out.print("*");
    //}
    if(i==0){
        System.out.print("*"+"5");
    }
    else if(i==1){
        System.out.print(" ** "+"7");
    }
    else if(i==2){
        System.out.print("  "+"2");
    }
    else if(i==3){
        System.out.print("  "+"8");
    }
    else if(i==4){
        System.out.print("  "+"10");
    }
    else{
        System.out.print("nothing");
    }
    System.out.println();
}
  //  }
}