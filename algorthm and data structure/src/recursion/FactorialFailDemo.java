package recursion;

import java.net.PortUnreachableException;

public class FactorialFailDemo {

    public static int factorial(int n){
        return n*factorial(n-1);
    }

    public static void main(String[] args){
        int m=3;
        int mm=factorial(m);
        System.out.println(mm);
    }
}
