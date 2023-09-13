import java.util.Scanner;

public class StringPalindrome {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a string to check palindrome or not");
        String str=sc.nextLine();

        String reversestr="";
        
        for(int i=str.length()-1;i>=0;--i){
            reversestr=reversestr+str.charAt(i);
        }
        if(str.toLowerCase().equals(reversestr.toLowerCase())){
                System.out.println("it is a palindrome string");
        }
        else{
            System.out.println("not a palindrome string");
        }
    }
    
}
