/**
 * =============================================================================
 * INFOSYS SPECIALIST PROGRAMMER (SP) TOPIC-WISE ROADMAP
 * DAY 3 (20 Nov): Monotonic Stacks & Queues
 * DIFFICULTY: Hard | PROBLEM: Largest Rectangle in Histogram
 * =============================================================================
 *
 * [PROBLEM DESCRIPTION]
 * Find the area of the largest rectangle in the histogram.
 *
 * [CONSTRAINTS & HARDWARE TARGET]
 * 1 <= heights.length <= 10^5, 0 <= heights[i] <= 10^4.
 *
 * [SAMPLE INPUT / OUTPUT]
 * heights = [2, 1, 5, 6, 2, 3] | Expected: 10
 *
 * [INFOSYS EXAM WARNING / HARDWARE TRAP]
 * Monotonic increasing stack of indices. When popping bar at index `i`, width = right - left - 1.
 *
 * =============================================================================
 * HOW TO TEST IN NOTEPAD:
 * 1. Implement your solution in the empty method below.
 * 2. Save the file.
 * 3. Open Command Prompt in this folder and compile & run:
 *       javac Q4_Hard_LargestRectangleInHistogram.java
 *       java Q4_Hard_LargestRectangleInHistogram
 * =============================================================================
 */

import java.util.*;
import java.io.*;


public class Q4_Hard_LargestRectangleInHistogram {

    // =========================================================================
    // TODO: WRITE YOUR OPTIMAL LOGIC IN THIS METHOD
    // Pure strict practice: Implement your solution from scratch.
    // =========================================================================
    public static int largestRectangleArea(int[] heights) {
        // >>> WRITE YOUR SOLUTION HERE <<<

        return 0;
    }

    // =========================================================================
    // BUILT-IN TEST RUNNER (Executes automatically when you run this file)
    // =========================================================================
    public static void main(String[] args) {
        System.out.println("==================================================");
        System.out.println("DAY 3 (20 Nov): Monotonic Stacks & Queues");
        System.out.println("PROBLEM: Largest Rectangle in Histogram [Hard]");
        System.out.println("==================================================");

        System.out.println("\n[SAMPLE DETAILS]");
        System.out.println("  heights = [2, 1, 5, 6, 2, 3] | Expected: 10");

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
