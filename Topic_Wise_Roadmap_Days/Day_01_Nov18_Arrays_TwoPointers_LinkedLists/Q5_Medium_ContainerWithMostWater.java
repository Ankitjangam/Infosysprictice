/**
 * =============================================================================
 * INFOSYS SPECIALIST PROGRAMMER (SP) TOPIC-WISE ROADMAP
 * DAY 1 (18 Nov): Arrays, String Basics, Two Pointers & Linked Lists
 * DIFFICULTY: Medium | PROBLEM: Container With Most Water
 * =============================================================================
 *
 * [PROBLEM DESCRIPTION]
 * Find two lines that together with the x-axis form a container containing the most water.
 *
 * [CONSTRAINTS & HARDWARE TARGET]
 * 2 <= height.length <= 10^5, 0 <= height[i] <= 10^4.
 *
 * [SAMPLE INPUT / OUTPUT]
 * height = [1, 8, 6, 2, 5, 4, 8, 3, 7] | Expected: 49
 *
 * [INFOSYS EXAM WARNING / HARDWARE TRAP]
 * Always advance the pointer pointing to the shorter vertical bar.
 *
 * =============================================================================
 * HOW TO TEST IN NOTEPAD:
 * 1. Implement your solution in the empty method below.
 * 2. Save the file.
 * 3. Open Command Prompt in this folder and compile & run:
 *       javac Q5_Medium_ContainerWithMostWater.java
 *       java Q5_Medium_ContainerWithMostWater
 * =============================================================================
 */

import java.util.*;
import java.io.*;


public class Q5_Medium_ContainerWithMostWater {

    // =========================================================================
    // TODO: WRITE YOUR OPTIMAL LOGIC IN THIS METHOD
    // Pure strict practice: Implement your solution from scratch.
    // =========================================================================
    public static int maxArea(int[] height) {
        // >>> WRITE YOUR SOLUTION HERE <<<

        return 0;
    }

    // =========================================================================
    // BUILT-IN TEST RUNNER (Executes automatically when you run this file)
    // =========================================================================
    public static void main(String[] args) {
        System.out.println("==================================================");
        System.out.println("DAY 1 (18 Nov): Arrays, String Basics, Two Pointers & Linked Lists");
        System.out.println("PROBLEM: Container With Most Water [Medium]");
        System.out.println("==================================================");

        System.out.println("\n[SAMPLE DETAILS]");
        System.out.println("  height = [1, 8, 6, 2, 5, 4, 8, 3, 7] | Expected: 49");

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
