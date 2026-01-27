interface Addable{
    int add(int num1, int num2);
}

public class lambda{
    public static void main(String[] args) {
        Addable ad1=(a,b)->(a+b);
        Addable ad2=(int a, int b)->{
            return(a+b);
        };
          System.out.println("result using ad1:"+ad1.add(10,20));
          System.out.println("result using ad1:"+ad2.add(30,40));
    }
}