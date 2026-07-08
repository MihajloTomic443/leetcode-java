package arrays.easy;

import java.util.HashSet;
import java.util.Set;

/*
LeetCode #217 - Contains Duplicate
Difficulty: Easy
Topic: Arrays, HashSet

Time Complexity: O(n)
Space Complexity: O(n)

Idea:
Traverse the array once.
Store each number in a HashSet.
If the current number already exists in the set,
a duplicate has been found.

Learned:
- Use HashSet when only uniqueness matters.
- HashSet provides average O(1) lookup and insertion.
- Return immediately when a duplicate is found.

Solved: 2026-07-06
*/
public class ContainsDuplicate {

    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                return true;
            }
            set.add(nums[i]);
        }

        return false;
    }
}