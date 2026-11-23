/**
 * =============================================================================
 * INFOSYS SPECIALIST PROGRAMMER (SP) TOPIC-WISE ROADMAP
 * DAY 9 (26 Nov): 0/1 Knapsack & Grid Dynamic Programming
 * DIFFICULTY: Medium | PROBLEM: Coin Change (Fewest Coins - Unbounded DP)
 * =============================================================================
 *
 * [PROBLEM DESCRIPTION]
 * Find fewest coins needed to make up given amount `amount`.
 *
 * [CONSTRAINTS & HARDWARE TARGET]
 * 1 <= coins.length <= 12, 1 <= amount <= 10^4.
 *
 * [SAMPLE INPUT / OUTPUT]
 * coins = [1, 2, 5], amount = 11 | Expected: 3
 *
 * [INFOSYS EXAM WARNING / HARDWARE TRAP]
 * dp[j] = Math.min(dp[j], dp[j - coin] + 1) iterating forward from coin to amount.
 *
 * =============================================================================
 * HOW TO TEST IN NOTEPAD:
 * 1. Implement your solution in the empty method below.
 * 2. Save the file.
 * 3. Open Command Prompt in this folder and compile & run:
 *       javac Q2_Medium_CoinChangeUnbounded.java
 *       java -cp . Q2_Medium_CoinChangeUnbounded
 * =============================================================================
 */

import java.util.*;
import java.io.*;


public class Q2_Medium_CoinChangeUnbounded {

    // =========================================================================
    // TODO: WRITE YOUR OPTIMAL LOGIC IN THIS METHOD
    // Pure strict practice: Implement your solution from scratch.
    // =========================================================================
    public static int coinChange(int[] coins, int amount) {
        // >>> WRITE YOUR SOLUTION HERE <<<

        return 0;
    }

    // =========================================================================
    // BUILT-IN AUTOMATED TEST RUNNER (Calls your method and verifies verdict)
    // =========================================================================
    public static void main(String[] args) {
        System.out.println("==================================================");
        System.out.println("DAY 9 (26 Nov): 0/1 Knapsack & Grid Dynamic Programming");
        System.out.println("PROBLEM: Coin Change (Fewest Coins - Unbounded DP) [Medium]");
        System.out.println("==================================================");

        int passed = 0, total = 0;
        total++;
        int[] coins1 = {1, 2, 5}; int amt1 = 11; int exp1 = 3;
        int got1 = coinChange(coins1, amt1);
        boolean p1 = (got1 == exp1);
        if (p1) passed++;
        System.out.println("[TEST 1] coins = " + Arrays.toString(coins1) + ", amount = " + amt1);
        System.out.println("         Expected: " + exp1 + " | Got: " + got1);
        System.out.println("         Verdict:  " + (p1 ? ">> PASS <<" : "!! FAIL !!"));
        total++;
        int[] coins2 = {2}; int amt2 = 3; int exp2 = -1;
        int got2 = coinChange(coins2, amt2);
        boolean p2 = (got2 == exp2);
        if (p2) passed++;
        System.out.println("[TEST 2] coins = " + Arrays.toString(coins2) + ", amount = " + amt2);
        System.out.println("         Expected: " + exp2 + " | Got: " + got2);
        System.out.println("         Verdict:  " + (p2 ? ">> PASS <<" : "!! FAIL !!"));
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
