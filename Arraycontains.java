import java.util.Arrays;
import java.util.Scanner;
class Test{
    public void name(){
    Scanner sc=new Scanner(System.in);
        System.out.println("enter array size");
         int size=sc.nextInt();
         int []arr=new int[size];
        for(int i=0;i<arr.length;i++){
System.out.println("enter array elements");
arr[i]=sc.nextInt();
}

for(int i=0;i<arr.length;i++){
System.out.println(i+" array elements");
System.out.println(arr[i]);
}
}
}
class New{
     New n=new New();
    public boolean method(int arr[],int t){
        for(int n:arr){
            if(t==n){
                return true;
        }
    }
        return false;    
    }
}

public class Arraycontains {
    public static void main(String[]args){
        Test t=new Test();
 New n=new New();
  t.name();
 System.out.println(n.method(arr, 220));
    }
}
