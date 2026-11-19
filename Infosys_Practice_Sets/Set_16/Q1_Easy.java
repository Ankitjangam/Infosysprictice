/**
 * =============================================================================
 * INFOSYS SPECIALIST PROGRAMMER (SP) IN-PERSON CODING ASSESSMENT
 * SET 16 | QUESTION 1 &bull; Easy (12 Cases)
 * Q1 (Easy – 12 Cases): The Gym Workout Exhaustion (Official HackWithInfy Problem)
 * =============================================================================
 *
 * [PROBLEM DESCRIPTION]
 * You visit the gym with initial energy $E$. There are $N$ exercise machines available. Machine $i$ drains $A[i]$ energy from your body. You feel exhausted when your energy reaches $0$ or below. Since other gym members are waiting, you can use each unique machine at most twice. Find the minimum total exercises you must perform to become exhausted, or return -1 if performing all exercises twice still leaves you with positive energy.
 *
 * [CONSTRAINTS]
 * $1 \le N \le 10^5$, $1 \le E \le 10^{14}$, $1 \le A[i] \le 10^9$.
 *
 * [SAMPLE INPUT / OUTPUT]
 * E = 15, A = [6, 2, 4] | Sample Output: 3 (Use 6 twice and 4 once → drains 16 ≥ 15)
 *
 * [INFOSYS EXAM WARNING / HARDWARE TRAP]
 * Infosys Trap: Energy $E \le 10^{14}$ breaches 32-bit `int` limits. Variables `E` and `drained` MUST be `long`.
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
    // Target Complexity:  $O(N \log N)$ Time, $O(1)$ Space.
    // =========================================================================
    public static int solveGymWorkout(long E, int[] A) {
        // >>> WRITE YOUR SOLUTION HERE <<<

        return 0;
    }

    // =========================================================================
    // BUILT-IN TEST RUNNER (Executes automatically when you run this file)
    // =========================================================================
    public static void main(String[] args) {
        System.out.println("==================================================");
        System.out.println("INFOSYS EXAM PRACTICE: SET 16 - QUESTION 1");
        System.out.println("Q1 (Easy – 12 Cases): The Gym Workout Exhaustion (Official HackWithInfy Problem)");
        System.out.println("==================================================");

        System.out.println("\n[SAMPLE DETAILS]");
        System.out.println("  E = 15, A = [6, 2, 4] | Sample Output: 3 (Use 6 twice and 4 once → drains 16 ≥ 15)");

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
