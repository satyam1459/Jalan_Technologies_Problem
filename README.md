## Question 1:

**Write a program that takes as input an array of positive and negative numbers (0 excluded). The objective is to
return those items from the array whose sum is 0. If no such items exist return “No Elements found”**

---

## Example: 
**For an input array [-4, 1, 3, -2, -1],
one of the possible results would be 3, -2, -1 since their sum is 0.
Note: If there are more than 1 combination of such items, you can return any 1 of them.**

---

### Approach

This code is an implementation of a Java program that finds a combination of numbers from an input array that sums up to zero. Here's a step-by-step explanation of the code:

1. The `findZeroSumCombination` method takes an integer array `ar` as input and returns a `List<Integer>` representing the combination of numbers that sum up to zero.

2. It initializes an empty `ArrayList` called `combination` to store the resulting combination.

3. The array `ar` is sorted using the `Arrays.sort()` method. Sorting the array helps optimize the combination search process.

4. The code then iterates over the possible sizes of combinations, starting from 2. This is controlled by the variable `n`.

5. Inside the loop, the `findCombination` method is called with the array `ar`, the current combination size `n`, a start index of 0, an empty temporary array `temp`, and the `combination` list.

6. The `findCombination` method is a recursive helper function that searches for combinations of size `n` that sum up to zero. It uses backtracking to explore different combinations.

7. The base case of the recursion is when `n` reaches 0. If the sum of the elements in the `temp` array equals zero, the combination is valid. The elements of the valid combination are added to the `combination` list, and the method returns `true`.

8. If the base case is not met, the method enters a loop that iterates from the `start` index up to `nums.length - n`. This loop helps avoid duplicate combinations by considering only elements after the current index.

9. Within the loop, the current element is added to the `temp` array, and the `findCombination` method is recursively called with `n - 1`, an updated `start` index of `i + 1`, and the modified `temp` array.

10. If the recursive call returns `true`, indicating a valid combination is found, the method returns `true` as well, propagating the result up the recursive call stack.

11. If no valid combination is found after the loop, the method returns `false`.

12. The `sumEqualsZero` method calculates the sum of an array of integers and returns `true` if the sum is zero, `false` otherwise.

13. In the `main` method, the user is prompted to enter the size of the array and its elements using the `Scanner` class.

14. The `findZeroSumCombination` method is called with the input array `ar`, and the resulting combination is stored in the `zeroSumCombination` list.

15. If the `zeroSumCombination` list is empty, it means no combination was found, and a corresponding message is printed.

16. If a combination is found, the combination is printed to the console.

That's an overview of the provided code. It aims to find a combination of numbers from an input array that sums up to zero using a recursive approach and backtracking.
