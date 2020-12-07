package ru.mirea.inbo0219;

public class Solution {

    public static int example2(int n){
        if (n == 1) {
            return 1;
        }
        System.out.println(example2(n-1));
        return n;
    }

    public static void example3(int x1, int x2){
        if (x1 == x2){
            System.out.println(x1);
        }

        if (x1 < x2){
            System.out.println(x1);
            example3(++x1,x2);
        }

        if (x1 > x2){
            System.out.println(x1);
            example3(--x1,x2);
        }
    }

    public static int example5(int n) {
        if (n == 0) {
            return n;
        }

        return example5(n / 10) + n % 10;
    }
}
