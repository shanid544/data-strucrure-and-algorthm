package recursion;

public class EuclidsAlgorthmDemo {

    public static void main(String[] args){
        int q=64;
        int w=31;
        int g = gcd(q,w);
        System.out.println(g);
    }

    public static int gcd(int a,int b){
        if(b==0)
            return a;
        return gcd(b,a%b);
    }
}
