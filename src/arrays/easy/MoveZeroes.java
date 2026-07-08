package arrays.easy;

/*
LeetCode #283 - Move Zeroes

Difficulty: Easy
Topic: Arrays, Two Pointers

Time Complexity: O(n)
Space Complexity: O(1)

Idea:
Traverse the array once.
Keep a pointer k representing the next position for a non-zero element.
Copy every non-zero element to nums[k] and increment k.
After all non-zero elements are placed, fill the remaining positions with zeros.

Learned:
- Two pointers can be used to partition an array in-place.
- Multiple consecutive passes over an array still result in O(n) time complexity.
- Big-O ignores constant factors (2n -> O(n)).

Solved: 2026-07-06
*/
public class MoveZeroes {

    public void moveZeroes(int[] nums) {
        int k = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[k] = nums[i];
                k++;
            }
        }

        for (int i = k; i < nums.length; i++) {
            nums[i] = 0;
        }
    }
}