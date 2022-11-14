package algorithms;

public class SelectionSortDemo {

    public static void main(String[] args){

        int[] a={9,8,7,6,5,4,3};
        System.out.println("before sort");
        for (int n:a
             ) {
            System.out.print(n+" ");
        }
        System.out.println();

        for(int i=0;i<a.length-1;i++){
            int minIndex=i;
            for(int j=i+1;j<a.length;j++){
                if(a[minIndex]>a[j]){
                    minIndex=j;
                }
            }
            int temp=a[minIndex];
            a[minIndex]=a[i];
            a[i]=temp;
        }
        System.out.println("after sort");
        for (int m:a
             ) {
            System.out.print(m+" ");
        }

    }
}
