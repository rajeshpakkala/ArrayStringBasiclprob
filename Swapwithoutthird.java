public class Swapwithoutthird {
    public static void main(String[]args){
        /*int num1=3;
        int num2=33;
        int temp;
        temp=num1;
        num1=num2;
        num2=temp;
        System.out.println(num1);
        System.out.println(num2);
        */

        //without 3rd variable

        int a=5;
        int b=4;
        a=a^b;
        b=a^b;
        a=a^b;
        //a=a+b;

        //b=a-b;

        //a=a-b;
        System.out.println(a);
        System.out.println(b);

        

    }
    
}
