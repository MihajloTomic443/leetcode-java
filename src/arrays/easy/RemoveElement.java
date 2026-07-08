package arrays.easy;

/*
LeetCode #27 - Remove Element

Difficulty: Easy
Topic: Arrays, Two Pointers

Time Complexity: O(n)
Space Complexity: O(1)

Idea:
Traverse the array once.
Keep a pointer k representing the next valid position.
If the current element is not equal to val,
copy it to nums[k] and increment k.
The first k elements will contain all remaining values.

Learned:
- In-place modification avoids using extra memory.
- Two pointers can efficiently overwrite unwanted elements.
- The elements beyond index k - 1 do not matter for this problem.

Solved: 2026-07-06
*/
public class RemoveElement {

    public int removeElement(int[] nums, int val) {
        int k = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }

        return k;
    }
}