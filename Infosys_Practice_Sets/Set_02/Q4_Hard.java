/**
 * =============================================================================
 * INFOSYS SPECIALIST PROGRAMMER (SP) IN-PERSON CODING ASSESSMENT
 * SET 02 | QUESTION 4 &bull; Hard (12 Cases)
 * Q4 (Hard – 12 Cases): Optical Network Routing Peak (Binary Tree Maximum Path Sum)
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
 *       java Q4_Hard
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
    // TODO: IMPLEMENT YOUR OPTIMAL DATA STRUCTURE / SOLVER CLASS
    // Strict practice: Write your members, constructors, and algorithms from scratch.
    // =========================================================================
    class TreeSolver {
        // >>> WRITE YOUR FIELDS, CONSTRUCTORS & METHODS HERE <<<

    }

    // =========================================================================
    // BUILT-IN TEST RUNNER (Executes automatically when you run this file)
    // =========================================================================
    public static void main(String[] args) {
        System.out.println("==================================================");
        System.out.println("INFOSYS EXAM PRACTICE: SET 02 - QUESTION 4");
        System.out.println("Q4 (Hard – 12 Cases): Optical Network Routing Peak (Binary Tree Maximum Path Sum)");
        System.out.println("==================================================");

        System.out.println("\n[SAMPLE DETAILS]");
        System.out.println("  root = [-10,9,20,null,null,15,7] | Sample Output: 42");

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
