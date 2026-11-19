/**
 * =============================================================================
 * INFOSYS SPECIALIST PROGRAMMER (SP) IN-PERSON CODING ASSESSMENT
 * SET 01 | QUESTION 2 &bull; Easy-Medium (12 Cases)
 * Q2 (Easy-Med – 12 Cases): Satellite Clean Transmission (Longest Substring Without Repeating)
 * =============================================================================
 *
 * [PROBLEM DESCRIPTION]
 * A deep-space antenna receives character stream s. Determine the maximum length of a continuous telemetric packet containing zero repeated characters.
 *
 * [CONSTRAINTS]
 * $0 \le |s| \le 10^5$. Characters are printable ASCII (0 to 127).
 *
 * [SAMPLE INPUT / OUTPUT]
 * s = "abcabcbb" | Sample Output: 3 (packet "abc")
 *
 * [INFOSYS EXAM WARNING / HARDWARE TRAP]
 * Infosys Trap: Using `int[26]` fails on numeric digits and special symbols; allocate `int[128]`.
 *
 * =============================================================================
 * HOW TO TEST IN NOTEPAD:
 * 1. Implement your solution in the empty method below.
 * 2. Save the file.
 * 3. Open Command Prompt in this folder and compile & run:
 *       javac Q2_Medium.java
 *       java Q2_Medium
 * =============================================================================
 */

import java.util.*;
import java.io.*;


public class Q2_Medium {

    // =========================================================================
    // TODO: WRITE YOUR OPTIMAL LOGIC IN THIS METHOD
    // Target Complexity:  $O(N)$ Time, $O(1)$ Space.
    // =========================================================================
    public static int solveQ2(String s) {
        // >>> WRITE YOUR SOLUTION HERE <<<

        return 0;
    }

    // =========================================================================
    // BUILT-IN TEST RUNNER (Executes automatically when you run this file)
    // =========================================================================
    public static void main(String[] args) {
        System.out.println("==================================================");
        System.out.println("INFOSYS EXAM PRACTICE: SET 01 - QUESTION 2");
        System.out.println("Q2 (Easy-Med – 12 Cases): Satellite Clean Transmission (Longest Substring Without Repeating)");
        System.out.println("==================================================");

        System.out.println("\n[SAMPLE DETAILS]");
        System.out.println("  s = \"abcabcbb\" | Sample Output: 3 (packet \"abc\")");

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
