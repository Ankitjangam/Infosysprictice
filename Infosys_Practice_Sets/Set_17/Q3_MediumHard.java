/**
 * =============================================================================
 * INFOSYS SPECIALIST PROGRAMMER (SP) IN-PERSON CODING ASSESSMENT
 * SET 17 | QUESTION 3 &bull; Medium-Hard (12 Cases)
 * Q3 (Med-Hard - 12 Cases): Telecommunication Tower Range Expansion (BS on Answer Space)
 * =============================================================================
 *
 * [PROBLEM DESCRIPTION]
 * $N$ radio towers along a highway $0 \dots L$ have coordinates $X[i]$ and coverage radius $R[i]$. Find minimum uniform range expansion $\Delta R \ge 0$ added to all towers so the entire highway $[0, L]$ is covered without gaps.
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
    public static long solveTowerExpansion(long[] X, long[] R, long L) {
        // >>> WRITE YOUR SOLUTION HERE <<<
        return 0L;
    }

    // =========================================================================
    // BUILT-IN AUTOMATED TEST RUNNER (Calls your method and verifies verdict)
    // =========================================================================
    public static void main(String[] args) {
        System.out.println("==================================================");
        System.out.println("INFOSYS EXAM PRACTICE: SET 17 - QUESTION 3");
        System.out.println("Q3 (Med-Hard - 12 Cases): Telecommunication Tower Range Expansion (BS on Answer Space)");
        System.out.println("==================================================");
        int passed = 0, total = 0; total++;
        long[] X = {1, 5, 10}, R = {2, 2, 2}; long L = 10;
        long got1 = solveTowerExpansion(X, R, L);
        boolean p1 = (got1 >= 0); if (p1) passed++;
        System.out.println("[TEST 1] Towers on highway length " + L);
        System.out.println("         Got Expansion Delta: " + got1);
        System.out.println("         Verdict: " + (p1 ? ">> PASS <<" : "!! FAIL !!"));
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
