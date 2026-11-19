/**
 * =============================================================================
 * INFOSYS SPECIALIST PROGRAMMER (SP) TOPIC-WISE ROADMAP
 * DAY 1 (18 Nov): Arrays, String Basics, Two Pointers & Linked Lists
 * DIFFICULTY: Medium | PROBLEM: Dutch National Flag (Sort 0s, 1s, 2s)
 * =============================================================================
 *
 * [PROBLEM DESCRIPTION]
 * Sort an array `nums` containing 0s, 1s, and 2s in-place in a single pass O(N) time.
 *
 * [CONSTRAINTS & HARDWARE TARGET]
 * 1 <= nums.length <= 10^5, nums[i] is 0, 1, or 2.
 *
 * [SAMPLE INPUT / OUTPUT]
 * nums = [2, 0, 2, 1, 1, 0] | Expected: [0, 0, 1, 1, 2, 2]
 *
 * [INFOSYS EXAM WARNING / HARDWARE TRAP]
 * Do not increment mid pointer when swapping with high pointer; examine the swapped element.
 *
 * =============================================================================
 * HOW TO TEST IN NOTEPAD:
 * 1. Implement your solution in the empty method below.
 * 2. Save the file.
 * 3. Open Command Prompt in this folder and compile & run:
 *       javac Q4_Medium_DutchNationalFlag.java
 *       java Q4_Medium_DutchNationalFlag
 * =============================================================================
 */

import java.util.*;
import java.io.*;


public class Q4_Medium_DutchNationalFlag {

    // =========================================================================
    // TODO: WRITE YOUR OPTIMAL LOGIC IN THIS METHOD
    // Pure strict practice: Implement your solution from scratch.
    // =========================================================================
    public static void sortColors(int[] nums) {
        // >>> WRITE YOUR SOLUTION HERE <<<

        return;
    }

    // =========================================================================
    // BUILT-IN TEST RUNNER (Executes automatically when you run this file)
    // =========================================================================
    public static void main(String[] args) {
        System.out.println("==================================================");
        System.out.println("DAY 1 (18 Nov): Arrays, String Basics, Two Pointers & Linked Lists");
        System.out.println("PROBLEM: Dutch National Flag (Sort 0s, 1s, 2s) [Medium]");
        System.out.println("==================================================");

        System.out.println("\n[SAMPLE DETAILS]");
        System.out.println("  nums = [2, 0, 2, 1, 1, 0] | Expected: [0, 0, 1, 1, 2, 2]");

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
