/**
 * =============================================================================
 * INFOSYS SPECIALIST PROGRAMMER (SP) TOPIC-WISE ROADMAP
 * DAY 7 (24 Nov): Binary Trees, BST & LCA
 * DIFFICULTY: Medium | PROBLEM: Lowest Common Ancestor in Binary Tree
 * =============================================================================
 *
 * [PROBLEM DESCRIPTION]
 * Find lowest common ancestor (LCA) of two given nodes `p` and `q` in binary tree.
 *
 * [CONSTRAINTS & HARDWARE TARGET]
 * 2 <= nodes <= 10^5, all values unique.
 *
 * [SAMPLE INPUT / OUTPUT]
 * root = [3,5,1,6,2,0,8,null,null,7,4], p = 5, q = 1 | Expected: Node 3
 *
 * [INFOSYS EXAM WARNING / HARDWARE TRAP]
 * Post-order traversal: if root equals p or q return root. If left and right both non-null, root is LCA.
 *
 * =============================================================================
 * HOW TO TEST IN NOTEPAD:
 * 1. Implement your solution in the empty method below.
 * 2. Save the file.
 * 3. Open Command Prompt in this folder and compile & run:
 *       javac Q1_Medium_LowestCommonAncestor.java
 *       java Q1_Medium_LowestCommonAncestor
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

public class Q1_Medium_LowestCommonAncestor {

    // =========================================================================
    // TODO: WRITE YOUR OPTIMAL LOGIC IN THIS METHOD
    // Pure strict practice: Implement your solution from scratch.
    // =========================================================================
    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        // >>> WRITE YOUR SOLUTION HERE <<<

        return null;
    }

    // =========================================================================
    // BUILT-IN TEST RUNNER (Executes automatically when you run this file)
    // =========================================================================
    public static void main(String[] args) {
        System.out.println("==================================================");
        System.out.println("DAY 7 (24 Nov): Binary Trees, BST & LCA");
        System.out.println("PROBLEM: Lowest Common Ancestor in Binary Tree [Medium]");
        System.out.println("==================================================");

        System.out.println("\n[SAMPLE DETAILS]");
        System.out.println("  root = [3,5,1,6,2,0,8,null,null,7,4], p = 5, q = 1 | Expected: Node 3");

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
