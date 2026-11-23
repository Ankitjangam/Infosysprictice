/**
 * =============================================================================
 * INFOSYS SPECIALIST PROGRAMMER (SP) TOPIC-WISE ROADMAP
 * DAY 10 (27 Nov): Advanced DP (LCS, String DP, LIS)
 * DIFFICULTY: Hard | PROBLEM: Edit Distance (Levenshtein Distance)
 * =============================================================================
 *
 * [PROBLEM DESCRIPTION]
 * Find minimum operations (insert, delete, replace) to convert `word1` to `word2`.
 *
 * [CONSTRAINTS & HARDWARE TARGET]
 * 0 <= word1.length, word2.length <= 500.
 *
 * [SAMPLE INPUT / OUTPUT]
 * word1 = "horse", word2 = "ros" | Expected: 3
 *
 * [INFOSYS EXAM WARNING / HARDWARE TRAP]
 * 2D DP: if chars match dp[i][j]=dp[i-1][j-1]; else 1 + min(insert, delete, replace).
 *
 * =============================================================================
 * HOW TO TEST IN NOTEPAD:
 * 1. Implement your solution in the empty method below.
 * 2. Save the file.
 * 3. Open Command Prompt in this folder and compile & run:
 *       javac Q3_Hard_EditDistance.java
 *       java -cp . Q3_Hard_EditDistance
 * =============================================================================
 */

import java.util.*;
import java.io.*;


public class Q3_Hard_EditDistance {

    // =========================================================================
    // TODO: WRITE YOUR OPTIMAL LOGIC IN THIS METHOD
    // Pure strict practice: Implement your solution from scratch.
    // =========================================================================
    public static int minDistance(String word1, String word2) {
        // >>> WRITE YOUR SOLUTION HERE <<<

        return 0;
    }

    // =========================================================================
    // BUILT-IN AUTOMATED TEST RUNNER (Calls your method and verifies verdict)
    // =========================================================================
    public static void main(String[] args) {
        System.out.println("==================================================");
        System.out.println("DAY 10 (27 Nov): Advanced DP (LCS, String DP, LIS)");
        System.out.println("PROBLEM: Edit Distance (Levenshtein Distance) [Hard]");
        System.out.println("==================================================");

        int passed = 0, total = 0;
        total++;
        String w1 = "horse", w2 = "ros"; int exp1 = 3;
        int got1 = minDistance(w1, w2);
        boolean p1 = (got1 == exp1);
        if (p1) passed++;
        System.out.println("[TEST 1] word1 = \"" + w1 + "\", word2 = \"" + w2 + "\"");
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
