/**
 * =============================================================================
 * INFOSYS SPECIALIST PROGRAMMER (SP) TOPIC-WISE ROADMAP
 * DAY 12 (29 Nov): Tries & Fenwick Trees / BIT
 * DIFFICULTY: Hard | PROBLEM: Maximum XOR Pair via Binary Trie
 * =============================================================================
 *
 * [PROBLEM DESCRIPTION]
 * Find the maximum result of `nums[i] XOR nums[j]` in an integer array.
 *
 * [CONSTRAINTS & HARDWARE TARGET]
 * 1 <= nums.length <= 2 * 10^5, 0 <= nums[i] <= 2^31 - 1.
 *
 * [SAMPLE INPUT / OUTPUT]
 * nums = [3, 10, 5, 25, 2, 8] | Expected: 28
 *
 * [INFOSYS EXAM WARNING / HARDWARE TRAP]
 * Binary Trie inserting numbers bit-by-bit from bit 30 to 0. Query greedily seeks opposite bit.
 *
 * =============================================================================
 * HOW TO TEST IN NOTEPAD:
 * 1. Implement your solution in the empty method below.
 * 2. Save the file.
 * 3. Open Command Prompt in this folder and compile & run:
 *       javac Q2_Hard_MaximumXORPair.java
 *       java Q2_Hard_MaximumXORPair
 * =============================================================================
 */

import java.util.*;
import java.io.*;


public class Q2_Hard_MaximumXORPair {

    // =========================================================================
    // TODO: WRITE YOUR OPTIMAL LOGIC IN THIS METHOD
    // Pure strict practice: Implement your solution from scratch.
    // =========================================================================
    public static int findMaximumXOR(int[] nums) {
        // >>> WRITE YOUR SOLUTION HERE <<<

        return 0;
    }

    // =========================================================================
    // BUILT-IN TEST RUNNER (Executes automatically when you run this file)
    // =========================================================================
    public static void main(String[] args) {
        System.out.println("==================================================");
        System.out.println("DAY 12 (29 Nov): Tries & Fenwick Trees / BIT");
        System.out.println("PROBLEM: Maximum XOR Pair via Binary Trie [Hard]");
        System.out.println("==================================================");

        System.out.println("\n[SAMPLE DETAILS]");
        System.out.println("  nums = [3, 10, 5, 25, 2, 8] | Expected: 28");

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
