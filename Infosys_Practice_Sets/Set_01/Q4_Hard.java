/**
 * =============================================================================
 * INFOSYS SPECIALIST PROGRAMMER (SP) IN-PERSON CODING ASSESSMENT
 * SET 01 | QUESTION 4 &bull; Hard (12 Cases)
 * Q4 (Hard - 12 Cases): Equal Load Partitioning (0/1 Knapsack Space-Optimized)
 * =============================================================================
 *
 * [PROBLEM DESCRIPTION]
 * An enterprise server receives $N$ computing workloads nums[i]. Determine if workloads can be partitioned into two server clusters such that both clusters handle the exact same total sum.
 *
 * [CONSTRAINTS]
 * $1 \le N \le 200$, $1 \le nums[i] \le 100$, $\sum nums[i] \le 20,000$.
 *
 * [SAMPLE INPUT / OUTPUT]
 * nums = [1, 5, 11, 5] | Sample Output: true (subsets [11] and [1, 5, 5])
 *
 * [INFOSYS EXAM WARNING / HARDWARE TRAP]
 * Subtask Harvest Blueprint: If $N \le 18$, an $O(2^N)$ recursion will pass test cases 1-4. The inner DP loop must run backwards to prevent item reuse!
 *
 * =============================================================================
 * HOW TO TEST IN NOTEPAD:
 * 1. Implement your solution in the empty method below.
 * 2. Save the file.
 * 3. Open Command Prompt in this folder and compile & run:
 *       javac Q4_Hard.java
 *       java -cp . Q4_Hard
 * =============================================================================
 */

import java.util.*;
import java.io.*;


public class Q4_Hard {

    // =========================================================================
    // TODO: WRITE YOUR OPTIMAL LOGIC IN THIS METHOD
    // Pure strict practice: Implement your solution from scratch.
    // =========================================================================
public static boolean solveQ4(int[] nums) {
        // >>> WRITE YOUR SOLUTION HERE <<<
        return false;
    }

    // =========================================================================
    // BUILT-IN AUTOMATED TEST RUNNER (Calls your method and verifies verdict)
    // =========================================================================
    public static void main(String[] args) {
        System.out.println("==================================================");
        System.out.println("INFOSYS EXAM PRACTICE: SET 01 - QUESTION 4");
        System.out.println("Q4 (Hard - 12 Cases): Equal Load Partitioning (0/1 Knapsack Space-Optimized)");
        System.out.println("==================================================");
        int passed = 0, total = 0;
        total++;
        int[] in1 = {1, 5, 11, 5}; boolean exp1 = true;
        boolean got1 = solveQ4(in1);
        boolean p1 = (got1 == exp1); if (p1) passed++;
        System.out.println("[TEST 1] nums = " + Arrays.toString(in1));
        System.out.println("         Expected: " + exp1 + " | Got: " + got1);
        System.out.println("         Verdict:  " + (p1 ? ">> PASS <<" : "!! FAIL !!"));
        total++;
        int[] in2 = {1, 2, 3, 5}; boolean exp2 = false;
        boolean got2 = solveQ4(in2);
        boolean p2 = (got2 == exp2); if (p2) passed++;
        System.out.println("[TEST 2] nums = " + Arrays.toString(in2));
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
