

/*WAJP TO FIND DUPLICATE ELEMENT IN AN ARRAY*/
public class DuplicateElement{
    public static void main(String[] args) {
        int a[]={ 1,2,3,4,5,3,2,5};
        int n=8;
         int duplicate =0;
        for( int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(a[i]==a[j]){
                    duplicate=a[i];
                    System.out.println("Dublicate element is" +duplicate);
                }
            
            }
            
        }
        
    }
}