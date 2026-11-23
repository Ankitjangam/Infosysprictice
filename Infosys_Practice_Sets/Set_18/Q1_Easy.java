/**
 * =============================================================================
 * INFOSYS SPECIALIST PROGRAMMER (SP) IN-PERSON CODING ASSESSMENT
 * SET 18 | QUESTION 1 &bull; Easy (12 Cases)
 * Q1 (Easy - 12 Cases): Delivery Drone Single Battery Swap (Two Pointers)
 * =============================================================================
 *
 * [PROBLEM DESCRIPTION]
 * A drone flies across checkpoints. Determine in $O(N)$ if swapping battery at one optimal checkpoint allows completion.
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
 *       javac Q1_Easy.java
 *       java -cp . Q1_Easy
 * =============================================================================
 */

import java.util.*;
import java.io.*;


public class Q1_Easy {

    // =========================================================================
    // TODO: WRITE YOUR OPTIMAL LOGIC IN THIS METHOD
    // Pure strict practice: Implement your solution from scratch.
    // =========================================================================
    public static boolean solveDroneSwap(int[] drain, int battery) {
        // >>> WRITE YOUR SOLUTION HERE <<<
        return false;
    }

    // =========================================================================
    // BUILT-IN AUTOMATED TEST RUNNER (Calls your method and verifies verdict)
    // =========================================================================
    public static void main(String[] args) {
        System.out.println("==================================================");
        System.out.println("INFOSYS EXAM PRACTICE: SET 18 - QUESTION 1");
        System.out.println("Q1 (Easy - 12 Cases): Delivery Drone Single Battery Swap (Two Pointers)");
        System.out.println("==================================================");
        int passed = 0, total = 0; total++;
        int[] drain = {10, 20, 15}; int battery = 25; boolean exp1 = true;
        boolean got1 = solveDroneSwap(drain, battery);
        boolean p1 = (got1 == exp1); if (p1) passed++;
        System.out.println("[TEST 1] drain = " + Arrays.toString(drain) + ", battery = " + battery);
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
