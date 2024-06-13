package leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
        public int[] twoSum(int[] nums, int target) {
            Map<Integer,Integer> map = new HashMap<>();

            for (int i=0; i< nums.length;i++){
                int value = target-nums[i];

                if (map.containsKey(value)){
                    return new int[]{map.get(value),i};
                }
                map.put(nums[i],i);
            }

            return new int[]{};

    }

    public static void main(String[] args) {
        TwoSum twoSum = new TwoSum();
        System.out.println(Arrays.toString(twoSum.twoSum(new int[]{2, 7, 11, 15}, 9)));
    }

}
