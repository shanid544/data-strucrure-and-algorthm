package recursion;

public class MergeSortDemo {

    public void merge(int[] left, int[] right, int[] a){
        int length_left = left.length;
        int length_right = right.length;
        int i = 0;
        int j = 0;
        int k = 0;
        while (i<length_left && j<length_right){
            if(left[i]<right[j]){
                a[k]=left[i];
                k++;
                i++;
            }
            else{
                a[k]=right[j];
                k++;
                j++;
            }
        }
        while (i<length_left){
            a[k]=left[i];
            k++;
            i++;
        }
        while (j<length_right){
            a[k]=right[k];
            k++;
            j++;
        }

    }

    public void mergeSort(int[] a){

        int n = a.length;

       if(n<2){
           return;
       }
       int mid = n/2;
       int[] left = new int[mid];
       int[] right = new int[n-mid];
       for(int i=0;i<mid;i++){
           left[i] = a[i];
       }
       for(int i=mid;i<n;i++){
           right[i-mid] = a[i];
       }
       mergeSort(left);
       mergeSort(right);
       merge(left,right,a);


       }


    public static void main(String[] args) {
        MergeSortDemo ms = new MergeSortDemo();
        int[] b = {8,7,6,5,4,3,2,1};
        for (int i = 0; i<8;i++){
            System.out.print(b[i]+" ");
        }
        ms.mergeSort(b);
        System.out.println();
        for (int i = 0; i<8;i++){
            System.out.print(b[i]+" ");
        }
    }
}
