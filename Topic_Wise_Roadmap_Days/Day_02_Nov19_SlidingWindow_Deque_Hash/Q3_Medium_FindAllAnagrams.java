/**
 * =============================================================================
 * INFOSYS SPECIALIST PROGRAMMER (SP) TOPIC-WISE ROADMAP
 * DAY 2 (19 Nov): Sliding Window & Deque, Hash Tables
 * DIFFICULTY: Medium | PROBLEM: Find All Anagrams in a String
 * =============================================================================
 *
 * [PROBLEM DESCRIPTION]
 * Find all start indices of `p`'s anagrams in `s`.
 *
 * [CONSTRAINTS & HARDWARE TARGET]
 * 1 <= s.length(), p.length() <= 3 * 10^4.
 *
 * [SAMPLE INPUT / OUTPUT]
 * s = "cbaebabacd", p = "abc" | Expected: [0, 6]
 *
 * [INFOSYS EXAM WARNING / HARDWARE TRAP]
 * Maintain fixed-size sliding window of size p.length() with frequency counts.
 *
 * =============================================================================
 * HOW TO TEST IN NOTEPAD:
 * 1. Implement your solution in the empty method below.
 * 2. Save the file.
 * 3. Open Command Prompt in this folder and compile & run:
 *       javac Q3_Medium_FindAllAnagrams.java
 *       java Q3_Medium_FindAllAnagrams
 * =============================================================================
 */

import java.util.*;
import java.io.*;


public class Q3_Medium_FindAllAnagrams {

    // =========================================================================
    // TODO: WRITE YOUR OPTIMAL LOGIC IN THIS METHOD
    // Pure strict practice: Implement your solution from scratch.
    // =========================================================================
    public static List<Integer> findAnagrams(String s, String p) {
        // >>> WRITE YOUR SOLUTION HERE <<<

        return new ArrayList<>();
    }

    // =========================================================================
    // BUILT-IN TEST RUNNER (Executes automatically when you run this file)
    // =========================================================================
    public static void main(String[] args) {
        System.out.println("==================================================");
        System.out.println("DAY 2 (19 Nov): Sliding Window & Deque, Hash Tables");
        System.out.println("PROBLEM: Find All Anagrams in a String [Medium]");
        System.out.println("==================================================");

        System.out.println("\n[SAMPLE DETAILS]");
        System.out.println("  s = \"cbaebabacd\", p = \"abc\" | Expected: [0, 6]");

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
