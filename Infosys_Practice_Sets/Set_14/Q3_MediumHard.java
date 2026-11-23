/**
 * =============================================================================
 * INFOSYS SPECIALIST PROGRAMMER (SP) IN-PERSON CODING ASSESSMENT
 * SET 14 | QUESTION 3 &bull; Medium-Hard (12 Cases)
 * Q3 (Med-Hard - 12 Cases): Top K Frequent Telemetry Signals (Min-Heap / Bucket Sort)
 * =============================================================================
 *
 * [PROBLEM DESCRIPTION]
 * Return the $K$ most frequent elements in array nums in $O(N \log K)$ time.
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
    public static int[] solveQ3(int[] nums, int k) {
        // >>> WRITE YOUR SOLUTION HERE <<<
        return new int[0];
    }

    // =========================================================================
    // BUILT-IN AUTOMATED TEST RUNNER (Calls your method and verifies verdict)
    // =========================================================================
    public static void main(String[] args) {
        System.out.println("==================================================");
        System.out.println("INFOSYS EXAM PRACTICE: SET 14 - QUESTION 3");
        System.out.println("Q3 (Med-Hard - 12 Cases): Top K Frequent Telemetry Signals (Min-Heap / Bucket Sort)");
        System.out.println("==================================================");
        int passed = 0, total = 0; total++;
        int[] in1 = {1, 1, 1, 2, 2, 3}; int k = 2;
        int[] got1 = solveQ3(in1, k);
        Arrays.sort(got1);
        int[] exp1 = {1, 2};
        boolean p1 = Arrays.equals(got1, exp1); if (p1) passed++;
        System.out.println("[TEST 1] nums = " + Arrays.toString(in1) + ", k = " + k);
        System.out.println("         Expected: [1, 2] | Got: " + Arrays.toString(got1));
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
