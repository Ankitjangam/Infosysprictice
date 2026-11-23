/**
 * =============================================================================
 * INFOSYS SPECIALIST PROGRAMMER (SP) IN-PERSON CODING ASSESSMENT
 * SET 02 | QUESTION 4 &bull; Hard (12 Cases)
 * Q4 (Hard - 12 Cases): Optical Network Routing Peak (Binary Tree Maximum Path Sum)
 * =============================================================================
 *
 * [PROBLEM DESCRIPTION]
 * Find maximum path sum connecting any two nodes in a binary tree with signed node weights.
 *
 * [CONSTRAINTS]
 * $1 \le N \le 3	imes 10^4$, $-1000 \le node.val \le 1000$.
 *
 * [SAMPLE INPUT / OUTPUT]
 * root = [-10,9,20,null,null,15,7] | Sample Output: 42
 *
 * [INFOSYS EXAM WARNING / HARDWARE TRAP]
 * Infosys Trap: Initializing `maxPath = 0` fails if all tree nodes are negative. Initialize to `Long.MIN_VALUE`.
 *
 * =============================================================================
 * HOW TO TEST IN NOTEPAD:
 * 1. Implement your solution in the empty method below.
 * 2. Save the file.
 * 3. Open Command Prompt in this folder and compile & run:
 *       javac Q4_Hard.java
 *       java -cp . Q4_Hard
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

public class Q4_Hard {

    // =========================================================================
    // TODO: WRITE YOUR OPTIMAL LOGIC IN THIS METHOD
    // Pure strict practice: Implement your solution from scratch.
    // =========================================================================
public static int solveQ4(TreeNode root) {
        // >>> WRITE YOUR SOLUTION HERE <<<
        return 0;
    }

    // =========================================================================
    // BUILT-IN AUTOMATED TEST RUNNER (Calls your method and verifies verdict)
    // =========================================================================
    public static void main(String[] args) {
        System.out.println("==================================================");
        System.out.println("INFOSYS EXAM PRACTICE: SET 02 - QUESTION 4");
        System.out.println("Q4 (Hard - 12 Cases): Optical Network Routing Peak (Binary Tree Maximum Path Sum)");
        System.out.println("==================================================");
        int passed = 0, total = 0;
        total++;
        TreeNode root = new TreeNode(-10);
        root.left = new TreeNode(9); root.right = new TreeNode(20);
        root.right.left = new TreeNode(15); root.right.right = new TreeNode(7);
        int got1 = solveQ4(root); int exp1 = 42;
        boolean p1 = (got1 == exp1); if (p1) passed++;
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
