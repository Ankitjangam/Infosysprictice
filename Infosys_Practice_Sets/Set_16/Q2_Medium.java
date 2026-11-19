/**
 * =============================================================================
 * INFOSYS SPECIALIST PROGRAMMER (SP) IN-PERSON CODING ASSESSMENT
 * SET 16 | QUESTION 2 &bull; Easy-Medium (12 Cases)
 * Q2 (Easy-Med – 12 Cases): The Beautiful Function Number Cycle (Official Infosys InfyTQ)
 * =============================================================================
 *
 * [PROBLEM DESCRIPTION]
 * A mathematical function $F(x)$ is defined as follows: Add 1 to $x$, and if the resulting number contains trailing zeros, remove all trailing zeros. Given an initial integer $N$, determine how many unique numbers will be generated if you apply $F(x)$ repeatedly an infinite number of times.
 *
 * [CONSTRAINTS]
 * $1 \le N \le 10^9$.
 *
 * [SAMPLE INPUT / OUTPUT]
 * N = 1098 | Sample Output: 20
 *
 * [INFOSYS EXAM WARNING / HARDWARE TRAP]
 * Infosys Trap: Forgetting the inner `while (n % 10 == 0)` fails for numbers like $99 	o 100 	o 1$ where multiple zeros must be stripped!
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
    // Target Complexity:  $O(\log N)$ Time, $O(\log N)$ Space.
    // =========================================================================
    public static int solveBeautifulFunction(long n) {
        // >>> WRITE YOUR SOLUTION HERE <<<

        return 0;
    }

    // =========================================================================
    // BUILT-IN TEST RUNNER (Executes automatically when you run this file)
    // =========================================================================
    public static void main(String[] args) {
        System.out.println("==================================================");
        System.out.println("INFOSYS EXAM PRACTICE: SET 16 - QUESTION 2");
        System.out.println("Q2 (Easy-Med – 12 Cases): The Beautiful Function Number Cycle (Official Infosys InfyTQ)");
        System.out.println("==================================================");

        System.out.println("\n[SAMPLE DETAILS]");
        System.out.println("  N = 1098 | Sample Output: 20");

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
