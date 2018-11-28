

/* WAJP TO PRINT MAX VALUE OF AN ARRAY*/
public class MaxValue{
    public static void main(String[] args) {
        int a[]={ 1,2,3,4,5,6};
        int n=6,temp;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                 
                 if(a[i]>a[j]){
                     temp=a[j];
                     a[j]=a[i];
                     a[i]=temp;
                 }
                 
            }
            System.out.println(a[i]);
        }
        int max =a.length-1;
        System.out.println("maximum value is " + max );
        System.out.println("minimum value is "+ a[0]);
    }
}