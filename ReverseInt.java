import java.util.Scanner;

public class ReverseInt {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a integer");
        int num=sc.nextInt();
        int reverse=0;
        int i=0;
        while(i<num){
            int rem=num%10;
            reverse=reverse*10+rem;
            num=num/10;
        }
        System.out.println(reverse);

    }
    
}
