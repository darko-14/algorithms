import java.util.Arrays;

public class Insertion {
    
    public static void main(String[] args) {
        
        int[] ar = {3, 5, 1, 2, 4};
        System.out.println("--------------------------");
        System.out.println(Arrays.toString(ar));
        System.out.println("--------------------------");

        sort(ar);

        
    }

    public static void sort(int[] a){

        for (int i = 1; i < a.length; i++) {
            
            var j = i-1;
            var key = a[i];
            
            while(j>=0 && a[j] > key){
                a[j+1] = a[j];
                j--;
            }

            a[j+1] = key;
    
        
            System.out.println(i + ": " +Arrays.toString(a));
        }





    }




}
