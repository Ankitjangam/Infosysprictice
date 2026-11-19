/**
 * =============================================================================
 * INFOSYS SPECIALIST PROGRAMMER (SP) IN-PERSON CODING ASSESSMENT
 * SET 02 | QUESTION 3 &bull; Medium-Hard (12 Cases)
 * Q3 (Med-Hard – 12 Cases): Corporate Hall Allocation (Meeting Rooms II / Min-Heap)
 * =============================================================================
 *
 * [PROBLEM DESCRIPTION]
 * Given meeting intervals [start, end], determine minimum conference halls required to host all meetings without overlap.
 *
 * [CONSTRAINTS]
 * $1 \le N \le 10^5$, $0 \le start < end \le 10^9$.
 *
 * [SAMPLE INPUT / OUTPUT]
 * intervals = [[0,30],[5,10],[15,20]] | Sample Output: 2
 *
 * [INFOSYS EXAM WARNING / HARDWARE TRAP]
 * Infosys Trap: Sorting with `(a, b) -> a[0] - b[0]` underflows if start times are large. Always use `Integer.compare()`.
 *
 * =============================================================================
 * HOW TO TEST IN NOTEPAD:
 * 1. Implement your solution in the empty method below.
 * 2. Save the file.
 * 3. Open Command Prompt in this folder and compile & run:
 *       javac Q3_MediumHard.java
 *       java Q3_MediumHard
 * =============================================================================
 */

import java.util.*;
import java.io.*;


public class Q3_MediumHard {

    // =========================================================================
    // TODO: WRITE YOUR OPTIMAL LOGIC IN THIS METHOD
    // Target Complexity: O(N) Time, O(1) Space
    // =========================================================================
    public static int solveQ3(int[][] intervals) {
        // >>> WRITE YOUR SOLUTION HERE <<<

        return 0;
    }

    // =========================================================================
    // BUILT-IN TEST RUNNER (Executes automatically when you run this file)
    // =========================================================================
    public static void main(String[] args) {
        System.out.println("==================================================");
        System.out.println("INFOSYS EXAM PRACTICE: SET 02 - QUESTION 3");
        System.out.println("Q3 (Med-Hard – 12 Cases): Corporate Hall Allocation (Meeting Rooms II / Min-Heap)");
        System.out.println("==================================================");

        System.out.println("\n[SAMPLE DETAILS]");
        System.out.println("  intervals = [[0,30],[5,10],[15,20]] | Sample Output: 2");

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
