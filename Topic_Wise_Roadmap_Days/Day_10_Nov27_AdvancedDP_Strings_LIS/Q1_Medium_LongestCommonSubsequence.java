/**
 * =============================================================================
 * INFOSYS SPECIALIST PROGRAMMER (SP) TOPIC-WISE ROADMAP
 * DAY 10 (27 Nov): Advanced DP (LCS, String DP, LIS)
 * DIFFICULTY: Medium | PROBLEM: Longest Common Subsequence (LCS)
 * =============================================================================
 *
 * [PROBLEM DESCRIPTION]
 * Return length of longest common subsequence between two strings `text1` and `text2`.
 *
 * [CONSTRAINTS & HARDWARE TARGET]
 * 1 <= text1.length, text2.length <= 1000.
 *
 * [SAMPLE INPUT / OUTPUT]
 * text1 = "abcde", text2 = "ace" | Expected: 3
 *
 * [INFOSYS EXAM WARNING / HARDWARE TRAP]
 * 2D DP table: if text1[i-1] == text2[j-1] dp[i][j] = dp[i-1][j-1] + 1; else max(left, up).
 *
 * =============================================================================
 * HOW TO TEST IN NOTEPAD:
 * 1. Implement your solution in the empty method below.
 * 2. Save the file.
 * 3. Open Command Prompt in this folder and compile & run:
 *       javac Q1_Medium_LongestCommonSubsequence.java
 *       java -cp . Q1_Medium_LongestCommonSubsequence
 * =============================================================================
 */

import java.util.*;
import java.io.*;


public class Q1_Medium_LongestCommonSubsequence {

    // =========================================================================
    // TODO: WRITE YOUR OPTIMAL LOGIC IN THIS METHOD
    // Pure strict practice: Implement your solution from scratch.
    // =========================================================================
    public static int longestCommonSubsequence(String text1, String text2) {
        // >>> WRITE YOUR SOLUTION HERE <<<

        return 0;
    }

    // =========================================================================
    // BUILT-IN AUTOMATED TEST RUNNER (Calls your method and verifies verdict)
    // =========================================================================
    public static void main(String[] args) {
        System.out.println("==================================================");
        System.out.println("DAY 10 (27 Nov): Advanced DP (LCS, String DP, LIS)");
        System.out.println("PROBLEM: Longest Common Subsequence (LCS) [Medium]");
        System.out.println("==================================================");

        int passed = 0, total = 0;
        total++;
        String t1 = "abcde", t2 = "ace"; int exp1 = 3;
        int got1 = longestCommonSubsequence(t1, t2);
        boolean p1 = (got1 == exp1);
        if (p1) passed++;
        System.out.println("[TEST 1] text1 = \"" + t1 + "\", text2 = \"" + t2 + "\"");
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
