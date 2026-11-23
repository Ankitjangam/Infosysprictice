/**
 * =============================================================================
 * INFOSYS SPECIALIST PROGRAMMER (SP) IN-PERSON CODING ASSESSMENT
 * SET 18 | QUESTION 2 &bull; Easy-Medium (12 Cases)
 * Q2 (Easy-Med - 12 Cases): Currency Exchange Arbitrage Cycle (Negative Log Bellman-Ford)
 * =============================================================================
 *
 * [PROBLEM DESCRIPTION]
 * $N$ currencies with conversion rates $Rate[u][v]$. Detect if a cycle exists with total conversion product $> 1.0$.
 *
 * [CONSTRAINTS]
 * Standard exam constraints.
 *
 * [SAMPLE INPUT / OUTPUT]
 * Standard sample cases.
 *
 * [INFOSYS EXAM WARNING / HARDWARE TRAP]
 * Watch for boundary and 32-bit integer overflow traps.
 *
 * =============================================================================
 * HOW TO TEST IN NOTEPAD:
 * 1. Implement your solution in the empty method below.
 * 2. Save the file.
 * 3. Open Command Prompt in this folder and compile & run:
 *       javac Q2_Medium.java
 *       java -cp . Q2_Medium
 * =============================================================================
 */

import java.util.*;
import java.io.*;


public class Q2_Medium {

    // =========================================================================
    // TODO: WRITE YOUR OPTIMAL LOGIC IN THIS METHOD
    // Pure strict practice: Implement your solution from scratch.
    // =========================================================================
    public static boolean detectArbitrage(int n, double[][] rates) {
        // >>> WRITE YOUR SOLUTION HERE <<<
        return false;
    }

    // =========================================================================
    // BUILT-IN AUTOMATED TEST RUNNER (Calls your method and verifies verdict)
    // =========================================================================
    public static void main(String[] args) {
        System.out.println("==================================================");
        System.out.println("INFOSYS EXAM PRACTICE: SET 18 - QUESTION 2");
        System.out.println("Q2 (Easy-Med - 12 Cases): Currency Exchange Arbitrage Cycle (Negative Log Bellman-Ford)");
        System.out.println("==================================================");
        int passed = 0, total = 0; total++;
        int n = 3; double[][] rates = {{1.0, 0.5, 0.2}, {2.0, 1.0, 0.5}, {5.0, 2.0, 1.0}};
        boolean got1 = detectArbitrage(n, rates);
        boolean exp1 = false;
        boolean p1 = (got1 == exp1); if (p1) passed++;
        System.out.println("[TEST 1] 3 currencies conversion matrix");
        System.out.println("         Expected Arbitrage: " + exp1 + " | Got: " + got1);
        System.out.println("         Verdict:            " + (p1 ? ">> PASS <<" : "!! FAIL !!"));
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
