package assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ZeroSumCombination {
    public static List<Integer> findZeroSumCombination(int[] ar) {
        List<Integer> combination = new ArrayList<>();
        int len = ar.length; // size of array

        // Sort the array to optimize the combination search
        Arrays.sort(ar);

        // Find the combination using a recursive helper function
        for (int n = 2; n < len; n++) {
            if (findCombination(ar, n, 0, new int[n], combination)) {
                return combination;
            }
        }
        return combination;
    }

    private static boolean findCombination(int[] nums, int n, int start, int[] temp, List<Integer> combination) {
        if (n == 0) {
            if (sumEqualsZero(temp)) {
                for (int num : temp) {
                    combination.add(num);
                }
                return true;
            }
            return false;
        }

        for (int i = start; i <= nums.length - n; i++) {
            temp[temp.length - n] = nums[i];
            if (findCombination(nums, n - 1, i + 1, temp, combination)) {
                return true;
            }
        }
        return false;
    }

    private static boolean sumEqualsZero(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        return sum == 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array -> ");
        int n = sc.nextInt();
        int[] ar = new int[n];
        System.out.println("Enter " + n + " number of elements: ");
        for (int i = 0; i < n; i++)
            ar[i] = sc.nextInt();

        int[] nums = { -4, 3, -2, 1 };
        List<Integer> zeroSumCombination = findZeroSumCombination(ar);

        if (zeroSumCombination.isEmpty()) {
            System.out.println("No elements found");
        } else {
            System.out.println("Zero sum combination: " + zeroSumCombination);
        }
    }
}
