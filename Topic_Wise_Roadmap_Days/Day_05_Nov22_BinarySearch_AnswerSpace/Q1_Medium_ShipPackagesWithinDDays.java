/**
 * =============================================================================
 * INFOSYS SPECIALIST PROGRAMMER (SP) TOPIC-WISE ROADMAP
 * DAY 5 (22 Nov): Binary Search on Monotonic Answer Space
 * DIFFICULTY: Medium | PROBLEM: Ship Packages Within D Days
 * =============================================================================
 *
 * [PROBLEM DESCRIPTION]
 * Find the least ship capacity that allows all packages to be shipped within `days` days.
 *
 * [CONSTRAINTS & HARDWARE TARGET]
 * 1 <= days <= weights.length <= 5 * 10^4, 1 <= weights[i] <= 500.
 *
 * [SAMPLE INPUT / OUTPUT]
 * weights = [1,2,3,4,5,6,7,8,9,10], days = 5 | Expected: 15
 *
 * [INFOSYS EXAM WARNING / HARDWARE TRAP]
 * Binary search on capacity between max(weights) and sum(weights). Check feasibility in O(N).
 *
 * =============================================================================
 * HOW TO TEST IN NOTEPAD:
 * 1. Implement your solution in the empty method below.
 * 2. Save the file.
 * 3. Open Command Prompt in this folder and compile & run:
 *       javac Q1_Medium_ShipPackagesWithinDDays.java
 *       java -cp . Q1_Medium_ShipPackagesWithinDDays
 * =============================================================================
 */

import java.util.*;
import java.io.*;


public class Q1_Medium_ShipPackagesWithinDDays {

    // =========================================================================
    // TODO: WRITE YOUR OPTIMAL LOGIC IN THIS METHOD
    // Pure strict practice: Implement your solution from scratch.
    // =========================================================================
    public static int shipWithinDays(int[] weights, int days) {
        // >>> WRITE YOUR SOLUTION HERE <<<

        return 0;
    }

    // =========================================================================
    // BUILT-IN AUTOMATED TEST RUNNER (Calls your method and verifies verdict)
    // =========================================================================
    public static void main(String[] args) {
        System.out.println("==================================================");
        System.out.println("DAY 5 (22 Nov): Binary Search on Monotonic Answer Space");
        System.out.println("PROBLEM: Ship Packages Within D Days [Medium]");
        System.out.println("==================================================");

        int passed = 0, total = 0;
        total++;
        int[] w1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; int d1 = 5; int exp1 = 15;
        int got1 = shipWithinDays(w1, d1);
        boolean p1 = (got1 == exp1);
        if (p1) passed++;
        System.out.println("[TEST 1] weights = " + Arrays.toString(w1) + ", days = " + d1);
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
