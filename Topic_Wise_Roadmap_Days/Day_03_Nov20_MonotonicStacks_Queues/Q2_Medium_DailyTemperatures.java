/**
 * =============================================================================
 * INFOSYS SPECIALIST PROGRAMMER (SP) TOPIC-WISE ROADMAP
 * DAY 3 (20 Nov): Monotonic Stacks & Queues
 * DIFFICULTY: Medium | PROBLEM: Daily Temperatures
 * =============================================================================
 *
 * [PROBLEM DESCRIPTION]
 * Return an array `answer` where `answer[i]` is the days to wait for a warmer temperature.
 *
 * [CONSTRAINTS & HARDWARE TARGET]
 * 1 <= temperatures.length <= 10^5, 30 <= temperatures[i] <= 100.
 *
 * [SAMPLE INPUT / OUTPUT]
 * temperatures = [73, 74, 75, 71, 69, 72, 76, 73] | Expected: [1, 1, 4, 2, 1, 1, 0, 0]
 *
 * [INFOSYS EXAM WARNING / HARDWARE TRAP]
 * Maintain monotonic decreasing stack of indices. Pop when current temperature is higher.
 *
 * =============================================================================
 * HOW TO TEST IN NOTEPAD:
 * 1. Implement your solution in the empty method below.
 * 2. Save the file.
 * 3. Open Command Prompt in this folder and compile & run:
 *       javac Q2_Medium_DailyTemperatures.java
 *       java -cp . Q2_Medium_DailyTemperatures
 * =============================================================================
 */

import java.util.*;
import java.io.*;


public class Q2_Medium_DailyTemperatures {

    // =========================================================================
    // TODO: WRITE YOUR OPTIMAL LOGIC IN THIS METHOD
    // Pure strict practice: Implement your solution from scratch.
    // =========================================================================
    public static int[] dailyTemperatures(int[] temperatures) {
        // >>> WRITE YOUR SOLUTION HERE <<<

        return new int[0];
    }

    // =========================================================================
    // BUILT-IN AUTOMATED TEST RUNNER (Calls your method and verifies verdict)
    // =========================================================================
    public static void main(String[] args) {
        System.out.println("==================================================");
        System.out.println("DAY 3 (20 Nov): Monotonic Stacks & Queues");
        System.out.println("PROBLEM: Daily Temperatures [Medium]");
        System.out.println("==================================================");

        int passed = 0, total = 0;
        total++;
        int[] in1 = {73, 74, 75, 71, 69, 72, 76, 73}; int[] exp1 = {1, 1, 4, 2, 1, 1, 0, 0};
        int[] got1 = dailyTemperatures(in1);
        boolean p1 = Arrays.equals(got1, exp1);
        if (p1) passed++;
        System.out.println("[TEST 1] In: " + Arrays.toString(in1));
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
