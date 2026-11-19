/**
 * =============================================================================
 * INFOSYS SPECIALIST PROGRAMMER (SP) TOPIC-WISE ROADMAP
 * DAY 4 (21 Nov): Prefix Sum & Difference Arrays
 * DIFFICULTY: Hard | PROBLEM: Car Pooling / Difference Array
 * =============================================================================
 *
 * [PROBLEM DESCRIPTION]
 * Determine if you can pick up and drop off all passengers without exceeding capacity.
 *
 * [CONSTRAINTS & HARDWARE TARGET]
 * trips.length <= 10^5, capacity <= 10^5, location <= 1000.
 *
 * [SAMPLE INPUT / OUTPUT]
 * trips = [[2,1,5],[3,3,7]], capacity = 4 | Expected: false
 *
 * [INFOSYS EXAM WARNING / HARDWARE TRAP]
 * Difference array: diff[from] += passengers, diff[to] -= passengers. Check running prefix.
 *
 * =============================================================================
 * HOW TO TEST IN NOTEPAD:
 * 1. Implement your solution in the empty method below.
 * 2. Save the file.
 * 3. Open Command Prompt in this folder and compile & run:
 *       javac Q3_Hard_CarPoolingDifferenceArray.java
 *       java Q3_Hard_CarPoolingDifferenceArray
 * =============================================================================
 */

import java.util.*;
import java.io.*;


public class Q3_Hard_CarPoolingDifferenceArray {

    // =========================================================================
    // TODO: WRITE YOUR OPTIMAL LOGIC IN THIS METHOD
    // Pure strict practice: Implement your solution from scratch.
    // =========================================================================
    public static boolean carPooling(int[][] trips, int capacity) {
        // >>> WRITE YOUR SOLUTION HERE <<<

        return false;
    }

    // =========================================================================
    // BUILT-IN TEST RUNNER (Executes automatically when you run this file)
    // =========================================================================
    public static void main(String[] args) {
        System.out.println("==================================================");
        System.out.println("DAY 4 (21 Nov): Prefix Sum & Difference Arrays");
        System.out.println("PROBLEM: Car Pooling / Difference Array [Hard]");
        System.out.println("==================================================");

        System.out.println("\n[SAMPLE DETAILS]");
        System.out.println("  trips = [[2,1,5],[3,3,7]], capacity = 4 | Expected: false");

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
