/**
 * =============================================================================
 * INFOSYS SPECIALIST PROGRAMMER (SP) IN-PERSON CODING ASSESSMENT
 * SET 02 | QUESTION 2 &bull; Easy-Medium (12 Cases)
 * Q2 (Easy-Med - 12 Cases): Thermal Anomaly Alert Monitor (Daily Temperatures / Monotonic Stack)
 * =============================================================================
 *
 * [PROBLEM DESCRIPTION]
 * Daily temperatures recorded in array T. Return an array ans where ans[i] is the days to wait until a warmer day occurs, or 0 if none.
 *
 * [CONSTRAINTS]
 * $1 \le N \le 10^5$, $30 \le T[i] \le 100$.
 *
 * [SAMPLE INPUT / OUTPUT]
 * T = [73,74,75,71,69,72,76,73] | Sample Output: [1,1,4,2,1,1,0,0]
 *
 * [INFOSYS EXAM WARNING / HARDWARE TRAP]
 * Infosys Trap: Using `java.util.Stack` creates heap objects and synchronization overhead. Use `int[] stack` for 0ms execution.
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
public static int[] solveQ2(int[] T) {
        // >>> WRITE YOUR SOLUTION HERE <<<
        return new int[0];
    }

    // =========================================================================
    // BUILT-IN AUTOMATED TEST RUNNER (Calls your method and verifies verdict)
    // =========================================================================
    public static void main(String[] args) {
        System.out.println("==================================================");
        System.out.println("INFOSYS EXAM PRACTICE: SET 02 - QUESTION 2");
        System.out.println("Q2 (Easy-Med - 12 Cases): Thermal Anomaly Alert Monitor (Daily Temperatures / Monotonic Stack)");
        System.out.println("==================================================");
        int passed = 0, total = 0;
        total++;
        int[] in1 = {73, 74, 75, 71, 69, 72, 76, 73}; int[] exp1 = {1, 1, 4, 2, 1, 1, 0, 0};
        int[] got1 = solveQ2(in1);
        boolean p1 = Arrays.equals(got1, exp1); if (p1) passed++;
        System.out.println("[TEST 1] T = " + Arrays.toString(in1));
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
