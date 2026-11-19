/**
 * =============================================================================
 * INFOSYS SPECIALIST PROGRAMMER (SP) TOPIC-WISE ROADMAP
 * DAY 3 (20 Nov): Monotonic Stacks & Queues
 * DIFFICULTY: Easy | PROBLEM: Next Greater Element I
 * =============================================================================
 *
 * [PROBLEM DESCRIPTION]
 * Find the next greater element for each value in `nums1` within `nums2`.
 *
 * [CONSTRAINTS & HARDWARE TARGET]
 * 1 <= nums1.length <= nums2.length <= 1000.
 *
 * [SAMPLE INPUT / OUTPUT]
 * nums1 = [4, 1, 2], nums2 = [1, 3, 4, 2] | Expected: [-1, 3, -1]
 *
 * [INFOSYS EXAM WARNING / HARDWARE TRAP]
 * Scan nums2 right-to-left using a monotonic decreasing stack and store mappings in HashMap.
 *
 * =============================================================================
 * HOW TO TEST IN NOTEPAD:
 * 1. Implement your solution in the empty method below.
 * 2. Save the file.
 * 3. Open Command Prompt in this folder and compile & run:
 *       javac Q1_Easy_NextGreaterElementI.java
 *       java Q1_Easy_NextGreaterElementI
 * =============================================================================
 */

import java.util.*;
import java.io.*;


public class Q1_Easy_NextGreaterElementI {

    // =========================================================================
    // TODO: WRITE YOUR OPTIMAL LOGIC IN THIS METHOD
    // Pure strict practice: Implement your solution from scratch.
    // =========================================================================
    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        // >>> WRITE YOUR SOLUTION HERE <<<

        return new int[0];
    }

    // =========================================================================
    // BUILT-IN TEST RUNNER (Executes automatically when you run this file)
    // =========================================================================
    public static void main(String[] args) {
        System.out.println("==================================================");
        System.out.println("DAY 3 (20 Nov): Monotonic Stacks & Queues");
        System.out.println("PROBLEM: Next Greater Element I [Easy]");
        System.out.println("==================================================");

        System.out.println("\n[SAMPLE DETAILS]");
        System.out.println("  nums1 = [4, 1, 2], nums2 = [1, 3, 4, 2] | Expected: [-1, 3, -1]");

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
