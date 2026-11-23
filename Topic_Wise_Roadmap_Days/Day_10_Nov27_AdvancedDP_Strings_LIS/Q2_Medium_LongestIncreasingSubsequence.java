/**
 * =============================================================================
 * INFOSYS SPECIALIST PROGRAMMER (SP) TOPIC-WISE ROADMAP
 * DAY 10 (27 Nov): Advanced DP (LCS, String DP, LIS)
 * DIFFICULTY: Medium | PROBLEM: Longest Increasing Subsequence (LIS O(N log N))
 * =============================================================================
 *
 * [PROBLEM DESCRIPTION]
 * Find length of longest strictly increasing subsequence.
 *
 * [CONSTRAINTS & HARDWARE TARGET]
 * 1 <= nums.length <= 2500, -10^4 <= nums[i] <= 10^4.
 *
 * [SAMPLE INPUT / OUTPUT]
 * nums = [10,9,2,5,3,7,101,18] | Expected: 4
 *
 * [INFOSYS EXAM WARNING / HARDWARE TRAP]
 * Patience sorting algorithm using binary search (Arrays.binarySearch) in O(N log N) time.
 *
 * =============================================================================
 * HOW TO TEST IN NOTEPAD:
 * 1. Implement your solution in the empty method below.
 * 2. Save the file.
 * 3. Open Command Prompt in this folder and compile & run:
 *       javac Q2_Medium_LongestIncreasingSubsequence.java
 *       java -cp . Q2_Medium_LongestIncreasingSubsequence
 * =============================================================================
 */

import java.util.*;
import java.io.*;


public class Q2_Medium_LongestIncreasingSubsequence {

    // =========================================================================
    // TODO: WRITE YOUR OPTIMAL LOGIC IN THIS METHOD
    // Pure strict practice: Implement your solution from scratch.
    // =========================================================================
    public static int lengthOfLIS(int[] nums) {
        // >>> WRITE YOUR SOLUTION HERE <<<

        return 0;
    }

    // =========================================================================
    // BUILT-IN AUTOMATED TEST RUNNER (Calls your method and verifies verdict)
    // =========================================================================
    public static void main(String[] args) {
        System.out.println("==================================================");
        System.out.println("DAY 10 (27 Nov): Advanced DP (LCS, String DP, LIS)");
        System.out.println("PROBLEM: Longest Increasing Subsequence (LIS O(N log N)) [Medium]");
        System.out.println("==================================================");

        int passed = 0, total = 0;
        total++;
        int[] in1 = {10, 9, 2, 5, 3, 7, 101, 18}; int exp1 = 4;
        int got1 = lengthOfLIS(in1);
        boolean p1 = (got1 == exp1);
        if (p1) passed++;
        System.out.println("[TEST 1] nums = " + Arrays.toString(in1));
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
