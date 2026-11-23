/**
 * =============================================================================
 * INFOSYS SPECIALIST PROGRAMMER (SP) IN-PERSON CODING ASSESSMENT
 * SET 16 | QUESTION 1 &bull; Easy (12 Cases)
 * Q1 (Easy - 12 Cases): The Gym Workout Exhaustion (Official HackWithInfy Problem)
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
 *       java -cp . Q1_Easy
 * =============================================================================
 */

import java.util.*;
import java.io.*;


public class Q1_Easy {

    // =========================================================================
    // TODO: WRITE YOUR OPTIMAL LOGIC IN THIS METHOD
    // Pure strict practice: Implement your solution from scratch.
    // =========================================================================
    public static int solveGymWorkout(long E, int[] A) {
        // >>> WRITE YOUR SOLUTION HERE <<<
        return -1;
    }

    // =========================================================================
    // BUILT-IN AUTOMATED TEST RUNNER (Calls your method and verifies verdict)
    // =========================================================================
    public static void main(String[] args) {
        System.out.println("==================================================");
        System.out.println("INFOSYS EXAM PRACTICE: SET 16 - QUESTION 1");
        System.out.println("Q1 (Easy - 12 Cases): The Gym Workout Exhaustion (Official HackWithInfy Problem)");
        System.out.println("==================================================");
        int passed = 0, total = 0; total++;
        long E = 15; int[] A = {2, 3, 5, 2}; int exp1 = 4;
        int got1 = solveGymWorkout(E, A);
        boolean p1 = (got1 == exp1); if (p1) passed++;
        System.out.println("[TEST 1] E = " + E + ", A = " + Arrays.toString(A));
        System.out.println("         Expected exercises: " + exp1 + " | Got: " + got1);
        System.out.println("         Verdict:            " + (p1 ? ">> PASS <<" : "!! FAIL !!"));
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
