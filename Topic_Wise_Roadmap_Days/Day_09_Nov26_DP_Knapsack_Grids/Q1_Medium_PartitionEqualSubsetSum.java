/**
 * =============================================================================
 * INFOSYS SPECIALIST PROGRAMMER (SP) TOPIC-WISE ROADMAP
 * DAY 9 (26 Nov): 0/1 Knapsack & Grid Dynamic Programming
 * DIFFICULTY: Medium | PROBLEM: Partition Equal Subset Sum (0/1 Knapsack)
 * =============================================================================
 *
 * [PROBLEM DESCRIPTION]
 * Determine if array can be partitioned into two subsets with equal sums.
 *
 * [CONSTRAINTS & HARDWARE TARGET]
 * 1 <= nums.length <= 200, 1 <= nums[i] <= 100.
 *
 * [SAMPLE INPUT / OUTPUT]
 * nums = [1, 5, 11, 5] | Expected: true
 *
 * [INFOSYS EXAM WARNING / HARDWARE TRAP]
 * Target = totalSum / 2. 1D boolean array dp[j] |= dp[j - num] iterating backwards.
 *
 * =============================================================================
 * HOW TO TEST IN NOTEPAD:
 * 1. Implement your solution in the empty method below.
 * 2. Save the file.
 * 3. Open Command Prompt in this folder and compile & run:
 *       javac Q1_Medium_PartitionEqualSubsetSum.java
 *       java Q1_Medium_PartitionEqualSubsetSum
 * =============================================================================
 */

import java.util.*;
import java.io.*;


public class Q1_Medium_PartitionEqualSubsetSum {

    // =========================================================================
    // TODO: WRITE YOUR OPTIMAL LOGIC IN THIS METHOD
    // Pure strict practice: Implement your solution from scratch.
    // =========================================================================
    public static boolean canPartition(int[] nums) {
        // >>> WRITE YOUR SOLUTION HERE <<<

        return false;
    }

    // =========================================================================
    // BUILT-IN TEST RUNNER (Executes automatically when you run this file)
    // =========================================================================
    public static void main(String[] args) {
        System.out.println("==================================================");
        System.out.println("DAY 9 (26 Nov): 0/1 Knapsack & Grid Dynamic Programming");
        System.out.println("PROBLEM: Partition Equal Subset Sum (0/1 Knapsack) [Medium]");
        System.out.println("==================================================");

        System.out.println("\n[SAMPLE DETAILS]");
        System.out.println("  nums = [1, 5, 11, 5] | Expected: true");

        System.out.println("\n[INSTRUCTIONS]");
        System.out.println("  1. Implement your logic in the empty method above.");
        System.out.println("  2. Recompile and run to test your solution.");
        System.out.println("  3. Target: 100% bug-free on all hidden edge cases.");
        System.out.println("==================================================");
    }

    // =========================================================================
    // EXAM HALL FAST I/O PARSER (Available for reading inputs from System.in)
    // =========================================================================
    static class FastReader {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        String next() {
            while (st == null || !st.hasMoreElements()) {
                try { String l = br.readLine(); if (l == null) return null; st = new StringTokenizer(l); }
                catch (IOException e) { return null; }
            }
            return st.nextToken();
        }
        int nextInt() { return Integer.parseInt(next()); }
        long nextLong() { return Long.parseLong(next()); }
    }
}
