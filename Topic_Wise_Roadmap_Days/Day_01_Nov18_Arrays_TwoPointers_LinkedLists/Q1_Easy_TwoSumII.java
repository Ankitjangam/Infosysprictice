/**
 * =============================================================================
 * INFOSYS SPECIALIST PROGRAMMER (SP) TOPIC-WISE ROADMAP
 * DAY 1 (18 Nov): Arrays, String Basics, Two Pointers & Linked Lists
 * DIFFICULTY: Easy | PROBLEM: Two Sum II (Monotonic Space)
 * =============================================================================
 *
 * [PROBLEM DESCRIPTION]
 * Given sorted array `capacities`, find 1-based indices of two substations whose sum equals `target`.
 *
 * [CONSTRAINTS & HARDWARE TARGET]
 * 2 <= N <= 10^5, -10^9 <= capacities[i] <= 10^9. Exactly one valid pair exists.
 *
 * [SAMPLE INPUT / OUTPUT]
 * capacities = [2, 7, 11, 15], target = 9 | Expected: [1, 2]
 *
 * [INFOSYS EXAM WARNING / HARDWARE TRAP]
 * Cast to (long) before addition to avoid 32-bit signed integer overflow.
 *
 * =============================================================================
 * HOW TO TEST IN NOTEPAD:
 * 1. Implement your solution in the empty method below.
 * 2. Save the file.
 * 3. Open Command Prompt in this folder and compile & run:
 *       javac Q1_Easy_TwoSumII.java
 *       java Q1_Easy_TwoSumII
 * =============================================================================
 */

import java.util.*;
import java.io.*;


public class Q1_Easy_TwoSumII {

    // =========================================================================
    // TODO: WRITE YOUR OPTIMAL LOGIC IN THIS METHOD
    // Pure strict practice: Implement your solution from scratch.
    // =========================================================================
    public static int[] twoSum(int[] capacities, int target) {
        // >>> WRITE YOUR SOLUTION HERE <<<

        return new int[0];
    }

    // =========================================================================
    // BUILT-IN TEST RUNNER (Executes automatically when you run this file)
    // =========================================================================
    public static void main(String[] args) {
        System.out.println("==================================================");
        System.out.println("DAY 1 (18 Nov): Arrays, String Basics, Two Pointers & Linked Lists");
        System.out.println("PROBLEM: Two Sum II (Monotonic Space) [Easy]");
        System.out.println("==================================================");

        System.out.println("\n[SAMPLE DETAILS]");
        System.out.println("  capacities = [2, 7, 11, 15], target = 9 | Expected: [1, 2]");

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
