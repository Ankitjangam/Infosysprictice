/**
 * =============================================================================
 * INFOSYS SPECIALIST PROGRAMMER (SP) TOPIC-WISE ROADMAP
 * DAY 5 (22 Nov): Binary Search on Monotonic Answer Space
 * DIFFICULTY: Hard | PROBLEM: Aggressive Cows (Maximize Minimum Distance)
 * =============================================================================
 *
 * [PROBLEM DESCRIPTION]
 * Assign `C` cows to stalls such that minimum distance between any two cows is maximized.
 *
 * [CONSTRAINTS & HARDWARE TARGET]
 * 2 <= N <= 10^5, 2 <= C <= N, stall positions up to 10^9.
 *
 * [SAMPLE INPUT / OUTPUT]
 * stalls = [1, 2, 8, 4, 9], C = 3 | Expected: 3
 *
 * [INFOSYS EXAM WARNING / HARDWARE TRAP]
 * Sort stalls. Binary search on distance `d`. Greedily place cow if stall - lastStall >= d.
 *
 * =============================================================================
 * HOW TO TEST IN NOTEPAD:
 * 1. Implement your solution in the empty method below.
 * 2. Save the file.
 * 3. Open Command Prompt in this folder and compile & run:
 *       javac Q2_Hard_AggressiveCows.java
 *       java -cp . Q2_Hard_AggressiveCows
 * =============================================================================
 */

import java.util.*;
import java.io.*;


public class Q2_Hard_AggressiveCows {

    // =========================================================================
    // TODO: WRITE YOUR OPTIMAL LOGIC IN THIS METHOD
    // Pure strict practice: Implement your solution from scratch.
    // =========================================================================
    public static int aggressiveCows(int[] stalls, int k) {
        // >>> WRITE YOUR SOLUTION HERE <<<

        return 0;
    }

    // =========================================================================
    // BUILT-IN AUTOMATED TEST RUNNER (Calls your method and verifies verdict)
    // =========================================================================
    public static void main(String[] args) {
        System.out.println("==================================================");
        System.out.println("DAY 5 (22 Nov): Binary Search on Monotonic Answer Space");
        System.out.println("PROBLEM: Aggressive Cows (Maximize Minimum Distance) [Hard]");
        System.out.println("==================================================");

        int passed = 0, total = 0;
        total++;
        int[] stalls1 = {1, 2, 8, 4, 9}; int k1 = 3; int exp1 = 3;
        int got1 = aggressiveCows(stalls1, k1);
        boolean p1 = (got1 == exp1);
        if (p1) passed++;
        System.out.println("[TEST 1] stalls = " + Arrays.toString(stalls1) + ", cows = " + k1);
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
