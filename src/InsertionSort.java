package JBPs.src;

public class InsertionSort {
    public static void main(String[] args){
        //Insertion Sort
        int[] a = {5,4,10,1,6,2};
        int n = a.length,j;
        for(int i=1; i<n; i++){
            int t = a[i];
            j = i-1;
            while(j>=0 && a[j]>t){
                a[j+1] = a[j];
                j--;
            }
            a[j+1] = t;
        }
        for(int i = 0; i<n; i++){
            System.out.print(a[i]+",");
        }
    }
}
