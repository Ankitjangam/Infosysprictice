/**
 * =============================================================================
 * INFOSYS SPECIALIST PROGRAMMER (SP) TOPIC-WISE ROADMAP
 * DAY 1 (18 Nov): Arrays, String Basics, Two Pointers & Linked Lists
 * DIFFICULTY: Easy | PROBLEM: Move Zeroes In-Place
 * =============================================================================
 *
 * [PROBLEM DESCRIPTION]
 * Given an array `nums`, move all 0's to the end while maintaining relative order of non-zero elements.
 *
 * [CONSTRAINTS & HARDWARE TARGET]
 * 1 <= nums.length <= 10^5, -2^31 <= nums[i] <= 2^31 - 1. Must be in-place O(1) space.
 *
 * [SAMPLE INPUT / OUTPUT]
 * nums = [0, 1, 0, 3, 12] | Expected: [1, 3, 12, 0, 0]
 *
 * [INFOSYS EXAM WARNING / HARDWARE TRAP]
 * Do not allocate a new array. Use read and write pointers.
 *
 * =============================================================================
 * HOW TO TEST IN NOTEPAD:
 * 1. Implement your solution in the empty method below.
 * 2. Save the file.
 * 3. Open Command Prompt in this folder and compile & run:
 *       javac Q2_Easy_MoveZeroes.java
 *       java Q2_Easy_MoveZeroes
 * =============================================================================
 */

import java.util.*;
import java.io.*;


public class Q2_Easy_MoveZeroes {

    // =========================================================================
    // TODO: WRITE YOUR OPTIMAL LOGIC IN THIS METHOD
    // Pure strict practice: Implement your solution from scratch.
    // =========================================================================
    public static void moveZeroes(int[] nums) {
        // >>> WRITE YOUR SOLUTION HERE <<<

        return;
    }

    // =========================================================================
    // BUILT-IN TEST RUNNER (Executes automatically when you run this file)
    // =========================================================================
    public static void main(String[] args) {
        System.out.println("==================================================");
        System.out.println("DAY 1 (18 Nov): Arrays, String Basics, Two Pointers & Linked Lists");
        System.out.println("PROBLEM: Move Zeroes In-Place [Easy]");
        System.out.println("==================================================");

        System.out.println("\n[SAMPLE DETAILS]");
        System.out.println("  nums = [0, 1, 0, 3, 12] | Expected: [1, 3, 12, 0, 0]");

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
