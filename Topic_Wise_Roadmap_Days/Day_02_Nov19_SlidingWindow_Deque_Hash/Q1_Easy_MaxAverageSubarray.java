/**
 * =============================================================================
 * INFOSYS SPECIALIST PROGRAMMER (SP) TOPIC-WISE ROADMAP
 * DAY 2 (19 Nov): Sliding Window & Deque, Hash Tables
 * DIFFICULTY: Easy | PROBLEM: Maximum Average Subarray of Size K
 * =============================================================================
 *
 * [PROBLEM DESCRIPTION]
 * Find a contiguous subarray of length `k` that has the maximum average value.
 *
 * [CONSTRAINTS & HARDWARE TARGET]
 * 1 <= k <= nums.length <= 10^5, -10^4 <= nums[i] <= 10^4.
 *
 * [SAMPLE INPUT / OUTPUT]
 * nums = [1, 12, -5, -6, 50, 3], k = 4 | Expected: 12.75
 *
 * [INFOSYS EXAM WARNING / HARDWARE TRAP]
 * Use running sliding window sum: add incoming at right, subtract outgoing at left.
 *
 * =============================================================================
 * HOW TO TEST IN NOTEPAD:
 * 1. Implement your solution in the empty method below.
 * 2. Save the file.
 * 3. Open Command Prompt in this folder and compile & run:
 *       javac Q1_Easy_MaxAverageSubarray.java
 *       java Q1_Easy_MaxAverageSubarray
 * =============================================================================
 */

import java.util.*;
import java.io.*;


public class Q1_Easy_MaxAverageSubarray {

    // =========================================================================
    // TODO: WRITE YOUR OPTIMAL LOGIC IN THIS METHOD
    // Pure strict practice: Implement your solution from scratch.
    // =========================================================================
    public static double findMaxAverage(int[] nums, int k) {
        // >>> WRITE YOUR SOLUTION HERE <<<

        return 0.0;
    }

    // =========================================================================
    // BUILT-IN TEST RUNNER (Executes automatically when you run this file)
    // =========================================================================
    public static void main(String[] args) {
        System.out.println("==================================================");
        System.out.println("DAY 2 (19 Nov): Sliding Window & Deque, Hash Tables");
        System.out.println("PROBLEM: Maximum Average Subarray of Size K [Easy]");
        System.out.println("==================================================");

        System.out.println("\n[SAMPLE DETAILS]");
        System.out.println("  nums = [1, 12, -5, -6, 50, 3], k = 4 | Expected: 12.75");

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
