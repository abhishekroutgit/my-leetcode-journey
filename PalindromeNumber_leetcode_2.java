package org.example.leetcode;

public class PalindromeNumber_leetcode_2 {
    public static void main(String[] args) {
        int number = -121;
        System.out.println(+number +" is pallindromoe? "+isPalindrome(number));

    }

    private static boolean isPalindrome(int x){
        int capture = 0;
        int original = x;

        if(x<0){
            return false;
        }

        else{
            while(x>0){
                capture = (capture * 10) + (x%10);
                x = x/10;
            }

            if(capture == original){
                return true;
            }
            else
                return false;
        }
    }
}
