/**
 * =============================================================================
 * INFOSYS SPECIALIST PROGRAMMER (SP) TOPIC-WISE ROADMAP
 * DAY 8 (25 Nov): Graphs, BFS/DFS, DSU & Shortest Paths
 * DIFFICULTY: Medium | PROBLEM: Redundant Connection via DSU
 * =============================================================================
 *
 * [PROBLEM DESCRIPTION]
 * Find edge that can be removed so graph becomes a tree of `n` nodes.
 *
 * [CONSTRAINTS & HARDWARE TARGET]
 * 3 <= n <= 1000.
 *
 * [SAMPLE INPUT / OUTPUT]
 * edges = [[1,2],[1,3],[2,3]] | Expected: [2, 3]
 *
 * [INFOSYS EXAM WARNING / HARDWARE TRAP]
 * Disjoint Set Union with find and union by rank. If find(u) == find(v), edge is redundant.
 *
 * =============================================================================
 * HOW TO TEST IN NOTEPAD:
 * 1. Implement your solution in the empty method below.
 * 2. Save the file.
 * 3. Open Command Prompt in this folder and compile & run:
 *       javac Q2_Medium_RedundantConnectionDSU.java
 *       java -cp . Q2_Medium_RedundantConnectionDSU
 * =============================================================================
 */

import java.util.*;
import java.io.*;


public class Q2_Medium_RedundantConnectionDSU {

    // =========================================================================
    // TODO: WRITE YOUR OPTIMAL LOGIC IN THIS METHOD
    // Pure strict practice: Implement your solution from scratch.
    // =========================================================================
    public static int[] findRedundantConnection(int[][] edges) {
        // >>> WRITE YOUR SOLUTION HERE <<<

        return new int[0];
    }

    // =========================================================================
    // BUILT-IN AUTOMATED TEST RUNNER (Calls your method and verifies verdict)
    // =========================================================================
    public static void main(String[] args) {
        System.out.println("==================================================");
        System.out.println("DAY 8 (25 Nov): Graphs, BFS/DFS, DSU & Shortest Paths");
        System.out.println("PROBLEM: Redundant Connection via DSU [Medium]");
        System.out.println("==================================================");

        int passed = 0, total = 0;
        total++;
        int[][] edges1 = {{1, 2}, {1, 3}, {2, 3}}; int[] exp1 = {2, 3};
        int[] got1 = findRedundantConnection(edges1);
        boolean p1 = Arrays.equals(got1, exp1);
        if (p1) passed++;
        System.out.println("[TEST 1] edges = [[1,2],[1,3],[2,3]]");
        System.out.println("         Expected: " + Arrays.toString(exp1) + " | Got: " + Arrays.toString(got1));
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
