import java.util.Arrays;

public class Bubble{

    public static void main(String[] args) {
        
        int[] ar = {3, 5, 1, 2, 4};
        System.out.println("--------------------------");
        System.out.println(Arrays.toString(ar));
        System.out.println("--------------------------");

        sort(ar);

        
    }

    public static void sort(int[] a){

        for(int i=0; i<a.length; i++){
            for(int j=1; j<a.length; j++){
                if(a[j] < a[j-1]){

                    var temp = a[j];
                    a[j] = a[j-1];
                    a[j-1] = temp;
                }
            }

            System.out.println(i + ": " +Arrays.toString(a));
        }

    }


}