import java.util.*;
public class random {
   public static void main(String[] args) {
     Scanner Sc=new Scanner(System.in);
     ArrayList<Integer> a=new ArrayList<>();
     while (Sc.hasNext()){
        if(Sc.nextInt()==-1){
            break;
        }
        else{
            a.add(Sc.nextInt());
        }
     }
     Random r=new Random();
     int ra=r.nextInt(a.size());
     System.out.println(a.get(ra));
   } 
}
