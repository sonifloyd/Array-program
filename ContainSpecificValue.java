
/* WAJP to test if an  array contains a specific value */
public class ContainSpecificValue{
    public static void main(String[] args) {
        int a[]={ 2,4,5,6,7};
       
        
        System.out.println(isContain(a,4));
        
        System.out.println(isContain(a,30));
        
    }
    static boolean isContain( int a[],int n ){
        for(int i=0;i<a.length;i++){
            if(a[i]==n){
            return true;
            }
            
            
        }
        return false;

    }
}