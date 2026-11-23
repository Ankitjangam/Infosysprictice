/**
 * =============================================================================
 * INFOSYS SPECIALIST PROGRAMMER (SP) IN-PERSON CODING ASSESSMENT
 * SET 01 | QUESTION 2 &bull; Easy-Medium (12 Cases)
 * Q2 (Easy-Med - 12 Cases): Satellite Clean Transmission (Longest Substring Without Repeating)
 * =============================================================================
 *
 * [PROBLEM DESCRIPTION]
 * A deep-space antenna receives character stream s. Determine the maximum length of a continuous telemetric packet containing zero repeated characters.
 *
 * [CONSTRAINTS]
 * $0 \le |s| \le 10^5$. Characters are printable ASCII (0 to 127).
 *
 * [SAMPLE INPUT / OUTPUT]
 * s = "abcabcbb" | Sample Output: 3 (packet "abc")
 *
 * [INFOSYS EXAM WARNING / HARDWARE TRAP]
 * Infosys Trap: Using `int[26]` fails on numeric digits and special symbols; allocate `int[128]`.
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
public static int solveQ2(String s) {
        // >>> WRITE YOUR SOLUTION HERE <<<
        return 0;
    }

    // =========================================================================
    // BUILT-IN AUTOMATED TEST RUNNER (Calls your method and verifies verdict)
    // =========================================================================
    public static void main(String[] args) {
        System.out.println("==================================================");
        System.out.println("INFOSYS EXAM PRACTICE: SET 01 - QUESTION 2");
        System.out.println("Q2 (Easy-Med - 12 Cases): Satellite Clean Transmission (Longest Substring Without Repeating)");
        System.out.println("==================================================");
        int passed = 0, total = 0;
        total++;
        String s1 = "abcabcbb"; int exp1 = 3;
        int got1 = solveQ2(s1);
        boolean p1 = (got1 == exp1); if (p1) passed++;
        System.out.println("[TEST 1] s = \"" + s1 + "\"");
        System.out.println("         Expected: " + exp1 + " | Got: " + got1);
        System.out.println("         Verdict:  " + (p1 ? ">> PASS <<" : "!! FAIL !!"));
        total++;
        String s2 = "bbbbb"; int exp2 = 1;
        int got2 = solveQ2(s2);
        boolean p2 = (got2 == exp2); if (p2) passed++;
        System.out.println("[TEST 2] s = \"" + s2 + "\"");
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
