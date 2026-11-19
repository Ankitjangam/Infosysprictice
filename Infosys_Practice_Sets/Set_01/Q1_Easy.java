/**
 * =============================================================================
 * INFOSYS SPECIALIST PROGRAMMER (SP) IN-PERSON CODING ASSESSMENT
 * SET 01 | QUESTION 1 &bull; Easy (12 Cases)
 * Q1 (Easy – 12 Cases): Power Grid Load Balancer (Two Sum II Monotonic Space)
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
 *       java Q1_Easy
 * =============================================================================
 */

import java.util.*;
import java.io.*;


public class Q1_Easy {

    // =========================================================================
    // TODO: WRITE YOUR OPTIMAL LOGIC IN THIS METHOD
    // Target Complexity:  $O(N)$ Time, $O(1)$ Space.
    // =========================================================================
    public static int[] solveQ1(int[] capacities, int target) {
        // >>> WRITE YOUR SOLUTION HERE <<<

        return new int[0];
    }

    // =========================================================================
    // BUILT-IN TEST RUNNER (Executes automatically when you run this file)
    // =========================================================================
    public static void main(String[] args) {
        System.out.println("==================================================");
        System.out.println("INFOSYS EXAM PRACTICE: SET 01 - QUESTION 1");
        System.out.println("Q1 (Easy – 12 Cases): Power Grid Load Balancer (Two Sum II Monotonic Space)");
        System.out.println("==================================================");

        System.out.println("\n[SAMPLE DETAILS]");
        System.out.println("  capacities = [2, 7, 11, 15], target = 9 | Sample Output: [1, 2]");

        System.out.println("\n[INSTRUCTIONS]");
        System.out.println("  1. Implement your logic in the empty method above.");
        System.out.println("  2. Recompile and run to test your solution.");
        System.out.println("  3. Target: 100% bug-free on all hidden edge cases.");
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
