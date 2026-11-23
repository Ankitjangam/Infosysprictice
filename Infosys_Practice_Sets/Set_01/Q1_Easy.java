/**
 * =============================================================================
 * INFOSYS SPECIALIST PROGRAMMER (SP) IN-PERSON CODING ASSESSMENT
 * SET 01 | QUESTION 1 &bull; Easy (12 Cases)
 * Q1 (Easy - 12 Cases): Power Grid Load Balancer (Two Sum II Monotonic Space)
 * =============================================================================
 *
 * [PROBLEM DESCRIPTION]
 * An electrical grid monitors $N$ power substations arranged along a transmission line, with capacities sorted in non-decreasing order: capacities[i]. The control center needs to activate exactly two distinct substations whose total combined power output matches target load target. Return their 1-based indices.
 *
 * [CONSTRAINTS]
 * $2 \le N \le 10^5$, $-10^9 \le capacities[i] \le 10^9$, $-2	imes 10^9 \le target \le 2	imes 10^9$. Output exactly one valid pair.
 *
 * [SAMPLE INPUT / OUTPUT]
 * capacities = [2, 7, 11, 15], target = 9 | Sample Output: [1, 2]
 *
 * [INFOSYS EXAM WARNING / HARDWARE TRAP]
 * Infosys Trap: Sum of two values up to $10^9$ exceeds signed 32-bit `int` boundary. Cast to `long` before addition.
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
public static int[] solveQ1(int[] capacities, int target) {
        // >>> WRITE YOUR SOLUTION HERE <<<
        return new int[0];
    }

    // =========================================================================
    // BUILT-IN AUTOMATED TEST RUNNER (Calls your method and verifies verdict)
    // =========================================================================
    public static void main(String[] args) {
        System.out.println("==================================================");
        System.out.println("INFOSYS EXAM PRACTICE: SET 01 - QUESTION 1");
        System.out.println("Q1 (Easy - 12 Cases): Power Grid Load Balancer (Two Sum II Monotonic Space)");
        System.out.println("==================================================");
        int passed = 0, total = 0;
        total++;
        int[] in1 = {2, 7, 11, 15}; int t1 = 9; int[] exp1 = {1, 2};
        int[] got1 = solveQ1(in1, t1);
        boolean p1 = Arrays.equals(got1, exp1); if (p1) passed++;
        System.out.println("[TEST 1] capacities = " + Arrays.toString(in1) + ", target = " + t1);
        System.out.println("         Expected: " + Arrays.toString(exp1) + " | Got: " + Arrays.toString(got1));
        System.out.println("         Verdict:  " + (p1 ? ">> PASS <<" : "!! FAIL !!"));
        total++;
        int[] in2 = {2, 3, 4}; int t2 = 6; int[] exp2 = {1, 3};
        int[] got2 = solveQ1(in2, t2);
        boolean p2 = Arrays.equals(got2, exp2); if (p2) passed++;
        System.out.println("[TEST 2] capacities = " + Arrays.toString(in2) + ", target = " + t2);
        System.out.println("         Expected: " + Arrays.toString(exp2) + " | Got: " + Arrays.toString(got2));
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
