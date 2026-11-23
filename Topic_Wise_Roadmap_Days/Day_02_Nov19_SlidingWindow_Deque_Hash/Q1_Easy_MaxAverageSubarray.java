/**
 * =============================================================================
 * INFOSYS SPECIALIST PROGRAMMER (SP) TOPIC-WISE ROADMAP
 * DAY 2 (19 Nov): Sliding Window & Deque, Hash Tables
 * DIFFICULTY: Easy | PROBLEM: Maximum Average Subarray of Size K
 * =============================================================================
 *
 * [PROBLEM DESCRIPTION]
 * Find a contiguous subarray of length `k` that has the maximum average value.
 *
 * [CONSTRAINTS & HARDWARE TARGET]
 * 1 <= k <= nums.length <= 10^5, -10^4 <= nums[i] <= 10^4.
 *
 * [SAMPLE INPUT / OUTPUT]
 * nums = [1, 12, -5, -6, 50, 3], k = 4 | Expected: 12.75
 *
 * [INFOSYS EXAM WARNING / HARDWARE TRAP]
 * Use running sliding window sum: add incoming at right, subtract outgoing at left.
 *
 * =============================================================================
 * HOW TO TEST IN NOTEPAD:
 * 1. Implement your solution in the empty method below.
 * 2. Save the file.
 * 3. Open Command Prompt in this folder and compile & run:
 *       javac Q1_Easy_MaxAverageSubarray.java
 *       java -cp . Q1_Easy_MaxAverageSubarray
 * =============================================================================
 */

import java.util.*;
import java.io.*;


public class Q1_Easy_MaxAverageSubarray {

    // =========================================================================
    // TODO: WRITE YOUR OPTIMAL LOGIC IN THIS METHOD
    // Pure strict practice: Implement your solution from scratch.
    // =========================================================================
    public static double findMaxAverage(int[] nums, int k) {
        // >>> WRITE YOUR SOLUTION HERE <<<

        return 0.0;
    }

    // =========================================================================
    // BUILT-IN AUTOMATED TEST RUNNER (Calls your method and verifies verdict)
    // =========================================================================
    public static void main(String[] args) {
        System.out.println("==================================================");
        System.out.println("DAY 2 (19 Nov): Sliding Window & Deque, Hash Tables");
        System.out.println("PROBLEM: Maximum Average Subarray of Size K [Easy]");
        System.out.println("==================================================");

        int passed = 0, total = 0;
        total++;
        int[] in1 = {1, 12, -5, -6, 50, 3}; int k1 = 4; double exp1 = 12.75;
        double got1 = findMaxAverage(in1, k1);
        boolean p1 = Math.abs(got1 - exp1) < 1e-5;
        if (p1) passed++;
        System.out.println("[TEST 1] In: " + Arrays.toString(in1) + ", k = " + k1);
        System.out.println("         Expected: " + exp1 + " | Got: " + got1);
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
