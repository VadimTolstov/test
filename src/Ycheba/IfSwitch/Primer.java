package Ycheba.IfSwitch;

public  class Primer {
    public static void findMedian(int a, int b, int c) {
        if ((a >= b && a <= c) || (a >= c) && a <= b) System.out.println(a); // if a is median
       else if ((b >= a && b <= c) || (b >= c && b <= a)) System.out.println(b); // if b is median
        else System.out.println(c); // else c - median
    }
}