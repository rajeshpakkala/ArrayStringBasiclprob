class Arrays{
public int method(int arr[],int t){
    if(arr==null){
        return -1;
    }
    int i=0;
int n=arr.length;
    while(i<n){
        if(arr[i]==t){
            return i;
        }
        else
        {
            i=i+1;
        }
        
    }
    return -1;
}
}
    public class ArrayIndex{
    public static void main(String[]args){
int arr[]={23,3,45,3,5,333,3};
Arrays a=new Arrays();
System.out.println(a.method(arr, 333));

    }
}