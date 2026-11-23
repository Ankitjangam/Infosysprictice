/**
 * =============================================================================
 * INFOSYS SPECIALIST PROGRAMMER (SP) IN-PERSON CODING ASSESSMENT
 * SET 02 | QUESTION 3 &bull; Medium-Hard (12 Cases)
 * Q3 (Med-Hard - 12 Cases): Corporate Hall Allocation (Meeting Rooms II / Min-Heap)
 * =============================================================================
 *
 * [PROBLEM DESCRIPTION]
 * Given meeting intervals [start, end], determine minimum conference halls required to host all meetings without overlap.
 *
 * [CONSTRAINTS]
 * $1 \le N \le 10^5$, $0 \le start < end \le 10^9$.
 *
 * [SAMPLE INPUT / OUTPUT]
 * intervals = [[0,30],[5,10],[15,20]] | Sample Output: 2
 *
 * [INFOSYS EXAM WARNING / HARDWARE TRAP]
 * Infosys Trap: Sorting with `(a, b) -> a[0] - b[0]` underflows if start times are large. Always use `Integer.compare()`.
 *
 * =============================================================================
 * HOW TO TEST IN NOTEPAD:
 * 1. Implement your solution in the empty method below.
 * 2. Save the file.
 * 3. Open Command Prompt in this folder and compile & run:
 *       javac Q3_MediumHard.java
 *       java -cp . Q3_MediumHard
 * =============================================================================
 */

import java.util.*;
import java.io.*;


public class Q3_MediumHard {

    // =========================================================================
    // TODO: WRITE YOUR OPTIMAL LOGIC IN THIS METHOD
    // Pure strict practice: Implement your solution from scratch.
    // =========================================================================
public static int solveQ3(int[][] intervals) {
        // >>> WRITE YOUR SOLUTION HERE <<<
        return 0;
    }

    // =========================================================================
    // BUILT-IN AUTOMATED TEST RUNNER (Calls your method and verifies verdict)
    // =========================================================================
    public static void main(String[] args) {
        System.out.println("==================================================");
        System.out.println("INFOSYS EXAM PRACTICE: SET 02 - QUESTION 3");
        System.out.println("Q3 (Med-Hard - 12 Cases): Corporate Hall Allocation (Meeting Rooms II / Min-Heap)");
        System.out.println("==================================================");
        int passed = 0, total = 0;
        total++;
        int[][] in1 = {{0, 30}, {5, 10}, {15, 20}}; int exp1 = 2;
        int got1 = solveQ3(in1);
        boolean p1 = (got1 == exp1); if (p1) passed++;
        System.out.println("[TEST 1] intervals = [[0,30],[5,10],[15,20]]");
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
