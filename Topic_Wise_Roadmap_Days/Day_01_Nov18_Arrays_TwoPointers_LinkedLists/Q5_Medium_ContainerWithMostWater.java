/**
 * =============================================================================
 * INFOSYS SPECIALIST PROGRAMMER (SP) TOPIC-WISE ROADMAP
 * DAY 1 (18 Nov): Arrays, String Basics, Two Pointers & Linked Lists
 * DIFFICULTY: Medium | PROBLEM: Container With Most Water
 * =============================================================================
 *
 * [PROBLEM DESCRIPTION]
 * Find two lines that together with the x-axis form a container containing the most water.
 *
 * [CONSTRAINTS & HARDWARE TARGET]
 * 2 <= height.length <= 10^5, 0 <= height[i] <= 10^4.
 *
 * [SAMPLE INPUT / OUTPUT]
 * height = [1, 8, 6, 2, 5, 4, 8, 3, 7] | Expected: 49
 *
 * [INFOSYS EXAM WARNING / HARDWARE TRAP]
 * Always advance the pointer pointing to the shorter vertical bar.
 *
 * =============================================================================
 * HOW TO TEST IN NOTEPAD:
 * 1. Implement your solution in the empty method below.
 * 2. Save the file.
 * 3. Open Command Prompt in this folder and compile & run:
 *       javac Q5_Medium_ContainerWithMostWater.java
 *       java -cp . Q5_Medium_ContainerWithMostWater
 * =============================================================================
 */

import java.util.*;
import java.io.*;


public class Q5_Medium_ContainerWithMostWater {

    // =========================================================================
    // TODO: WRITE YOUR OPTIMAL LOGIC IN THIS METHOD
    // Pure strict practice: Implement your solution from scratch.
    // =========================================================================
    public static int maxArea(int[] height) {
        // >>> WRITE YOUR SOLUTION HERE <<<

        return 0;
    }

    // =========================================================================
    // BUILT-IN AUTOMATED TEST RUNNER (Calls your method and verifies verdict)
    // =========================================================================
    public static void main(String[] args) {
        System.out.println("==================================================");
        System.out.println("DAY 1 (18 Nov): Arrays, String Basics, Two Pointers & Linked Lists");
        System.out.println("PROBLEM: Container With Most Water [Medium]");
        System.out.println("==================================================");

        int passed = 0, total = 0;
        total++;
        int[] in1 = {1, 8, 6, 2, 5, 4, 8, 3, 7}; int exp1 = 49;
        int got1 = maxArea(in1);
        boolean p1 = (got1 == exp1);
        if (p1) passed++;
        System.out.println("[TEST 1] In: " + Arrays.toString(in1));
        System.out.println("         Expected: " + exp1 + " | Got: " + got1);
        System.out.println("         Verdict:  " + (p1 ? ">> PASS <<" : "!! FAIL !!"));
        total++;
        int[] in2 = {1, 1}; int exp2 = 1;
        int got2 = maxArea(in2);
        boolean p2 = (got2 == exp2);
        if (p2) passed++;
        System.out.println("[TEST 2] In: " + Arrays.toString(in2));
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
