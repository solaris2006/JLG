package home.jlg.lesson2;

import java.util.Arrays;

public class Homework {

    public static void main(String[] args) {
//        System.out.println(leapYear(2012));
//
//        System.out.println(average(new Double[] {2.3, 4.5, 5.6, 10.0, 11.0}));
//        System.out.println(sumOfOdds(new int[] {1,2,3,4,5,6,7,8}));
        System.out.println(isPalindrome("level"));
    }

    private static boolean leapYear(int year){

        if (year % 4 == 0){
            return year % 400 == 0 ||  year % 100  != 0;
        }

        return false;
    }

    private static Double average( Double[] numbers){

        return Arrays.stream(numbers).mapToDouble(Double::doubleValue).sum() / numbers.length;
    }

    private static int sumOfOdds(int[] numbers){

        return Arrays.stream(numbers).filter(num -> num % 2 != 0).sum();
    }

    private static boolean isPalindrome(String str){

        char[] chars = str.toCharArray();
        int elems = chars.length - 1;
        for (int i = 0 ; i < chars.length / 2; i++){
            if (chars[i] != chars[elems]){
                return false;
            }
            elems--;
        }





        return true;
    }
}
