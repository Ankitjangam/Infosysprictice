/**
 * =============================================================================
 * INFOSYS SPECIALIST PROGRAMMER (SP) IN-PERSON CODING ASSESSMENT
 * SET 07 | QUESTION 3 &bull; Medium-Hard (12 Cases)
 * Q3 (Med-Hard – 12 Cases): Gateway Hierarchy Convergence (Lowest Common Ancestor)
 * =============================================================================
 *
 * [PROBLEM DESCRIPTION]
 * Find the lowest common ancestor node of two nodes $p$ and $q$ in a binary tree.
 *
 * [CONSTRAINTS]
 * Standard exam constraints.
 *
 * [SAMPLE INPUT / OUTPUT]
 * Sample Input: None
 *
 * [INFOSYS EXAM WARNING / HARDWARE TRAP]
 * Watch for boundary and 32-bit integer overflow traps.
 *
 * =============================================================================
 * HOW TO TEST IN NOTEPAD:
 * 1. Implement your solution in the empty method below.
 * 2. Save the file.
 * 3. Open Command Prompt in this folder and compile & run:
 *       javac Q3_MediumHard.java
 *       java Q3_MediumHard
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

public class Q3_MediumHard {

    // =========================================================================
    // TODO: WRITE YOUR OPTIMAL LOGIC IN THIS METHOD
    // Target Complexity: O(N) Time, O(1) Space
    // =========================================================================
    public static TreeNode solveQ3(TreeNode root, TreeNode p, TreeNode q) {
        // >>> WRITE YOUR SOLUTION HERE <<<

        return null;
    }

    // =========================================================================
    // BUILT-IN TEST RUNNER (Executes automatically when you run this file)
    // =========================================================================
    public static void main(String[] args) {
        System.out.println("==================================================");
        System.out.println("INFOSYS EXAM PRACTICE: SET 07 - QUESTION 3");
        System.out.println("Q3 (Med-Hard – 12 Cases): Gateway Hierarchy Convergence (Lowest Common Ancestor)");
        System.out.println("==================================================");

        System.out.println("\n[SAMPLE DETAILS]");
        System.out.println("  Sample Input: None");

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
