/**
 * =============================================================================
 * INFOSYS SPECIALIST PROGRAMMER (SP) TOPIC-WISE ROADMAP
 * DAY 5 (22 Nov): Binary Search on Monotonic Answer Space
 * DIFFICULTY: Hard | PROBLEM: Aggressive Cows (Maximize Minimum Distance)
 * =============================================================================
 *
 * [PROBLEM DESCRIPTION]
 * Assign `C` cows to stalls such that minimum distance between any two cows is maximized.
 *
 * [CONSTRAINTS & HARDWARE TARGET]
 * 2 <= N <= 10^5, 2 <= C <= N, stall positions up to 10^9.
 *
 * [SAMPLE INPUT / OUTPUT]
 * stalls = [1, 2, 8, 4, 9], C = 3 | Expected: 3
 *
 * [INFOSYS EXAM WARNING / HARDWARE TRAP]
 * Sort stalls. Binary search on distance `d`. Greedily place cow if stall - lastStall >= d.
 *
 * =============================================================================
 * HOW TO TEST IN NOTEPAD:
 * 1. Implement your solution in the empty method below.
 * 2. Save the file.
 * 3. Open Command Prompt in this folder and compile & run:
 *       javac Q2_Hard_AggressiveCows.java
 *       java Q2_Hard_AggressiveCows
 * =============================================================================
 */

import java.util.*;
import java.io.*;


public class Q2_Hard_AggressiveCows {

    // =========================================================================
    // TODO: WRITE YOUR OPTIMAL LOGIC IN THIS METHOD
    // Pure strict practice: Implement your solution from scratch.
    // =========================================================================
    public static int aggressiveCows(int[] stalls, int k) {
        // >>> WRITE YOUR SOLUTION HERE <<<

        return 0;
    }

    // =========================================================================
    // BUILT-IN TEST RUNNER (Executes automatically when you run this file)
    // =========================================================================
    public static void main(String[] args) {
        System.out.println("==================================================");
        System.out.println("DAY 5 (22 Nov): Binary Search on Monotonic Answer Space");
        System.out.println("PROBLEM: Aggressive Cows (Maximize Minimum Distance) [Hard]");
        System.out.println("==================================================");

        System.out.println("\n[SAMPLE DETAILS]");
        System.out.println("  stalls = [1, 2, 8, 4, 9], C = 3 | Expected: 3");

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
