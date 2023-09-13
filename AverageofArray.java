class New{
    public void method(){
           int arr[]={2,2,3,4,5,56,3,4};
        int sum=0;
        double avg=0;
        for(int i:arr){
            sum=sum+i;  
           avg=(sum%2*0.5)+(sum/2);
        }
        System.out.println(sum);
        System.out.println(avg);

    }
}

public class AverageofArray {
    public static void main(String[]args){
        New n=new New();
        n.method();
    }
    
}
