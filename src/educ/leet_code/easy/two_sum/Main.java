package educ.leet_code.easy.two_sum;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        int[] nums = new int[]{3, 2, 4};
        int target = 6;
        Arrays.stream(twoSum(nums, target)).forEach(System.out::println);

    }

    public static int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {

            int t = target - nums[i];

            if(map.containsKey(t) && map.get(t) != i){

                return new int[]{i, map.get(t)};
            }
        }

        return new int[]{};



//        int length = nums.length;
//
//        for (int i = 0; i < length; i++) {
//
//            int b = length - 1;
//
//            while (b != i) {
//
//                int yi = i + 1;
//
//                if (nums[i] + nums[yi] == target) {
//
//                    return new int[]{i, yi};
//
//                } else if (nums[i] + nums[b] == target) {
//
//                    return new int[]{i, b};
//
//                } else {
//                    b--;
//                    yi++;
//                }
//
//            }
//        }
//
//        return new int[]{};
    }
}
