/**
 * =============================================================================
 * INFOSYS SPECIALIST PROGRAMMER (SP) TOPIC-WISE ROADMAP
 * DAY 2 (19 Nov): Sliding Window & Deque, Hash Tables
 * DIFFICULTY: Medium | PROBLEM: Max Consecutive Ones III (At Most K Flips)
 * =============================================================================
 *
 * [PROBLEM DESCRIPTION]
 * Return maximum number of consecutive 1's in binary array `nums` if you can flip at most `k` 0's.
 *
 * [CONSTRAINTS & HARDWARE TARGET]
 * 1 <= nums.length <= 10^5, 0 <= k <= nums.length.
 *
 * [SAMPLE INPUT / OUTPUT]
 * nums = [1,1,1,0,0,0,1,1,1,1,0], k = 2 | Expected: 6
 *
 * [INFOSYS EXAM WARNING / HARDWARE TRAP]
 * Count zeros in window. If zeroCount > k, advance left until zeroCount <= k.
 *
 * =============================================================================
 * HOW TO TEST IN NOTEPAD:
 * 1. Implement your solution in the empty method below.
 * 2. Save the file.
 * 3. Open Command Prompt in this folder and compile & run:
 *       javac Q4_Medium_MaxConsecutiveOnesIII.java
 *       java Q4_Medium_MaxConsecutiveOnesIII
 * =============================================================================
 */

import java.util.*;
import java.io.*;


public class Q4_Medium_MaxConsecutiveOnesIII {

    // =========================================================================
    // TODO: WRITE YOUR OPTIMAL LOGIC IN THIS METHOD
    // Pure strict practice: Implement your solution from scratch.
    // =========================================================================
    public static int longestOnes(int[] nums, int k) {
        // >>> WRITE YOUR SOLUTION HERE <<<

        return 0;
    }

    // =========================================================================
    // BUILT-IN TEST RUNNER (Executes automatically when you run this file)
    // =========================================================================
    public static void main(String[] args) {
        System.out.println("==================================================");
        System.out.println("DAY 2 (19 Nov): Sliding Window & Deque, Hash Tables");
        System.out.println("PROBLEM: Max Consecutive Ones III (At Most K Flips) [Medium]");
        System.out.println("==================================================");

        System.out.println("\n[SAMPLE DETAILS]");
        System.out.println("  nums = [1,1,1,0,0,0,1,1,1,1,0], k = 2 | Expected: 6");

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
