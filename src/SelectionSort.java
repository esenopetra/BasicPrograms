<<<<<<< HEAD
public class SelectionSort{
    public static void main(String[] args){
        int[] a = {7,4,10,8,3,1};
        int n = a.length;
        for(int i=0; i<n-1; i++){
            min = i;
            for(int j = i+1; j<n; j++){
                if(a[min]>a[j]){
                    min = j;
                }
            }
            if(min != i){
                swap(a[min],a[i]);
            }
        }
    }
    int swap(int a, int b){
        int t = a;
            a = b;
            b = a;
    }
}
=======
public class SelectionSort {
    
    public static void main(String[] args){
        int[] a = {7,4,10,8,3,1};
        int n = a.length , min;
        for(int i=0; i<n-1; i++){
            min = i;
            for(int j = i+1; j<n; j++){
                if(a[min]>a[j]){
                    min = j;
                }
            }
            if(min != i){
                int t = a[min];
                a[min] = a[i];
                a[i] = t;
            }
        }
        for(int i = 0; i<n; i++)
        System.out.print(a[i]+",");
    }
    
}
>>>>>>> 4bd75ad3282fd279618cee7dc8188e6417d5e391