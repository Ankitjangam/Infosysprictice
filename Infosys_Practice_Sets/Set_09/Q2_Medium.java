/**
 * =============================================================================
 * INFOSYS SPECIALIST PROGRAMMER (SP) IN-PERSON CODING ASSESSMENT
 * SET 09 | QUESTION 2 &bull; Easy-Medium (12 Cases)
 * Q2 (Easy-Med - 12 Cases): Airline Fleet Booking Cumulative Loads (Difference Array)
 * =============================================================================
 *
 * [PROBLEM DESCRIPTION]
 * Given range updates $[first, last, seats]$, compute total seats on each of $N$ flights in $O(N + Q)$ time.
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
 *       javac Q2_Medium.java
 *       java -cp . Q2_Medium
 * =============================================================================
 */

import java.util.*;
import java.io.*;


public class Q2_Medium {

    // =========================================================================
    // TODO: WRITE YOUR OPTIMAL LOGIC IN THIS METHOD
    // Pure strict practice: Implement your solution from scratch.
    // =========================================================================
    public static int[] solveQ2(int[][] bookings, int n) {
        // >>> WRITE YOUR SOLUTION HERE <<<
        return new int[0];
    }

    // =========================================================================
    // BUILT-IN AUTOMATED TEST RUNNER (Calls your method and verifies verdict)
    // =========================================================================
    public static void main(String[] args) {
        System.out.println("==================================================");
        System.out.println("INFOSYS EXAM PRACTICE: SET 09 - QUESTION 2");
        System.out.println("Q2 (Easy-Med - 12 Cases): Airline Fleet Booking Cumulative Loads (Difference Array)");
        System.out.println("==================================================");
        int passed = 0, total = 0; total++;
        int[][] b = {{1, 2, 10}, {2, 3, 20}, {2, 5, 25}}; int n = 5;
        int[] exp1 = {10, 55, 45, 25, 25};
        int[] got1 = solveQ2(b, n);
        boolean p1 = Arrays.equals(got1, exp1); if (p1) passed++;
        System.out.println("[TEST 1] bookings = [[1,2,10],[2,3,20],[2,5,25]], n = 5");
        System.out.println("         Expected: " + Arrays.toString(exp1) + " | Got: " + Arrays.toString(got1));
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
