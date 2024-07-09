package practice;

import java.util.Arrays;

//Q4. Find 5th largest number present in an array ?
public class Find5LargestNoInArray {

    public static int findKthLargestNo(int[] arr, int k) {
        //yha p sort kia h
        Arrays.sort(arr);

        //yha p k-th largest element print kia h
        return arr[arr.length - k];
    }

    public static void main(String[] args) {
        int[] num = {3, 2, 1, 5, 4, 9, 8, 10, 15,20};
        int position = 5;
        int kthLargestNo = findKthLargestNo(num, position);
        System.out.println("The" + position + "th largest number is: " + kthLargestNo);

    }
}
