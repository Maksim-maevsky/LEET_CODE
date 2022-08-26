package educ.leet_code.other.sum_closest;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] ar = {1,1,-1,-1,3};
        int res = threeSumClosest(ar, -1);
        System.out.println(res);

    }

    public static int threeSumClosest(int[] nums, int target) {

        int min = Integer.MAX_VALUE;
         int result = 0;

        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {

            int j = i + 1;
            int k = nums.length - 1;

            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                int diff = Math.abs(sum - target);

                if(diff == 0 || sum == target) return sum;


                if (diff < min) {
                    min = diff;
                    result = sum;
                }
                if (sum < target) {

                    j++;
                } else {

                    k--;
                }
            }
        }

        return result;

    }
}


