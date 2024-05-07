import java.util.Scanner;
class Array2{
    public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
String name[]=new String[n];
for(int i=0;i<n;i++){
    name[i]=sc.next();
}
for(int i=0;i<n;i++){
    System.out.println("name"+ (i+1 )+ "is:"+name[i]);  
}

    }
}