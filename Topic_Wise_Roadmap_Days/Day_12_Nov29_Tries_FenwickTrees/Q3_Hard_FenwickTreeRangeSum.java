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
 *       java -cp . Q3_Hard_FenwickTreeRangeSum
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

    static long[] tree;
    static int N;

    public static void init(int n) {
        N = n;
        tree = new long[n + 1];
    }

    public static void update(int i, long delta) {
        // >>> WRITE YOUR UPDATE LOGIC HERE <<<
    }

    // =========================================================================
    // BUILT-IN AUTOMATED TEST RUNNER (Calls your method and verifies verdict)
    // =========================================================================
    public static void main(String[] args) {
        System.out.println("==================================================");
        System.out.println("DAY 12 (29 Nov): Tries & Fenwick Trees / BIT");
        System.out.println("PROBLEM: Fenwick Tree (Binary Indexed Tree) Range Sum [Hard]");
        System.out.println("==================================================");

        int passed = 0, total = 0;
        total++;
        init(5);
        update(1, 3); update(2, 2); update(3, -1); update(4, 6); update(5, 5);
        long q1 = query(3); // 3 + 2 - 1 = 4
        long q2 = query(5); // 4 + 6 + 5 = 15
        boolean allPass = (q1 == 4 && q2 == 15);
        if (allPass) passed++;
        System.out.println("[TEST 1] Fenwick Tree with values [3, 2, -1, 6, 5]");
        System.out.println("         query(3) Exp: 4 | Got: " + q1);
        System.out.println("         query(5) Exp: 15 | Got: " + q2);
        System.out.println("         Verdict: " + (allPass ? ">> PASS <<" : "!! FAIL !!"));
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
