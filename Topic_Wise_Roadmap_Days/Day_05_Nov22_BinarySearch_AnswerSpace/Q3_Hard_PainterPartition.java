/**
 * =============================================================================
 * INFOSYS SPECIALIST PROGRAMMER (SP) TOPIC-WISE ROADMAP
 * DAY 5 (22 Nov): Binary Search on Monotonic Answer Space
 * DIFFICULTY: Hard | PROBLEM: Painter's Partition Problem
 * =============================================================================
 *
 * [PROBLEM DESCRIPTION]
 * Find minimum time to paint all boards by `k` painters where painters paint contiguous sections.
 *
 * [CONSTRAINTS & HARDWARE TARGET]
 * 1 <= k <= boards.length <= 10^5, 1 <= boards[i] <= 10^6.
 *
 * [SAMPLE INPUT / OUTPUT]
 * boards = [10, 20, 30, 40], k = 2 | Expected: 60
 *
 * [INFOSYS EXAM WARNING / HARDWARE TRAP]
 * Binary search on maximum work allocated to any painter. Same as Book Allocation problem.
 *
 * =============================================================================
 * HOW TO TEST IN NOTEPAD:
 * 1. Implement your solution in the empty method below.
 * 2. Save the file.
 * 3. Open Command Prompt in this folder and compile & run:
 *       javac Q3_Hard_PainterPartition.java
 *       java -cp . Q3_Hard_PainterPartition
 * =============================================================================
 */

import java.util.*;
import java.io.*;


public class Q3_Hard_PainterPartition {

    // =========================================================================
    // TODO: WRITE YOUR OPTIMAL LOGIC IN THIS METHOD
    // Pure strict practice: Implement your solution from scratch.
    // =========================================================================
    public static long paint(int k, int[] boards) {
        // >>> WRITE YOUR SOLUTION HERE <<<

        return 0L;
    }

    // =========================================================================
    // BUILT-IN AUTOMATED TEST RUNNER (Calls your method and verifies verdict)
    // =========================================================================
    public static void main(String[] args) {
        System.out.println("==================================================");
        System.out.println("DAY 5 (22 Nov): Binary Search on Monotonic Answer Space");
        System.out.println("PROBLEM: Painter's Partition Problem [Hard]");
        System.out.println("==================================================");

        int passed = 0, total = 0;
        total++;
        int[] boards1 = {10, 20, 30, 40}; int k1 = 2; long exp1 = 60L;
        long got1 = paint(k1, boards1);
        boolean p1 = (got1 == exp1);
        if (p1) passed++;
        System.out.println("[TEST 1] boards = " + Arrays.toString(boards1) + ", painters = " + k1);
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
