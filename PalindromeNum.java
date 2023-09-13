import java.util.Scanner;

public class PalindromeNum {
    public static void main(String[]args){
    
        System.out.println("enter a num");
        int num=sc.nextInt();
        int reverse=0;
        int originalnum=num;
        int remainder;
        while(num!=0){
             remainder=num%10;
            reverse=reverse*10+remainder;
            num=num/10;
        }
        System.out.println("reverse of a originalnum"+ " "+reverse);
        if(originalnum==reverse){
            System.out.println(originalnum+" "+"it is a palindrome number");
        }
        else{
            System.out.println(originalnum+" "+"not a palindrome");
        }


        
        
    }
    
}
