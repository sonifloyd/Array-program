
/* WAJP TO FIND THE COMMON ELEMENTS B/W TWO ARRAY*/
public class FindCommonInteger{
    public static void main(String[] args) {
        int a[]={ 1,2,3,4,5};
        int b[]={ 9,8,3,6,5};
       
        for( int i=0;i<a.length;i++){
            for(int j=0;j<b.length;j++){
                if(a[i]==b[j])
                System.out.println("common element is"+a[i]);
            }
            
            
        }
        
    }
}