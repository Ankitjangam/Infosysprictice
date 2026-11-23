/**
 * =============================================================================
 * INFOSYS SPECIALIST PROGRAMMER (SP) TOPIC-WISE ROADMAP
 * DAY 7 (24 Nov): Binary Trees, BST & LCA
 * DIFFICULTY: Hard | PROBLEM: Binary Tree Maximum Path Sum
 * =============================================================================
 *
 * [PROBLEM DESCRIPTION]
 * Find maximum path sum of any non-empty path in a binary tree.
 *
 * [CONSTRAINTS & HARDWARE TARGET]
 * 1 <= nodes <= 3 * 10^4, -1000 <= Node.val <= 1000.
 *
 * [SAMPLE INPUT / OUTPUT]
 * root = [-10, 9, 20, null, null, 15, 7] | Expected: 42
 *
 * [INFOSYS EXAM WARNING / HARDWARE TRAP]
 * DFS computes max branch gain: Math.max(0, dfs(child)). Updates globalMax = val + left + right.
 *
 * =============================================================================
 * HOW TO TEST IN NOTEPAD:
 * 1. Implement your solution in the empty method below.
 * 2. Save the file.
 * 3. Open Command Prompt in this folder and compile & run:
 *       javac Q3_Hard_BinaryTreeMaximumPathSum.java
 *       java -cp . Q3_Hard_BinaryTreeMaximumPathSum
 * =============================================================================
 */

import java.util.*;
import java.io.*;


// Helper Binary Tree Node
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

public class Q3_Hard_BinaryTreeMaximumPathSum {

    // =========================================================================
    // TODO: WRITE YOUR OPTIMAL LOGIC IN THIS METHOD
    // Pure strict practice: Implement your solution from scratch.
    // =========================================================================
    public static int maxPathSum(TreeNode root) {
        // >>> WRITE YOUR SOLUTION HERE <<<

        return 0;
    }

    // =========================================================================
    // BUILT-IN AUTOMATED TEST RUNNER (Calls your method and verifies verdict)
    // =========================================================================
    public static void main(String[] args) {
        System.out.println("==================================================");
        System.out.println("DAY 7 (24 Nov): Binary Trees, BST & LCA");
        System.out.println("PROBLEM: Binary Tree Maximum Path Sum [Hard]");
        System.out.println("==================================================");

        int passed = 0, total = 0;
        total++;
        TreeNode root = new TreeNode(-10);
        root.left = new TreeNode(9); root.right = new TreeNode(20);
        root.right.left = new TreeNode(15); root.right.right = new TreeNode(7);
        int got1 = maxPathSum(root);
        int exp1 = 42;
        boolean p1 = (got1 == exp1);
        if (p1) passed++;
        System.out.println("[TEST 1] Tree [-10, 9, 20, null, null, 15, 7]");
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
