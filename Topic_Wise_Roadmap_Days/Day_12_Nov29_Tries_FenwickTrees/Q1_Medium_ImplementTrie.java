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
 *       java -cp . Q1_Medium_ImplementTrie
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

    public static void insert(String word) {
        // >>> WRITE YOUR INSERT LOGIC HERE <<<
    }

    public static boolean startsWith(String prefix) {
        // >>> WRITE YOUR STARTSWITH LOGIC HERE <<<
        return false;
    }

    // =========================================================================
    // BUILT-IN AUTOMATED TEST RUNNER (Calls your method and verifies verdict)
    // =========================================================================
    public static void main(String[] args) {
        System.out.println("==================================================");
        System.out.println("DAY 12 (29 Nov): Tries & Fenwick Trees / BIT");
        System.out.println("PROBLEM: Implement Trie (Prefix Tree) [Medium]");
        System.out.println("==================================================");

        int passed = 0, total = 0;
        total++;
        insert("apple");
        boolean p1 = search("apple");
        boolean p2 = !search("app");
        boolean p3 = startsWith("app");
        insert("app");
        boolean p4 = search("app");
        boolean allPass = (p1 && p2 && p3 && p4);
        if (allPass) passed++;
        System.out.println("[TEST 1] Operations: insert('apple'), search('apple'), startsWith('app'), insert('app'), search('app')");
        System.out.println("         Expected: [true, false, true, true]");
        System.out.println("         Got:      [" + p1 + ", " + (!p2) + ", " + p3 + ", " + p4 + "]");
        System.out.println("         Verdict:  " + (allPass ? ">> PASS <<" : "!! FAIL !!"));
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
