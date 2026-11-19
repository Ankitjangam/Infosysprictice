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
 *       java Q2_Medium_CoinChangeUnbounded
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
    // BUILT-IN TEST RUNNER (Executes automatically when you run this file)
    // =========================================================================
    public static void main(String[] args) {
        System.out.println("==================================================");
        System.out.println("DAY 9 (26 Nov): 0/1 Knapsack & Grid Dynamic Programming");
        System.out.println("PROBLEM: Coin Change (Fewest Coins - Unbounded DP) [Medium]");
        System.out.println("==================================================");

        System.out.println("\n[SAMPLE DETAILS]");
        System.out.println("  coins = [1, 2, 5], amount = 11 | Expected: 3");

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
