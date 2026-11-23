/**
 * =============================================================================
 * INFOSYS SPECIALIST PROGRAMMER (SP) IN-PERSON CODING ASSESSMENT
 * SET 11 | QUESTION 4 &bull; Hard (12 Cases)
 * Q4 (Hard - 12 Cases): Minimum Currency Denomination (Unbounded Knapsack Coin Change)
 * =============================================================================
 *
 * [PROBLEM DESCRIPTION]
 * Fewest coins needed to make up amount using unlimited copies of denominations, or -1.
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
 *       javac Q4_Hard.java
 *       java -cp . Q4_Hard
 * =============================================================================
 */

import java.util.*;
import java.io.*;


public class Q4_Hard {

    // =========================================================================
    // TODO: WRITE YOUR OPTIMAL LOGIC IN THIS METHOD
    // Pure strict practice: Implement your solution from scratch.
    // =========================================================================
    public static int solveQ4(int[] coins, int amount) {
        // >>> WRITE YOUR SOLUTION HERE <<<
        return -1;
    }

    // =========================================================================
    // BUILT-IN AUTOMATED TEST RUNNER (Calls your method and verifies verdict)
    // =========================================================================
    public static void main(String[] args) {
        System.out.println("==================================================");
        System.out.println("INFOSYS EXAM PRACTICE: SET 11 - QUESTION 4");
        System.out.println("Q4 (Hard - 12 Cases): Minimum Currency Denomination (Unbounded Knapsack Coin Change)");
        System.out.println("==================================================");
        int passed = 0, total = 0; total++;
        int[] coins = {1, 2, 5}; int amt = 11; int exp1 = 3;
        int got1 = solveQ4(coins, amt);
        boolean p1 = (got1 == exp1); if (p1) passed++;
        System.out.println("[TEST 1] coins = " + Arrays.toString(coins) + ", amount = " + amt);
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
