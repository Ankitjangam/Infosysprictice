/**
 * =============================================================================
 * INFOSYS SPECIALIST PROGRAMMER (SP) TOPIC-WISE ROADMAP
 * DAY 2 (19 Nov): Sliding Window & Deque, Hash Tables
 * DIFFICULTY: Hard | PROBLEM: Sliding Window Maximum (O(N) Deque)
 * =============================================================================
 *
 * [PROBLEM DESCRIPTION]
 * Return maximum element in sliding window of size `k` moving from left to right.
 *
 * [CONSTRAINTS & HARDWARE TARGET]
 * 1 <= nums.length <= 10^5, 1 <= k <= nums.length.
 *
 * [SAMPLE INPUT / OUTPUT]
 * nums = [1,3,-1,-3,5,3,6,7], k = 3 | Expected: [3, 3, 5, 5, 6, 7]
 *
 * [INFOSYS EXAM WARNING / HARDWARE TRAP]
 * Use ArrayDeque storing indices in strictly decreasing order of values. Complexity O(N).
 *
 * =============================================================================
 * HOW TO TEST IN NOTEPAD:
 * 1. Implement your solution in the empty method below.
 * 2. Save the file.
 * 3. Open Command Prompt in this folder and compile & run:
 *       javac Q5_Hard_SlidingWindowMaximum.java
 *       java Q5_Hard_SlidingWindowMaximum
 * =============================================================================
 */

import java.util.*;
import java.io.*;


public class Q5_Hard_SlidingWindowMaximum {

    // =========================================================================
    // TODO: WRITE YOUR OPTIMAL LOGIC IN THIS METHOD
    // Pure strict practice: Implement your solution from scratch.
    // =========================================================================
    public static int[] maxSlidingWindow(int[] nums, int k) {
        // >>> WRITE YOUR SOLUTION HERE <<<

        return new int[0];
    }

    // =========================================================================
    // BUILT-IN TEST RUNNER (Executes automatically when you run this file)
    // =========================================================================
    public static void main(String[] args) {
        System.out.println("==================================================");
        System.out.println("DAY 2 (19 Nov): Sliding Window & Deque, Hash Tables");
        System.out.println("PROBLEM: Sliding Window Maximum (O(N) Deque) [Hard]");
        System.out.println("==================================================");

        System.out.println("\n[SAMPLE DETAILS]");
        System.out.println("  nums = [1,3,-1,-3,5,3,6,7], k = 3 | Expected: [3, 3, 5, 5, 6, 7]");

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
