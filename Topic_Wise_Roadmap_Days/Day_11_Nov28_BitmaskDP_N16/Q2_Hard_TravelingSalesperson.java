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
 *       java Q2_Hard_TravelingSalesperson
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
    // BUILT-IN TEST RUNNER (Executes automatically when you run this file)
    // =========================================================================
    public static void main(String[] args) {
        System.out.println("==================================================");
        System.out.println("DAY 11 (28 Nov): Bitmask Dynamic Programming (N <= 16)");
        System.out.println("PROBLEM: Traveling Salesperson Problem (TSP Bitmask DP) [Hard]");
        System.out.println("==================================================");

        System.out.println("\n[SAMPLE DETAILS]");
        System.out.println("  dist = [[0, 10, 15, 20], [10, 0, 35, 25], [15, 35, 0, 30], [20, 25, 30, 0]] | Expected: 80");

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
