/**
 * =============================================================================
 * INFOSYS SPECIALIST PROGRAMMER (SP) TOPIC-WISE ROADMAP
 * DAY 2 (19 Nov): Sliding Window & Deque, Hash Tables
 * DIFFICULTY: Medium | PROBLEM: Max Consecutive Ones III (At Most K Flips)
 * =============================================================================
 *
 * [PROBLEM DESCRIPTION]
 * Return maximum number of consecutive 1's in binary array `nums` if you can flip at most `k` 0's.
 *
 * [CONSTRAINTS & HARDWARE TARGET]
 * 1 <= nums.length <= 10^5, 0 <= k <= nums.length.
 *
 * [SAMPLE INPUT / OUTPUT]
 * nums = [1,1,1,0,0,0,1,1,1,1,0], k = 2 | Expected: 6
 *
 * [INFOSYS EXAM WARNING / HARDWARE TRAP]
 * Count zeros in window. If zeroCount > k, advance left until zeroCount <= k.
 *
 * =============================================================================
 * HOW TO TEST IN NOTEPAD:
 * 1. Implement your solution in the empty method below.
 * 2. Save the file.
 * 3. Open Command Prompt in this folder and compile & run:
 *       javac Q4_Medium_MaxConsecutiveOnesIII.java
 *       java -cp . Q4_Medium_MaxConsecutiveOnesIII
 * =============================================================================
 */

import java.util.*;
import java.io.*;


public class Q4_Medium_MaxConsecutiveOnesIII {

    // =========================================================================
    // TODO: WRITE YOUR OPTIMAL LOGIC IN THIS METHOD
    // Pure strict practice: Implement your solution from scratch.
    // =========================================================================
    public static int longestOnes(int[] nums, int k) {
        // >>> WRITE YOUR SOLUTION HERE <<<

        return 0;
    }

    // =========================================================================
    // BUILT-IN AUTOMATED TEST RUNNER (Calls your method and verifies verdict)
    // =========================================================================
    public static void main(String[] args) {
        System.out.println("==================================================");
        System.out.println("DAY 2 (19 Nov): Sliding Window & Deque, Hash Tables");
        System.out.println("PROBLEM: Max Consecutive Ones III (At Most K Flips) [Medium]");
        System.out.println("==================================================");

        int passed = 0, total = 0;
        total++;
        int[] in1 = {1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0}; int k1 = 2; int exp1 = 6;
        int got1 = longestOnes(in1, k1);
        boolean p1 = (got1 == exp1);
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
