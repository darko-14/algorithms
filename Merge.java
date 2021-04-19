import java.util.Arrays;

public class Merge {
    
    public static void main(String[] args) {
        int[] ar = {3, 8, 5, 1, 2, 4, 2, 5,};
        System.out.println("--------------------------");
        System.out.println(Arrays.toString(ar));
        System.out.println("--------------------------");

        sort(ar, 0, ar.length-1);
        System.out.println(Arrays.toString(ar));
    }

    public static void sort(int[] a, int l, int r){

        if(l < r){

            int m = (l+r)/2;

            sort(a, l, m);
            sort(a, m+1, r);
            merge(a, l, m , r);
            
        }


    }

    public static void merge(int[] a, int l, int m, int r){
        
        int nL = m - l + 1;
        int nR = r - m;

        int L[] = new int[nL];
        int R[] = new int[nR];

        for(int i=0; i<nL; i++)
            L[i] = a[l+i];

        for(int j=0; j<nR; j++)
            R[j] = a[m+1+j];

        
            int i = 0, j = 0;
            int k = l;

            while(i<nL && j<nR){
                if(L[i] <= R[j]){
                    a[k] = L[i];
                    i++;
                }
                else{
                    a[k] = R[j];
                    j++;
                }
                k++;
            }

            while(i < nL){
                a[k] = L[i];
                i++;
                k++;
           }
            while(j < nR){
                a[k] = R[j];
                j++;
                k++;
            }

    }

}
