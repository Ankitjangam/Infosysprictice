/**
 * =============================================================================
 * INFOSYS SPECIALIST PROGRAMMER (SP) TOPIC-WISE ROADMAP
 * DAY 8 (25 Nov): Graphs, BFS/DFS, DSU & Shortest Paths
 * DIFFICULTY: Hard | PROBLEM: Network Delay Time (Dijkstra Algorithm)
 * =============================================================================
 *
 * [PROBLEM DESCRIPTION]
 * Find minimum time for all nodes to receive a signal sent from node `k`.
 *
 * [CONSTRAINTS & HARDWARE TARGET]
 * 1 <= n <= 100, 1 <= times.length <= 6000.
 *
 * [SAMPLE INPUT / OUTPUT]
 * times = [[2,1,1],[2,3,1],[3,4,1]], n = 4, k = 2 | Expected: 2
 *
 * [INFOSYS EXAM WARNING / HARDWARE TRAP]
 * Dijkstra using PriorityQueue of [node, dist]. Output max distance among all reachable nodes.
 *
 * =============================================================================
 * HOW TO TEST IN NOTEPAD:
 * 1. Implement your solution in the empty method below.
 * 2. Save the file.
 * 3. Open Command Prompt in this folder and compile & run:
 *       javac Q4_Hard_NetworkDelayTimeDijkstra.java
 *       java Q4_Hard_NetworkDelayTimeDijkstra
 * =============================================================================
 */

import java.util.*;
import java.io.*;


public class Q4_Hard_NetworkDelayTimeDijkstra {

    // =========================================================================
    // TODO: WRITE YOUR OPTIMAL LOGIC IN THIS METHOD
    // Pure strict practice: Implement your solution from scratch.
    // =========================================================================
    public static int networkDelayTime(int[][] times, int n, int k) {
        // >>> WRITE YOUR SOLUTION HERE <<<

        return 0;
    }

    // =========================================================================
    // BUILT-IN TEST RUNNER (Executes automatically when you run this file)
    // =========================================================================
    public static void main(String[] args) {
        System.out.println("==================================================");
        System.out.println("DAY 8 (25 Nov): Graphs, BFS/DFS, DSU & Shortest Paths");
        System.out.println("PROBLEM: Network Delay Time (Dijkstra Algorithm) [Hard]");
        System.out.println("==================================================");

        System.out.println("\n[SAMPLE DETAILS]");
        System.out.println("  times = [[2,1,1],[2,3,1],[3,4,1]], n = 4, k = 2 | Expected: 2");

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
