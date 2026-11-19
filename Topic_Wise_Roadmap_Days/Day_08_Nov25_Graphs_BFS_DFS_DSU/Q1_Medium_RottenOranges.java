/**
 * =============================================================================
 * INFOSYS SPECIALIST PROGRAMMER (SP) TOPIC-WISE ROADMAP
 * DAY 8 (25 Nov): Graphs, BFS/DFS, DSU & Shortest Paths
 * DIFFICULTY: Medium | PROBLEM: Rotten Oranges (Multi-Source BFS)
 * =============================================================================
 *
 * [PROBLEM DESCRIPTION]
 * Find minimum minutes until no fresh orange remains in the grid.
 *
 * [CONSTRAINTS & HARDWARE TARGET]
 * 1 <= m, n <= 10.
 *
 * [SAMPLE INPUT / OUTPUT]
 * grid = [[2,1,1],[1,1,0],[0,1,1]] | Expected: 4
 *
 * [INFOSYS EXAM WARNING / HARDWARE TRAP]
 * Enqueue all initially rotten oranges. Standard multi-source level-by-level BFS.
 *
 * =============================================================================
 * HOW TO TEST IN NOTEPAD:
 * 1. Implement your solution in the empty method below.
 * 2. Save the file.
 * 3. Open Command Prompt in this folder and compile & run:
 *       javac Q1_Medium_RottenOranges.java
 *       java Q1_Medium_RottenOranges
 * =============================================================================
 */

import java.util.*;
import java.io.*;


public class Q1_Medium_RottenOranges {

    // =========================================================================
    // TODO: WRITE YOUR OPTIMAL LOGIC IN THIS METHOD
    // Pure strict practice: Implement your solution from scratch.
    // =========================================================================
    public static int orangesRotting(int[][] grid) {
        // >>> WRITE YOUR SOLUTION HERE <<<

        return 0;
    }

    // =========================================================================
    // BUILT-IN TEST RUNNER (Executes automatically when you run this file)
    // =========================================================================
    public static void main(String[] args) {
        System.out.println("==================================================");
        System.out.println("DAY 8 (25 Nov): Graphs, BFS/DFS, DSU & Shortest Paths");
        System.out.println("PROBLEM: Rotten Oranges (Multi-Source BFS) [Medium]");
        System.out.println("==================================================");

        System.out.println("\n[SAMPLE DETAILS]");
        System.out.println("  grid = [[2,1,1],[1,1,0],[0,1,1]] | Expected: 4");

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
