import java.util.ArrayList;

public class arraylist {
      public static void main(String[] args) {
        ArrayList<String>myList=new ArrayList<>();
        myList.add("Gopi");
        myList.add("sai");
        myList.add("nikhil");
        myList.add("venu");
        myList.add("rahul");

        System.out.println("Names in the list:");
        for(int i=0;i<myList.size();i++){
            System.out.println(myList.get(i));
        }
        System.out.println("\n3rd name:"+myList.get(2));
        System.out.println("\ncontains'Anitha'?"+myList.contains("Anitha"));
        System.out.println("\nSize of List:"+myList.size());
        myList.remove("Rahul");
        System.out.println("size of removal:"+myList.size());

      }
    
}
