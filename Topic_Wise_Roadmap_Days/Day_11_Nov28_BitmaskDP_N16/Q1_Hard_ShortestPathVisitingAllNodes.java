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
 *       java -cp . Q1_Hard_ShortestPathVisitingAllNodes
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
    // BUILT-IN AUTOMATED TEST RUNNER (Calls your method and verifies verdict)
    // =========================================================================
    public static void main(String[] args) {
        System.out.println("==================================================");
        System.out.println("DAY 11 (28 Nov): Bitmask Dynamic Programming (N <= 16)");
        System.out.println("PROBLEM: Shortest Path Visiting All Nodes (N <= 12) [Hard]");
        System.out.println("==================================================");

        int passed = 0, total = 0;
        total++;
        int[][] graph1 = {{1, 2, 3}, {0}, {0}, {0}}; int exp1 = 4;
        int got1 = shortestPathLength(graph1);
        boolean p1 = (got1 == exp1);
        if (p1) passed++;
        System.out.println("[TEST 1] graph = [[1,2,3],[0],[0],[0]]");
        System.out.println("         Expected: " + exp1 + " | Got: " + got1);
        System.out.println("         Verdict:  " + (p1 ? ">> PASS <<" : "!! FAIL !!"));
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
