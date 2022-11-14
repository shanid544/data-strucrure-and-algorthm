package quicksort;

public class QuickSortDemo {

    public static int partition(int[] a, int start, int end){

        int pivot = a[end];
        int i = start-1;
        for(int j = start; j < end; j++){
            if(a[j]<=pivot){
                i++;
                int temp = a[j];
                System.out.println(i+" "+j);
                a[j] =a[i];
                a[i] = temp;

            }
        }
        int t = a[end];
        a[end] = a[i+1];
        a[i+1] = t;
        return i+1;
    }
    public static void quickSort(int[] a, int start, int end){

        if(start<end) {

            int pivot = partition(a, start, end);
            quickSort(a, start, pivot-1);
            quickSort(a, pivot + 1, end);
        }


    }


    public static void main(String[] args) {
        int[] a= {12,11,9,8,7,6,5,13,3,10};
        for(int i=0;i<10;i++){
            System.out.print(a[i]+" ");
        }
        int s = 0;
        int l = 9;
        System.out.println();
        quickSort(a,s,l);
        System.out.println();
        for(int i=0;i<10;i++){
            System.out.print(a[i]+" ");
        }
    }

}
