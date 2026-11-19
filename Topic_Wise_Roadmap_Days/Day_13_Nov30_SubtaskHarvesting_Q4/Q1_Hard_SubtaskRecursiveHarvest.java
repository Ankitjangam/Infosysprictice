/**
 * =============================================================================
 * INFOSYS SPECIALIST PROGRAMMER (SP) TOPIC-WISE ROADMAP
 * DAY 13 (30 Nov): Subtask Harvesting Blueprint (Q4 Lifesaver)
 * DIFFICULTY: Hard | PROBLEM: O(2^N) Subtask Partial Score Harvester
 * =============================================================================
 *
 * [PROBLEM DESCRIPTION]
 * When Question 4 is an intimidating NP-hard / multi-dimensional DP, test cases 1-4 often have N <= 18. Harvest these 4 test cases using recursive branch & bound.
 *
 * [CONSTRAINTS & HARDWARE TARGET]
 * Subtask 1: N <= 18. Full Task: N <= 10^5.
 *
 * [SAMPLE INPUT / OUTPUT]
 * Harvest partial score: 4 out of 12 test cases instantly banked.
 *
 * [INFOSYS EXAM WARNING / HARDWARE TRAP]
 * Write subset recursion: harvest(index + 1, sum) for include / exclude.
 *
 * =============================================================================
 * HOW TO TEST IN NOTEPAD:
 * 1. Implement your solution in the empty method below.
 * 2. Save the file.
 * 3. Open Command Prompt in this folder and compile & run:
 *       javac Q1_Hard_SubtaskRecursiveHarvest.java
 *       java Q1_Hard_SubtaskRecursiveHarvest
 * =============================================================================
 */

import java.util.*;
import java.io.*;


public class Q1_Hard_SubtaskRecursiveHarvest {

    // =========================================================================
    // TODO: WRITE YOUR OPTIMAL LOGIC IN THIS METHOD
    // Pure strict practice: Implement your solution from scratch.
    // =========================================================================
    public static long harvestSubtask(int index, int n, int[] items, long currentSum) {
        // >>> WRITE YOUR SOLUTION HERE <<<

        return 0L;
    }

    // =========================================================================
    // BUILT-IN TEST RUNNER (Executes automatically when you run this file)
    // =========================================================================
    public static void main(String[] args) {
        System.out.println("==================================================");
        System.out.println("DAY 13 (30 Nov): Subtask Harvesting Blueprint (Q4 Lifesaver)");
        System.out.println("PROBLEM: O(2^N) Subtask Partial Score Harvester [Hard]");
        System.out.println("==================================================");

        System.out.println("\n[SAMPLE DETAILS]");
        System.out.println("  Harvest partial score: 4 out of 12 test cases instantly banked.");

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
