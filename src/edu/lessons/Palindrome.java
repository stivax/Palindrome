package edu.lessons;

public class Palindrome {
    public static void main(String[] args) {
        int x = 427724;
        System.out.println(isPalindrome(x));

    }

    public static boolean isPalindrome(int x) {
        String arr = Integer.toString(x);
        String[] mas = arr.split("");
        int[] pars = new int[mas.length];
        for (int i = 0; i < mas.length; i++) {
            pars[i] = Integer.parseInt(mas[i]);
        }
        boolean ans = false;
        for (int j = 0; j < pars.length; j++) {
            if (pars[j] == pars[pars.length - 1 - j]) {
                ans = true;
            } else {
                ans = false;
            }
        }
        return ans;

    }
}
