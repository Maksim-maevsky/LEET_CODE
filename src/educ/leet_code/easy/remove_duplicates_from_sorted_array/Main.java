package educ.leet_code.easy.remove_duplicates_from_sorted_array;

public class Main {
    public static void main(String[] args) {

        int[] nums = {1, 1, 2, 3, 5, 5,6,7,7,8};

        System.out.println(removeDuplicates(nums));

    }

    public static int removeDuplicates(int[] nums) {

        int forward = 0;
        int back = 0;
        int count = 0;

        while (forward < nums.length-1) {
            forward++;

            if (nums[back] != nums[forward]) {

                nums[back + 1] = nums[forward];

                back++;
                count ++;

            }
        }


        return ++count;
    }
}
