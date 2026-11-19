/**
 * =============================================================================
 * INFOSYS SPECIALIST PROGRAMMER (SP) TOPIC-WISE ROADMAP
 * DAY 4 (21 Nov): Prefix Sum & Difference Arrays
 * DIFFICULTY: Medium | PROBLEM: Subarrays Divisible by K
 * =============================================================================
 *
 * [PROBLEM DESCRIPTION]
 * Return number of non-empty subarrays with sum divisible by `k`.
 *
 * [CONSTRAINTS & HARDWARE TARGET]
 * 1 <= nums.length <= 3 * 10^4, 2 <= k <= 10^4.
 *
 * [SAMPLE INPUT / OUTPUT]
 * nums = [4, 5, 0, -2, -3, 1], k = 5 | Expected: 7
 *
 * [INFOSYS EXAM WARNING / HARDWARE TRAP]
 * Normalize negative modulo: rem = ((prefix % k) + k) % k. Store counts in frequency array.
 *
 * =============================================================================
 * HOW TO TEST IN NOTEPAD:
 * 1. Implement your solution in the empty method below.
 * 2. Save the file.
 * 3. Open Command Prompt in this folder and compile & run:
 *       javac Q2_Medium_SubarraysDivisibleByK.java
 *       java Q2_Medium_SubarraysDivisibleByK
 * =============================================================================
 */

import java.util.*;
import java.io.*;


public class Q2_Medium_SubarraysDivisibleByK {

    // =========================================================================
    // TODO: WRITE YOUR OPTIMAL LOGIC IN THIS METHOD
    // Pure strict practice: Implement your solution from scratch.
    // =========================================================================
    public static int subarraysDivByK(int[] nums, int k) {
        // >>> WRITE YOUR SOLUTION HERE <<<

        return 0;
    }

    // =========================================================================
    // BUILT-IN TEST RUNNER (Executes automatically when you run this file)
    // =========================================================================
    public static void main(String[] args) {
        System.out.println("==================================================");
        System.out.println("DAY 4 (21 Nov): Prefix Sum & Difference Arrays");
        System.out.println("PROBLEM: Subarrays Divisible by K [Medium]");
        System.out.println("==================================================");

        System.out.println("\n[SAMPLE DETAILS]");
        System.out.println("  nums = [4, 5, 0, -2, -3, 1], k = 5 | Expected: 7");

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
