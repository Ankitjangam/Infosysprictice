/**
 * =============================================================================
 * INFOSYS SPECIALIST PROGRAMMER (SP) IN-PERSON CODING ASSESSMENT
 * SET 01 | QUESTION 4 &bull; Hard (12 Cases)
 * Q4 (Hard – 12 Cases): Equal Load Partitioning (0/1 Knapsack Space-Optimized)
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
 *       java Q4_Hard
 * =============================================================================
 */

import java.util.*;
import java.io.*;


public class Q4_Hard {

    // =========================================================================
    // TODO: WRITE YOUR OPTIMAL LOGIC IN THIS METHOD
    // Target Complexity:  $O(N 	imes \sum W)$ Time, $O(\sum W)$ Space.
    // =========================================================================
    public static boolean solveQ4(int[] nums) {
        // >>> WRITE YOUR SOLUTION HERE <<<

        return false;
    }

    // =========================================================================
    // BUILT-IN TEST RUNNER (Executes automatically when you run this file)
    // =========================================================================
    public static void main(String[] args) {
        System.out.println("==================================================");
        System.out.println("INFOSYS EXAM PRACTICE: SET 01 - QUESTION 4");
        System.out.println("Q4 (Hard – 12 Cases): Equal Load Partitioning (0/1 Knapsack Space-Optimized)");
        System.out.println("==================================================");

        System.out.println("\n[SAMPLE DETAILS]");
        System.out.println("  nums = [1, 5, 11, 5] | Sample Output: true (subsets [11] and [1, 5, 5])");

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
