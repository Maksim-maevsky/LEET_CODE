package educ.leet_code.easy.plus_one;


import java.util.*;

public class Main {

    public static void main(String[] args) {

        int[] arr = plusOne(new int[]{9, 9, 9, 8});

        for (Integer i : arr) {
            System.out.println(i);
        }

    }

    public static int[] plusOne(int[] digits) {

        int i = digits.length - 1;

        while (i >= 0) {

            if (digits[i] != 9) {

                digits[i]++;
                return digits;

            } else {

                digits[i] = 0;

                if(i == 0){

                int [] newDigits = new int[digits.length + 1];
                newDigits[0] = 1;

                for(int j = 1; j < newDigits.length; j++){

                   newDigits[j] = digits[j - 1];

                }

                return newDigits;

                }
                --i;
            }
        }

        return digits;
    }

}
