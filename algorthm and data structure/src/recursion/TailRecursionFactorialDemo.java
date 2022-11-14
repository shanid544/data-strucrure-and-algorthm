package recursion;

public class TailRecursionFactorialDemo {

    public static int factorial(int n ,int result){
        if(n==0) return result;
        return factorial(n-1,n*result);
    }

    public static void main(String[] args){
        int m=3;
        int f=factorial(m,1);
        System.out.println(f);
    }
}
