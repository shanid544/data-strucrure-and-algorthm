package algorithms;

import java.util.stream.Stream;

public class BubbleSortDemo {
    public static void main(String[] args){
        int[] a={12,8,7,6,5,3,2};
        System.out.println("before sorting  -");
        for (int n:a
             ) {
            System.out.print(n+" ");
        }

        int l=a.length;
        int temp;

        for(int i=0;i<l-1;i++){
            for(int j=0;j<l-1-i;j++){
                if(a[j]>a[j+1]){
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        System.out.println();
        System.out.println("aftre sorting - ");

        for (int n:a
        ) {
            System.out.print(n+" ");
        }
    }



}
