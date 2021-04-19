import java.util.Arrays;

public class Selection {

    public static void main(String[] args){

        int[] ar = {3, 5, 1, 2, 4};
        System.out.println("--------------------------");
        System.out.println(Arrays.toString(ar));
        System.out.println("--------------------------");

        sort(ar);

    }

    public static void sort(int[] a){

        for(int i=0; i<a.length-1; i++){
            var min_index = i;

            for(int j=i+1; j<a.length; j++){

                if(a[j] < a[min_index]){
                    min_index = j;
                }
            }
            var temp = a[i];
            a[i] = a[min_index];
            a[min_index] = temp;


            System.out.println(i + ": " +Arrays.toString(a));
        }

    }

}


    eSystem.out.println("Hello, World!");


