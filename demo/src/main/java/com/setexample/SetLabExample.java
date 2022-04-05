package com.setexample;

import java.util.*;
import java.util.Random;

public class SetLabExample {

  private static int[] arr;

  public static void main(final String[] args) {
    // create list of random numbers
    final Integer n = 15;
    Integer nums[] = createRandom(n);

    // print the numbers
    System.out.println("Random integers is:");
    for (int i = 0; i < nums.length; i++) {
      Integer val = nums[i];
      System.out.printf("[%d] %d\n", i + 1, val);
    }
    //
    // create a set to determine how many duplicates are in the array
    //
    
    {
        int countArr[] = new int[n + 1], i;
 
        // Initialize all the elements of the
        // countArr to 0
        for (i = 0; i <= n; i++)
            countArr[i] = 0;
 
        // Count the occurences of each
        // element of the array
        for (i = 0; i <= n; i++)
            countArr[arr[i]]++;
 
        boolean a = false;
 
        // Find the element with more
        // than one count
        for (i = 1; i <= n; i++) {
 
            if (countArr[i] > 1) {
                a = true;
                System.out.print(i + " ");
            }
        }
        if (!a)
            System.out.println("-1");
    }

    

    // students should write code to
    // create a set of integers

    // students should write code to
    // add integers to the set

    // students should write code to
    // print the set

    // students should write code to
    // print the # of unique elements
  }

  // create list of random numbers
  public static Integer[] createRandom(Integer n) {
    Random rand = new Random();
    final Integer maximum = 10;

    Integer[] nums = new Integer[n];
    for (int i = 0; i < n; i++) {
      Integer val = rand.nextInt(maximum);
      nums[i] = val;
    }
    return nums;
  }
}
