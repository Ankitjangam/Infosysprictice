/**
 * =============================================================================
 * INFOSYS SPECIALIST PROGRAMMER (SP) TOPIC-WISE ROADMAP
 * DAY 7 (24 Nov): Binary Trees, BST & LCA
 * DIFFICULTY: Medium | PROBLEM: Diameter of Binary Tree
 * =============================================================================
 *
 * [PROBLEM DESCRIPTION]
 * Return length of the diameter (longest path between any two nodes in a tree).
 *
 * [CONSTRAINTS & HARDWARE TARGET]
 * 1 <= nodes <= 10^5.
 *
 * [SAMPLE INPUT / OUTPUT]
 * root = [1,2,3,4,5] | Expected: 3
 *
 * [INFOSYS EXAM WARNING / HARDWARE TRAP]
 * Post-order DFS returns node height; updates globalMax = Math.max(globalMax, leftHeight + rightHeight).
 *
 * =============================================================================
 * HOW TO TEST IN NOTEPAD:
 * 1. Implement your solution in the empty method below.
 * 2. Save the file.
 * 3. Open Command Prompt in this folder and compile & run:
 *       javac Q2_Medium_DiameterOfBinaryTree.java
 *       java Q2_Medium_DiameterOfBinaryTree
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

public class Q2_Medium_DiameterOfBinaryTree {

    // =========================================================================
    // TODO: WRITE YOUR OPTIMAL LOGIC IN THIS METHOD
    // Pure strict practice: Implement your solution from scratch.
    // =========================================================================
    public static int diameterOfBinaryTree(TreeNode root) {
        // >>> WRITE YOUR SOLUTION HERE <<<

        return 0;
    }

    // =========================================================================
    // BUILT-IN TEST RUNNER (Executes automatically when you run this file)
    // =========================================================================
    public static void main(String[] args) {
        System.out.println("==================================================");
        System.out.println("DAY 7 (24 Nov): Binary Trees, BST & LCA");
        System.out.println("PROBLEM: Diameter of Binary Tree [Medium]");
        System.out.println("==================================================");

        System.out.println("\n[SAMPLE DETAILS]");
        System.out.println("  root = [1,2,3,4,5] | Expected: 3");

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
