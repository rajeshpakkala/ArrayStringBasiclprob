class New{
    public void method(){
           int arr[]={2,2,3,4,5,56,3};
        int sum=0;
        for(int i:arr){
            sum=sum+i;  
        }
        System.out.println(sum);
    }
}
public class SumOfArrayEle {
    public static void main(String[]args){
     New n=new New();
     n.method();
    
}
}
