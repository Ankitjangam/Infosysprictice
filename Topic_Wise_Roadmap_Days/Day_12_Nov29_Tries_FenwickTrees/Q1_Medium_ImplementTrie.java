/**
 * =============================================================================
 * INFOSYS SPECIALIST PROGRAMMER (SP) TOPIC-WISE ROADMAP
 * DAY 12 (29 Nov): Tries & Fenwick Trees / BIT
 * DIFFICULTY: Medium | PROBLEM: Implement Trie (Prefix Tree)
 * =============================================================================
 *
 * [PROBLEM DESCRIPTION]
 * Implement a trie with insert, search, and startsWith methods.
 *
 * [CONSTRAINTS & HARDWARE TARGET]
 * 1 <= word.length, prefix.length <= 2000, lowercase English letters.
 *
 * [SAMPLE INPUT / OUTPUT]
 * insert("apple"), search("apple") -> true, startsWith("app") -> true
 *
 * [INFOSYS EXAM WARNING / HARDWARE TRAP]
 * Array-based children: Node[] ch = new Node[26], boolean isEnd.
 *
 * =============================================================================
 * HOW TO TEST IN NOTEPAD:
 * 1. Implement your solution in the empty method below.
 * 2. Save the file.
 * 3. Open Command Prompt in this folder and compile & run:
 *       javac Q1_Medium_ImplementTrie.java
 *       java Q1_Medium_ImplementTrie
 * =============================================================================
 */

import java.util.*;
import java.io.*;


public class Q1_Medium_ImplementTrie {

    // =========================================================================
    // TODO: WRITE YOUR OPTIMAL LOGIC IN THIS METHOD
    // Pure strict practice: Implement your solution from scratch.
    // =========================================================================
    public static boolean search(String word) {
        // >>> WRITE YOUR SOLUTION HERE <<<

        return false;
    }

    // =========================================================================
    // BUILT-IN TEST RUNNER (Executes automatically when you run this file)
    // =========================================================================
    public static void main(String[] args) {
        System.out.println("==================================================");
        System.out.println("DAY 12 (29 Nov): Tries & Fenwick Trees / BIT");
        System.out.println("PROBLEM: Implement Trie (Prefix Tree) [Medium]");
        System.out.println("==================================================");

        System.out.println("\n[SAMPLE DETAILS]");
        System.out.println("  insert(\"apple\"), search(\"apple\") -> true, startsWith(\"app\") -> true");

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
