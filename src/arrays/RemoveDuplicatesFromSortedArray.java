package arrays;
    /*
    LeetCode #26 - Remove Duplicates from Sorted Array

    Difficulty: Easy
    Topic: Arrays, Two Pointers

    Time Complexity: O(n)
    Space Complexity: O(1)

    Idea:
    Traverse the sorted array once.
    Keep a pointer k that represents the position of the next unique element.
    Whenever a new unique value is found,
    copy it to nums[k] and increment k.
    The first k elements will contain all unique values.

    Learned:
    - In-place means modifying the original array without using extra memory.
    - A sorted array allows duplicates to be detected by comparing adjacent elements.
    - Two pointers can be used to overwrite duplicate values efficiently.

    Solved: 2026-07-06
    */
    public class RemoveDuplicatesFromSortedArray {

        public int removeDuplicates(int[] nums) {

            if (nums.length == 0) return 0;

            int k = 1;

            for (int i = 1; i < nums.length; i++) {
                if (nums[i] != nums[i - 1]) {
                    nums[k] = nums[i];
                    k++;
                }
            }

            return k;
        }
    }

