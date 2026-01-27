public class test {
    public static void main(String[] args) {
        int arr[]={10,77,10,54,-11,10};
        int s=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==10){
                s+=arr[i];
            }
            }
        if (s==30){
                System.out.println("the first 10 th array is "+s);
            }
        else {
                System.out.println("the sum of array is not equal to 30");
        }
    }
}
