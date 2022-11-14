package recursion;

import jdk.swing.interop.SwingInterOpUtils;

public class TowerOfHonai {

    public void move(int n,char from, char to,char intermediate){
        if(n==1){
            System.out.println("moving disc 1 from "+from+" to "+to);
        }
        else {
            move(n - 1, from, intermediate, to);
            System.out.println("moving disc " + n + " from " + from + " to " + to);
            move(n - 1, intermediate, to, from);
        }
    }

    public static void main(String[] args) {
        TowerOfHonai toh = new TowerOfHonai();
        toh.move(3,'A','B','C');
    }
}
