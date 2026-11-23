/**
 * =============================================================================
 * INFOSYS SPECIALIST PROGRAMMER (SP) TOPIC-WISE ROADMAP
 * DAY 9 (26 Nov): 0/1 Knapsack & Grid Dynamic Programming
 * DIFFICULTY: Hard | PROBLEM: Minimum Path Sum in Grid
 * =============================================================================
 *
 * [PROBLEM DESCRIPTION]
 * Find path from top-left to bottom-right minimizing sum of numbers along path.
 *
 * [CONSTRAINTS & HARDWARE TARGET]
 * 1 <= m, n <= 200, 0 <= grid[i][j] <= 200.
 *
 * [SAMPLE INPUT / OUTPUT]
 * grid = [[1,3,1],[1,5,1],[4,2,1]] | Expected: 7
 *
 * [INFOSYS EXAM WARNING / HARDWARE TRAP]
 * 2D DP: dp[i][j] = grid[i][j] + Math.min(dp[i-1][j], dp[i][j-1]). Optimize to 1D array.
 *
 * =============================================================================
 * HOW TO TEST IN NOTEPAD:
 * 1. Implement your solution in the empty method below.
 * 2. Save the file.
 * 3. Open Command Prompt in this folder and compile & run:
 *       javac Q3_Hard_MinimumPathSumGrid.java
 *       java -cp . Q3_Hard_MinimumPathSumGrid
 * =============================================================================
 */

import java.util.*;
import java.io.*;


public class Q3_Hard_MinimumPathSumGrid {

    // =========================================================================
    // TODO: WRITE YOUR OPTIMAL LOGIC IN THIS METHOD
    // Pure strict practice: Implement your solution from scratch.
    // =========================================================================
    public static int minPathSum(int[][] grid) {
        // >>> WRITE YOUR SOLUTION HERE <<<

        return 0;
    }

    // =========================================================================
    // BUILT-IN AUTOMATED TEST RUNNER (Calls your method and verifies verdict)
    // =========================================================================
    public static void main(String[] args) {
        System.out.println("==================================================");
        System.out.println("DAY 9 (26 Nov): 0/1 Knapsack & Grid Dynamic Programming");
        System.out.println("PROBLEM: Minimum Path Sum in Grid [Hard]");
        System.out.println("==================================================");

        int passed = 0, total = 0;
        total++;
        int[][] grid1 = {{1, 3, 1}, {1, 5, 1}, {4, 2, 1}}; int exp1 = 7;
        int got1 = minPathSum(grid1);
        boolean p1 = (got1 == exp1);
        if (p1) passed++;
        System.out.println("[TEST 1] grid = [[1,3,1],[1,5,1],[4,2,1]]");
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
