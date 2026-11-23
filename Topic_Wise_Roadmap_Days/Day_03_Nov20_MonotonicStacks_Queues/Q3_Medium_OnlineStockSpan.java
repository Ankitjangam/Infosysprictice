/**
 * =============================================================================
 * INFOSYS SPECIALIST PROGRAMMER (SP) TOPIC-WISE ROADMAP
 * DAY 3 (20 Nov): Monotonic Stacks & Queues
 * DIFFICULTY: Medium | PROBLEM: Online Stock Span
 * =============================================================================
 *
 * [PROBLEM DESCRIPTION]
 * Calculate the span of a stock's price today (consecutive days with price <= today).
 *
 * [CONSTRAINTS & HARDWARE TARGET]
 * At most 10^4 calls to next(). 1 <= price <= 10^5.
 *
 * [SAMPLE INPUT / OUTPUT]
 * price series: [100, 80, 60, 70, 60, 75, 85] | Expected spans: [1, 1, 1, 2, 1, 4, 6]
 *
 * [INFOSYS EXAM WARNING / HARDWARE TRAP]
 * Stack stores pairs: [price, span]. Aggregate spans when popping smaller prices.
 *
 * =============================================================================
 * HOW TO TEST IN NOTEPAD:
 * 1. Implement your solution in the empty method below.
 * 2. Save the file.
 * 3. Open Command Prompt in this folder and compile & run:
 *       javac Q3_Medium_OnlineStockSpan.java
 *       java -cp . Q3_Medium_OnlineStockSpan
 * =============================================================================
 */

import java.util.*;
import java.io.*;


public class Q3_Medium_OnlineStockSpan {

    // =========================================================================
    // TODO: WRITE YOUR OPTIMAL LOGIC IN THIS METHOD
    // Pure strict practice: Implement your solution from scratch.
    // =========================================================================
    public static int next(int price) {
        // >>> WRITE YOUR SOLUTION HERE <<<

        return 0;
    }

    // =========================================================================
    // BUILT-IN AUTOMATED TEST RUNNER (Calls your method and verifies verdict)
    // =========================================================================
    public static void main(String[] args) {
        System.out.println("==================================================");
        System.out.println("DAY 3 (20 Nov): Monotonic Stacks & Queues");
        System.out.println("PROBLEM: Online Stock Span [Medium]");
        System.out.println("==================================================");

        int passed = 0, total = 0;
        total++;
        int[] prices = {100, 80, 60, 70, 60, 75, 85};
        int[] exp = {1, 1, 1, 2, 1, 4, 6};
        int[] got = new int[prices.length];
        for (int i = 0; i < prices.length; i++) got[i] = next(prices[i]);
        boolean p1 = Arrays.equals(got, exp);
        if (p1) passed++;
        System.out.println("[TEST 1] Prices: " + Arrays.toString(prices));
        System.out.println("         Expected Spans: " + Arrays.toString(exp));
        System.out.println("         Got Spans:      " + Arrays.toString(got));
        System.out.println("         Verdict:        " + (p1 ? ">> PASS <<" : "!! FAIL !!"));
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
