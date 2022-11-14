package recursion;

public class FactorialDemo {

    public static int factorial(int n){
        if(n==0) return 1;
        return n*factorial(n-1);
    }

    public static void main(String[] args){
        int m=5;
        int mm=factorial(m);
        System.out.println(mm);
    }
}

