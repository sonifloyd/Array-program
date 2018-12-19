
/*WAJP TO SORT AN ARRAY */
public class SortArray{
    public static void main(String[] args) {
        int a[]={ 4,1,5,3,8,9};
        int n=6;
        int temp;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){

            
            if(a[i]>a[j]){
            temp=a[i];
            a[i]=a[j];
            a[j]=temp;
            }
            }
        }
        for(int i=0;i<n;i++)
        System.out.println(a[i]);
    }
}