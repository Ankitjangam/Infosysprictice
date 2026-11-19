/**
 * =============================================================================
 * INFOSYS SPECIALIST PROGRAMMER (SP) TOPIC-WISE ROADMAP
 * DAY 4 (21 Nov): Prefix Sum & Difference Arrays
 * DIFFICULTY: Medium | PROBLEM: Subarray Sum Equals K
 * =============================================================================
 *
 * [PROBLEM DESCRIPTION]
 * Find the total number of subarrays whose sum equals `k`.
 *
 * [CONSTRAINTS & HARDWARE TARGET]
 * 1 <= nums.length <= 2 * 10^4, -1000 <= nums[i] <= 1000.
 *
 * [SAMPLE INPUT / OUTPUT]
 * nums = [1, 1, 1], k = 2 | Expected: 2
 *
 * [INFOSYS EXAM WARNING / HARDWARE TRAP]
 * Maintain running prefix sum. Check if (currentSum - k) exists in HashMap.
 *
 * =============================================================================
 * HOW TO TEST IN NOTEPAD:
 * 1. Implement your solution in the empty method below.
 * 2. Save the file.
 * 3. Open Command Prompt in this folder and compile & run:
 *       javac Q1_Medium_SubarraySumEqualsK.java
 *       java Q1_Medium_SubarraySumEqualsK
 * =============================================================================
 */

import java.util.*;
import java.io.*;


public class Q1_Medium_SubarraySumEqualsK {

    // =========================================================================
    // TODO: WRITE YOUR OPTIMAL LOGIC IN THIS METHOD
    // Pure strict practice: Implement your solution from scratch.
    // =========================================================================
    public static int subarraySum(int[] nums, int k) {
        // >>> WRITE YOUR SOLUTION HERE <<<

        return 0;
    }

    // =========================================================================
    // BUILT-IN TEST RUNNER (Executes automatically when you run this file)
    // =========================================================================
    public static void main(String[] args) {
        System.out.println("==================================================");
        System.out.println("DAY 4 (21 Nov): Prefix Sum & Difference Arrays");
        System.out.println("PROBLEM: Subarray Sum Equals K [Medium]");
        System.out.println("==================================================");

        System.out.println("\n[SAMPLE DETAILS]");
        System.out.println("  nums = [1, 1, 1], k = 2 | Expected: 2");

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
