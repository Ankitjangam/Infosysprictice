/**
 * =============================================================================
 * INFOSYS SPECIALIST PROGRAMMER (SP) IN-PERSON CODING ASSESSMENT
 * SET 14 | QUESTION 4 &bull; Hard (12 Cases)
 * Q4 (Hard - 12 Cases): Enterprise Prefix Autocomplete (Implement Trie Engine)
 * =============================================================================
 *
 * [PROBLEM DESCRIPTION]
 * Implement a prefix tree supporting insert(word), search(word), and startsWith(prefix) in $O(L)$ time.
 *
 * [CONSTRAINTS]
 * Standard exam constraints.
 *
 * [SAMPLE INPUT / OUTPUT]
 * Standard sample cases.
 *
 * [INFOSYS EXAM WARNING / HARDWARE TRAP]
 * Watch for boundary and 32-bit integer overflow traps.
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


public class Q4_Hard {

    // =========================================================================
    // TODO: WRITE YOUR OPTIMAL LOGIC IN THIS METHOD
    // Pure strict practice: Implement your solution from scratch.
    // =========================================================================
    public static class TrieEngine {
        // >>> WRITE YOUR FIELDS & CONSTRUCTORS HERE <<<
        public void insert(String word) {}
        public boolean search(String word) { return false; }
        public boolean startsWith(String prefix) { return false; }
    }

    // =========================================================================
    // BUILT-IN AUTOMATED TEST RUNNER (Calls your method and verifies verdict)
    // =========================================================================
    public static void main(String[] args) {
        System.out.println("==================================================");
        System.out.println("INFOSYS EXAM PRACTICE: SET 14 - QUESTION 4");
        System.out.println("Q4 (Hard - 12 Cases): Enterprise Prefix Autocomplete (Implement Trie Engine)");
        System.out.println("==================================================");
        int passed = 0, total = 0; total++;
        TrieEngine trie = new TrieEngine();
        trie.insert("apple");
        boolean s1 = trie.search("apple");
        boolean s2 = !trie.search("app");
        boolean sw = trie.startsWith("app");
        boolean allPass = (s1 && s2 && sw); if (allPass) passed++;
        System.out.println("[TEST 1] Trie: insert('apple'), search('apple'), startsWith('app')");
        System.out.println("         Expected: [true, false, true]");
        System.out.println("         Got:      [" + s1 + ", " + (!s2) + ", " + sw + "]");
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
