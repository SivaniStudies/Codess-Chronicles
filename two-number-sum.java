import java.util.*;

class Program {
  public static int[] twoNumberSum(int[] array, int targetSum) {
    // Get the length of the input array.
    int n = array.length;
    // Create an integer array to store the pair of numbers that add up to the target sum.
    int[] r = new int[2];
    // Loop through all pairs of distinct integers in the input array.
    for (int i = 0; i < n; i++) {
      for (int j = i + 1; j < n; j++) {
        // Check if the current pair of integers adds up to the target sum.
        if (array[i] + array[j] == targetSum) {
          // If it does, store the pair of integers in the result array and return it.
          r[0] = array[i];
          r[1] = array[j];
          return r;
        }
      }
    }
    // If no pair of integers adds up to the target sum, return an empty array.
    return new int[] {};
  }
}
