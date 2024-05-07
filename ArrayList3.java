import java.util.ArrayList;
class ArrayList3{
    public static void main(String args[]){
        ArrayList<String>list=new ArrayList<String>();
        list.add("My Name is Rohit Kumar and from Bihar");
        list.add("Where are you from");
        System.out.println(list);

        String element=list.get(1);
        System.out.println(element);

        list.add (1,"your name and");
        System.out.println(list);
        
        

    }
}