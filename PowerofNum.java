import java.net.Socket;
import java.util.Scanner;

public class PowerofNum {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter base value");
        int base=sc.nextInt();
        System.out.println("enter exponent value");
        int exponent=sc.nextInt();
        int result=1;
        while(exponent!=0){
            result=result*base;
            --exponent;
        }
        System.out.println("power of a num is"+result);


    }
    
}
