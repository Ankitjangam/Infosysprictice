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
 *       java -cp . Q1_Medium_LowestCommonAncestor
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
    // BUILT-IN AUTOMATED TEST RUNNER (Calls your method and verifies verdict)
    // =========================================================================
    public static void main(String[] args) {
        System.out.println("==================================================");
        System.out.println("DAY 7 (24 Nov): Binary Trees, BST & LCA");
        System.out.println("PROBLEM: Lowest Common Ancestor in Binary Tree [Medium]");
        System.out.println("==================================================");

        int passed = 0, total = 0;
        total++;
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(5); root.right = new TreeNode(1);
        root.left.left = new TreeNode(6); root.left.right = new TreeNode(2);
        TreeNode p = root.left; // 5
        TreeNode q = root.right; // 1
        TreeNode got = lowestCommonAncestor(root, p, q);
        boolean p1 = (got != null && got.val == 3);
        if (p1) passed++;
        System.out.println("[TEST 1] Tree root = 3, p = 5, q = 1");
        System.out.println("         Expected LCA: 3 | Got: " + (got != null ? got.val : "null"));
        System.out.println("         Verdict:      " + (p1 ? ">> PASS <<" : "!! FAIL !!"));
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
