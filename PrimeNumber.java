import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[]args){
         Scanner sc=new Scanner(System.in);
        System.out.println("enter a num to check prime or not");
        int num=sc.nextInt();
        boolean flag=false;
        for(int i=2;i<=num/2;i++){
            if(i%2==0){
                flag=true;
                break;
                
            }
        }
            if(!flag){
                System.out.println("its a prime number");
        }
        else{
            System.out.println("not a prime number");
        }
    }
    
}
