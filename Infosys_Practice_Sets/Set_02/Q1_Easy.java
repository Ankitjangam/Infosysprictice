/**
 * =============================================================================
 * INFOSYS SPECIALIST PROGRAMMER (SP) IN-PERSON CODING ASSESSMENT
 * SET 02 | QUESTION 1 &bull; Easy (12 Cases)
 * Q1 (Easy – 12 Cases): Semiconductor Defect In-Place Sorter (Dutch National Flag)
 * =============================================================================
 *
 * [PROBLEM DESCRIPTION]
 * Silicon wafers are graded 0 (Defect-Free), 1 (Standard Grade), or 2 (Scrap). Sort an array of $N$ wafers in-place in $O(N)$ time and $O(1)$ extra space without using Java's built-in sort.
 *
 * [CONSTRAINTS]
 * $1 \le N \le 10^5$, $nums[i] \in \{0, 1, 2\}$.
 *
 * [SAMPLE INPUT / OUTPUT]
 * nums = [2,0,2,1,1,0] | Sample Output: [0,0,1,1,2,2]
 *
 * [INFOSYS EXAM WARNING / HARDWARE TRAP]
 * Infosys Trap: Incrementing `mid` when swapping with `high` traps an unexamined 0 in the middle!
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
    // Target Complexity: O(N) Time, O(1) Space
    // =========================================================================
    public static void solveQ1(int[] nums) {
        // >>> WRITE YOUR SOLUTION HERE <<<

        return;
    }

    // =========================================================================
    // BUILT-IN TEST RUNNER (Executes automatically when you run this file)
    // =========================================================================
    public static void main(String[] args) {
        System.out.println("==================================================");
        System.out.println("INFOSYS EXAM PRACTICE: SET 02 - QUESTION 1");
        System.out.println("Q1 (Easy – 12 Cases): Semiconductor Defect In-Place Sorter (Dutch National Flag)");
        System.out.println("==================================================");

        System.out.println("\n[SAMPLE DETAILS]");
        System.out.println("  nums = [2,0,2,1,1,0] | Sample Output: [0,0,1,1,2,2]");

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
