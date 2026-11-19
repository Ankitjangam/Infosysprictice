/**
 * =============================================================================
 * INFOSYS SPECIALIST PROGRAMMER (SP) TOPIC-WISE ROADMAP
 * DAY 2 (19 Nov): Sliding Window & Deque, Hash Tables
 * DIFFICULTY: Hard | PROBLEM: Subarrays with Exactly K Distinct Integers
 * =============================================================================
 *
 * [PROBLEM DESCRIPTION]
 * Return number of good subarrays having exactly `k` distinct integers.
 *
 * [CONSTRAINTS & HARDWARE TARGET]
 * 1 <= nums.length <= 2 * 10^4, 1 <= k <= nums.length.
 *
 * [SAMPLE INPUT / OUTPUT]
 * nums = [1, 2, 1, 2, 3], k = 2 | Expected: 7
 *
 * [INFOSYS EXAM WARNING / HARDWARE TRAP]
 * exact(K) = atMost(K) - atMost(K - 1) identity avoids non-monotonic window states.
 *
 * =============================================================================
 * HOW TO TEST IN NOTEPAD:
 * 1. Implement your solution in the empty method below.
 * 2. Save the file.
 * 3. Open Command Prompt in this folder and compile & run:
 *       javac Q6_Hard_SubarraysWithKDistinct.java
 *       java Q6_Hard_SubarraysWithKDistinct
 * =============================================================================
 */

import java.util.*;
import java.io.*;


public class Q6_Hard_SubarraysWithKDistinct {

    // =========================================================================
    // TODO: WRITE YOUR OPTIMAL LOGIC IN THIS METHOD
    // Pure strict practice: Implement your solution from scratch.
    // =========================================================================
    public static int subarraysWithKDistinct(int[] nums, int k) {
        // >>> WRITE YOUR SOLUTION HERE <<<

        return 0;
    }

    // =========================================================================
    // BUILT-IN TEST RUNNER (Executes automatically when you run this file)
    // =========================================================================
    public static void main(String[] args) {
        System.out.println("==================================================");
        System.out.println("DAY 2 (19 Nov): Sliding Window & Deque, Hash Tables");
        System.out.println("PROBLEM: Subarrays with Exactly K Distinct Integers [Hard]");
        System.out.println("==================================================");

        System.out.println("\n[SAMPLE DETAILS]");
        System.out.println("  nums = [1, 2, 1, 2, 3], k = 2 | Expected: 7");

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
