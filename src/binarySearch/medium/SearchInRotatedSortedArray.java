package binarySearch.medium;

/*
LeetCode #33 - Search in Rotated Sorted Array

Difficulty: Medium
Topic: Binary Search

Time Complexity: O(log n)
Space Complexity: O(1)

Idea:
At least one half of the array is always sorted.
Determine which half is sorted.
Check whether the target belongs to that sorted half.
Discard the other half and continue the search.

Learned:
- A rotated sorted array always has one sorted half.
- Binary Search can be adapted to non-fully sorted arrays.
- Split the logic into:
  1. Determine the sorted half.
  2. Decide whether the target belongs to it.
- Always eliminate half of the search space.

Solved: 2026-07-06
*/

public class SearchInRotatedSortedArray {

    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return mid;
            }

            if (nums[left] <= nums[mid]) {
                if (target >= nums[left] && target < nums[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } else {
                if (target > nums[mid] && target <= nums[right]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }

        return -1;
    }
}