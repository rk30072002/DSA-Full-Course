import java.util.Arrays;
class ArrangeNumberFromBiggestNumber{
    public static void main(String args[]){
        int a[]={54,546,548,60};
        
        String s[]=new String[a.length];
        
    for(int i=0;i<a.length;i++){
        s[i]=String.valueOf(a[i]);
        }
        Arrays.sort(s,(x,y) -> (y+x).compareTo(x+y));
       // String k=" ";
        for(int i=0;i<s.length;i++){
           // a[i].append(k);
    System.out.print(s[i]);
        }
        
    }
}