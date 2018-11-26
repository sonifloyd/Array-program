
/*   WAJP  to find the index of an array element */
public class FindIndex{
    public static void main(String[] args) {
        int a[]={1,2,3,4,5};
        
        System.out.println(isFind(a,6));
        System.out.println(isFind(a,4));
    }
    public static boolean isFind( int arr[],int n){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+"index is"+i);
            return true;
        }
        return false;
    }
}