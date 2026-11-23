/**
 * =============================================================================
 * INFOSYS SPECIALIST PROGRAMMER (SP) TOPIC-WISE ROADMAP
 * DAY 2 (19 Nov): Sliding Window & Deque, Hash Tables
 * DIFFICULTY: Medium | PROBLEM: Longest Substring Without Repeating Characters
 * =============================================================================
 *
 * [PROBLEM DESCRIPTION]
 * Find length of longest substring without repeating characters.
 *
 * [CONSTRAINTS & HARDWARE TARGET]
 * 0 <= s.length() <= 10^5, s consists of English letters, digits, symbols and spaces.
 *
 * [SAMPLE INPUT / OUTPUT]
 * s = "abcabcbb" | Expected: 3
 *
 * [INFOSYS EXAM WARNING / HARDWARE TRAP]
 * Use int[128] lastSeen array. If duplicate seen, slide left = Math.max(left, lastSeen[c] + 1).
 *
 * =============================================================================
 * HOW TO TEST IN NOTEPAD:
 * 1. Implement your solution in the empty method below.
 * 2. Save the file.
 * 3. Open Command Prompt in this folder and compile & run:
 *       javac Q2_Medium_LongestSubstringWithoutRepeating.java
 *       java -cp . Q2_Medium_LongestSubstringWithoutRepeating
 * =============================================================================
 */

import java.util.*;
import java.io.*;


public class Q2_Medium_LongestSubstringWithoutRepeating {

    // =========================================================================
    // TODO: WRITE YOUR OPTIMAL LOGIC IN THIS METHOD
    // Pure strict practice: Implement your solution from scratch.
    // =========================================================================
    public static int lengthOfLongestSubstring(String s) {
        // >>> WRITE YOUR SOLUTION HERE <<<

        return 0;
    }

    // =========================================================================
    // BUILT-IN AUTOMATED TEST RUNNER (Calls your method and verifies verdict)
    // =========================================================================
    public static void main(String[] args) {
        System.out.println("==================================================");
        System.out.println("DAY 2 (19 Nov): Sliding Window & Deque, Hash Tables");
        System.out.println("PROBLEM: Longest Substring Without Repeating Characters [Medium]");
        System.out.println("==================================================");

        int passed = 0, total = 0;
        total++;
        String s1 = "abcabcbb"; int exp1 = 3;
        int got1 = lengthOfLongestSubstring(s1);
        boolean p1 = (got1 == exp1);
        if (p1) passed++;
        System.out.println("[TEST 1] In: \"" + s1 + "\"");
        System.out.println("         Expected: " + exp1 + " | Got: " + got1);
        System.out.println("         Verdict:  " + (p1 ? ">> PASS <<" : "!! FAIL !!"));
        total++;
        String s2 = "bbbbb"; int exp2 = 1;
        int got2 = lengthOfLongestSubstring(s2);
        boolean p2 = (got2 == exp2);
        if (p2) passed++;
        System.out.println("[TEST 2] In: \"" + s2 + "\"");
        System.out.println("         Expected: " + exp2 + " | Got: " + got2);
        System.out.println("         Verdict:  " + (p2 ? ">> PASS <<" : "!! FAIL !!"));
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
