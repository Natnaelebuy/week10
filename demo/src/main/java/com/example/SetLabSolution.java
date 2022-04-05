package com.example;

import java.util.*;
import java.util.Random;

public class SetLabSolution {

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

    
    HashSet<Integer> numsSet = new HashSet<Integer>();

   
    for (int i = 0; i < nums.length; i++) {
      Integer val = nums[i];
      numsSet.add(val);
    }

    
    System.out.println("Set of integers is:");
    for (Integer elem : numsSet) {
      System.out.println(elem);
    }

    // students should write code to
    // print the # of unique elements
    Integer unique = numsSet.size();
    System.out.printf(
      "There are %d unique integers in the array of %d random numbers.",
      unique,
      nums.length
    );
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
