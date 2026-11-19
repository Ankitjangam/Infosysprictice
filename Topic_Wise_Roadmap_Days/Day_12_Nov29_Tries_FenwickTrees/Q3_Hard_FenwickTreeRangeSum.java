/**
 * =============================================================================
 * INFOSYS SPECIALIST PROGRAMMER (SP) TOPIC-WISE ROADMAP
 * DAY 12 (29 Nov): Tries & Fenwick Trees / BIT
 * DIFFICULTY: Hard | PROBLEM: Fenwick Tree (Binary Indexed Tree) Range Sum
 * =============================================================================
 *
 * [PROBLEM DESCRIPTION]
 * Support point updates and range sum queries in O(log N) time.
 *
 * [CONSTRAINTS & HARDWARE TARGET]
 * 1 <= n <= 10^5, 1 <= queries <= 10^5.
 *
 * [SAMPLE INPUT / OUTPUT]
 * arr = [1, 3, 5], sumRange(0, 2) -> 9, update(1, 2), sumRange(0, 2) -> 8
 *
 * [INFOSYS EXAM WARNING / HARDWARE TRAP]
 * Tree indexed 1 to N. Point update adds delta using (i += i & -i). Query uses (i -= i & -i).
 *
 * =============================================================================
 * HOW TO TEST IN NOTEPAD:
 * 1. Implement your solution in the empty method below.
 * 2. Save the file.
 * 3. Open Command Prompt in this folder and compile & run:
 *       javac Q3_Hard_FenwickTreeRangeSum.java
 *       java Q3_Hard_FenwickTreeRangeSum
 * =============================================================================
 */

import java.util.*;
import java.io.*;


public class Q3_Hard_FenwickTreeRangeSum {

    // =========================================================================
    // TODO: WRITE YOUR OPTIMAL LOGIC IN THIS METHOD
    // Pure strict practice: Implement your solution from scratch.
    // =========================================================================
    public static long query(int i) {
        // >>> WRITE YOUR SOLUTION HERE <<<

        return 0L;
    }

    // =========================================================================
    // BUILT-IN TEST RUNNER (Executes automatically when you run this file)
    // =========================================================================
    public static void main(String[] args) {
        System.out.println("==================================================");
        System.out.println("DAY 12 (29 Nov): Tries & Fenwick Trees / BIT");
        System.out.println("PROBLEM: Fenwick Tree (Binary Indexed Tree) Range Sum [Hard]");
        System.out.println("==================================================");

        System.out.println("\n[SAMPLE DETAILS]");
        System.out.println("  arr = [1, 3, 5], sumRange(0, 2) -> 9, update(1, 2), sumRange(0, 2) -> 8");

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
