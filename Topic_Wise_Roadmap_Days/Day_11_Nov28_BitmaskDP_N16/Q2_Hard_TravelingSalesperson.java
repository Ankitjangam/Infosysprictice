/**
 * =============================================================================
 * INFOSYS SPECIALIST PROGRAMMER (SP) TOPIC-WISE ROADMAP
 * DAY 11 (28 Nov): Bitmask Dynamic Programming (N <= 16)
 * DIFFICULTY: Hard | PROBLEM: Traveling Salesperson Problem (TSP Bitmask DP)
 * =============================================================================
 *
 * [PROBLEM DESCRIPTION]
 * Find minimum weight Hamiltonian cycle visiting all N cities.
 *
 * [CONSTRAINTS & HARDWARE TARGET]
 * N <= 16, non-negative edge weights.
 *
 * [SAMPLE INPUT / OUTPUT]
 * dist = [[0, 10, 15, 20], [10, 0, 35, 25], [15, 35, 0, 30], [20, 25, 30, 0]] | Expected: 80
 *
 * [INFOSYS EXAM WARNING / HARDWARE TRAP]
 * dp(u, mask) = min cost to visit remaining nodes in mask starting from u. Complexity: O(N^2 * 2^N).
 *
 * =============================================================================
 * HOW TO TEST IN NOTEPAD:
 * 1. Implement your solution in the empty method below.
 * 2. Save the file.
 * 3. Open Command Prompt in this folder and compile & run:
 *       javac Q2_Hard_TravelingSalesperson.java
 *       java -cp . Q2_Hard_TravelingSalesperson
 * =============================================================================
 */

import java.util.*;
import java.io.*;


public class Q2_Hard_TravelingSalesperson {

    // =========================================================================
    // TODO: WRITE YOUR OPTIMAL LOGIC IN THIS METHOD
    // Pure strict practice: Implement your solution from scratch.
    // =========================================================================
    public static int tsp(int[][] dist, int n) {
        // >>> WRITE YOUR SOLUTION HERE <<<

        return 0;
    }

    // =========================================================================
    // BUILT-IN AUTOMATED TEST RUNNER (Calls your method and verifies verdict)
    // =========================================================================
    public static void main(String[] args) {
        System.out.println("==================================================");
        System.out.println("DAY 11 (28 Nov): Bitmask Dynamic Programming (N <= 16)");
        System.out.println("PROBLEM: Traveling Salesperson Problem (TSP Bitmask DP) [Hard]");
        System.out.println("==================================================");

        int passed = 0, total = 0;
        total++;
        int[][] dist1 = {{0, 10, 15, 20}, {10, 0, 35, 25}, {15, 35, 0, 30}, {20, 25, 30, 0}}; int exp1 = 80;
        int got1 = tsp(dist1, 4);
        boolean p1 = (got1 == exp1);
        if (p1) passed++;
        System.out.println("[TEST 1] dist = 4x4 matrix");
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
