package algorithms;

public class InsertionSort {

    public static void main(String[] args ){

        int[] a={9,8,7,6,5,4,3};
        System.out.println("before sort");
        for (int n:a
        ) {
            System.out.print(n+" ");
        }
        System.out.println();
        int j=0;
        for(int i=0;i<a.length;i++){
            int current=a[i];
            for(j=i-1;j>=0;j--){
                if(current<a[j]){
                    a[j+1]=a[j];
                }
            }
            a[j+1]=current;

        }

        System.out.println("after sort");
        for (int m:a
        ) {
            System.out.print(m+" ");
        }

    }
}
