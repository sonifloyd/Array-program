
/*Write a Java program to sum values of an array*/
public class SumArray{
    public static void main(String[] args) {
        int sum=0;
        int a[]={1,2,3,4,5};
        for(int i=0;i<a.length;i++){
            
            
            sum=sum+a[i];
            
        }
    
        System.out.println(sum);
        
    }
}