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
 *       java Q2_Medium_LongestSubstringWithoutRepeating
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
    // BUILT-IN TEST RUNNER (Executes automatically when you run this file)
    // =========================================================================
    public static void main(String[] args) {
        System.out.println("==================================================");
        System.out.println("DAY 2 (19 Nov): Sliding Window & Deque, Hash Tables");
        System.out.println("PROBLEM: Longest Substring Without Repeating Characters [Medium]");
        System.out.println("==================================================");

        System.out.println("\n[SAMPLE DETAILS]");
        System.out.println("  s = \"abcabcbb\" | Expected: 3");

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
