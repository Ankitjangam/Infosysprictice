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
 *       java -cp . Q3_Hard_CarPoolingDifferenceArray
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
    // BUILT-IN AUTOMATED TEST RUNNER (Calls your method and verifies verdict)
    // =========================================================================
    public static void main(String[] args) {
        System.out.println("==================================================");
        System.out.println("DAY 4 (21 Nov): Prefix Sum & Difference Arrays");
        System.out.println("PROBLEM: Car Pooling / Difference Array [Hard]");
        System.out.println("==================================================");

        int passed = 0, total = 0;
        total++;
        int[][] trips1 = {{2, 1, 5}, {3, 3, 7}}; int cap1 = 4; boolean exp1 = false;
        boolean got1 = carPooling(trips1, cap1);
        boolean p1 = (got1 == exp1);
        if (p1) passed++;
        System.out.println("[TEST 1] trips = [[2,1,5],[3,3,7]], cap = " + cap1);
        System.out.println("         Expected: " + exp1 + " | Got: " + got1);
        System.out.println("         Verdict:  " + (p1 ? ">> PASS <<" : "!! FAIL !!"));
        total++;
        int[][] trips2 = {{2, 1, 5}, {3, 3, 7}}; int cap2 = 5; boolean exp2 = true;
        boolean got2 = carPooling(trips2, cap2);
        boolean p2 = (got2 == exp2);
        if (p2) passed++;
        System.out.println("[TEST 2] trips = [[2,1,5],[3,3,7]], cap = " + cap2);
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
