/**
 * =============================================================================
 * INFOSYS SPECIALIST PROGRAMMER (SP) IN-PERSON CODING ASSESSMENT
 * SET 01 | QUESTION 3 &bull; Medium-Hard (12 Cases)
 * Q3 (Med-Hard – 12 Cases): Cargo Conveyor Fleet Optimization (BS on Answer Space)
 * =============================================================================
 *
 * [PROBLEM DESCRIPTION]
 * $N$ packages with weights weights[i] must be loaded onto a ship across $D$ consecutive days in sequential order. Find the minimum daily ship capacity needed to complete shipping within $D$ days.
 *
 * [CONSTRAINTS]
 * $1 \le D \le N \le 10^5$, $1 \le weights[i] \le 10^4$.
 *
 * [SAMPLE INPUT / OUTPUT]
 * weights = [1,2,3,4,5,6,7,8,9,10], D = 5 | Sample Output: 15
 *
 * [INFOSYS EXAM WARNING / HARDWARE TRAP]
 * Infosys Trap: Initializing `low = 0` causes an infinite loop when single package weight > capacity. `low` must be `max(weights)`.
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
    // Target Complexity:  $O(N \log(\sum W))$ Time, $O(1)$ Space.
    // =========================================================================
    public static int solveQ3(int[] weights, int D) {
        // >>> WRITE YOUR SOLUTION HERE <<<

        return 0;
    }

    // =========================================================================
    // BUILT-IN TEST RUNNER (Executes automatically when you run this file)
    // =========================================================================
    public static void main(String[] args) {
        System.out.println("==================================================");
        System.out.println("INFOSYS EXAM PRACTICE: SET 01 - QUESTION 3");
        System.out.println("Q3 (Med-Hard – 12 Cases): Cargo Conveyor Fleet Optimization (BS on Answer Space)");
        System.out.println("==================================================");

        System.out.println("\n[SAMPLE DETAILS]");
        System.out.println("  weights = [1,2,3,4,5,6,7,8,9,10], D = 5 | Sample Output: 15");

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
