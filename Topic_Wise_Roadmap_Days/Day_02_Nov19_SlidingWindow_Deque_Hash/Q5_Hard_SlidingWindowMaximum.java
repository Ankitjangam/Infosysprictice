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
 *       java -cp . Q5_Hard_SlidingWindowMaximum
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
    // BUILT-IN AUTOMATED TEST RUNNER (Calls your method and verifies verdict)
    // =========================================================================
    public static void main(String[] args) {
        System.out.println("==================================================");
        System.out.println("DAY 2 (19 Nov): Sliding Window & Deque, Hash Tables");
        System.out.println("PROBLEM: Sliding Window Maximum (O(N) Deque) [Hard]");
        System.out.println("==================================================");

        int passed = 0, total = 0;
        total++;
        int[] in1 = {1, 3, -1, -3, 5, 3, 6, 7}; int k1 = 3; int[] exp1 = {3, 3, 5, 5, 6, 7};
        int[] got1 = maxSlidingWindow(in1, k1);
        boolean p1 = Arrays.equals(got1, exp1);
        if (p1) passed++;
        System.out.println("[TEST 1] In: " + Arrays.toString(in1) + ", k = " + k1);
        System.out.println("         Expected: " + Arrays.toString(exp1) + " | Got: " + Arrays.toString(got1));
        System.out.println("         Verdict:  " + (p1 ? ">> PASS <<" : "!! FAIL !!"));
        printSummary(passed, total);

    }

    // =========================================================================
    // TEST HELPER UTILITIES
    // =========================================================================
    private static void printSummary(int passed, int total) {
        System.out.println("\n--------------------------------------------------");
        System.out.println("RESULT: " + passed + " / " + total + " Test Cases Passed.");
        if (passed == total) {
            System.out.println("STATUS: [PASS] All automated test cases cleared!");
        } else {
            System.out.println("STATUS: [FAIL] Check your logic and re-test.");
        }
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
