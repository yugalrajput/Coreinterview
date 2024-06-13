package leetcode;

import java.util.Set;
import java.util.TreeSet;

public class ContainsDuplicate {
    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 1};

        Set<Integer> s = new TreeSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (s.contains(nums[i])) {
                System.out.println("true");
            }
            s.add(nums[i]);
        }
       // System.out.println("false");
    }
}

/*
Question : Given an integer array nums, return true if any value appears at least twice in the array,
            and return false if every element is distinct.



Example 1:

Input: nums = [1,2,3,1]
Output: true
Example 2:

Input: nums = [1,2,3,4]
Output: false
Example 3:

Input: nums = [1,1,1,3,3,4,3,2,4,2]
Output: true
*/
