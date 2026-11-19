/**
 * =============================================================================
 * INFOSYS SPECIALIST PROGRAMMER (SP) TOPIC-WISE ROADMAP
 * DAY 11 (28 Nov): Bitmask Dynamic Programming (N <= 16)
 * DIFFICULTY: Hard | PROBLEM: Shortest Path Visiting All Nodes (N <= 12)
 * =============================================================================
 *
 * [PROBLEM DESCRIPTION]
 * Find shortest path that visits every node in undirected connected graph.
 *
 * [CONSTRAINTS & HARDWARE TARGET]
 * 1 <= n <= 12.
 *
 * [SAMPLE INPUT / OUTPUT]
 * graph = [[1,2,3],[0],[0],[0]] | Expected: 4
 *
 * [INFOSYS EXAM WARNING / HARDWARE TRAP]
 * State BFS: queue stores (node, mask, dist). Visited state boolean[n][1 << n].
 *
 * =============================================================================
 * HOW TO TEST IN NOTEPAD:
 * 1. Implement your solution in the empty method below.
 * 2. Save the file.
 * 3. Open Command Prompt in this folder and compile & run:
 *       javac Q1_Hard_ShortestPathVisitingAllNodes.java
 *       java Q1_Hard_ShortestPathVisitingAllNodes
 * =============================================================================
 */

import java.util.*;
import java.io.*;


public class Q1_Hard_ShortestPathVisitingAllNodes {

    // =========================================================================
    // TODO: WRITE YOUR OPTIMAL LOGIC IN THIS METHOD
    // Pure strict practice: Implement your solution from scratch.
    // =========================================================================
    public static int shortestPathLength(int[][] graph) {
        // >>> WRITE YOUR SOLUTION HERE <<<

        return 0;
    }

    // =========================================================================
    // BUILT-IN TEST RUNNER (Executes automatically when you run this file)
    // =========================================================================
    public static void main(String[] args) {
        System.out.println("==================================================");
        System.out.println("DAY 11 (28 Nov): Bitmask Dynamic Programming (N <= 16)");
        System.out.println("PROBLEM: Shortest Path Visiting All Nodes (N <= 12) [Hard]");
        System.out.println("==================================================");

        System.out.println("\n[SAMPLE DETAILS]");
        System.out.println("  graph = [[1,2,3],[0],[0],[0]] | Expected: 4");

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
