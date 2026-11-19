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
 *       java Q1_Medium_ShipPackagesWithinDDays
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
    // BUILT-IN TEST RUNNER (Executes automatically when you run this file)
    // =========================================================================
    public static void main(String[] args) {
        System.out.println("==================================================");
        System.out.println("DAY 5 (22 Nov): Binary Search on Monotonic Answer Space");
        System.out.println("PROBLEM: Ship Packages Within D Days [Medium]");
        System.out.println("==================================================");

        System.out.println("\n[SAMPLE DETAILS]");
        System.out.println("  weights = [1,2,3,4,5,6,7,8,9,10], days = 5 | Expected: 15");

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
