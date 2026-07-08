package binarySearch.easy;

/*
LeetCode #69 - Sqrt(x)

Difficulty: Easy
Topic: Binary Search

Time Complexity: O(log x)
Space Complexity: O(1)

Idea:
Search for the largest integer whose square is less than or equal to x.
Use Binary Search on the answer range [0, x].
Compare mid² with x to determine which half to discard.

Learned:
- Binary Search can be applied to answer ranges, not only arrays.
- Use long when squaring integers to avoid overflow.
- When the exact square root does not exist, the right pointer
  ends at the integer square root.

Solved: 2026-07-06
*/
public class SqrtX {

    public int mySqrt(int x) {
        int left = 0;
        int right = x;

        while (left <= right) {
            int mid = (left + right) / 2;
            long square = (long) mid * mid;

            if (square == x) {
                return mid;
            } else if (square > x) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return right;
    }
}