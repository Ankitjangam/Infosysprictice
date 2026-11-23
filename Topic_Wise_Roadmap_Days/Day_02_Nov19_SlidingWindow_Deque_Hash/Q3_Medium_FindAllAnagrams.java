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
 *       java -cp . Q3_Medium_FindAllAnagrams
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
    // BUILT-IN AUTOMATED TEST RUNNER (Calls your method and verifies verdict)
    // =========================================================================
    public static void main(String[] args) {
        System.out.println("==================================================");
        System.out.println("DAY 2 (19 Nov): Sliding Window & Deque, Hash Tables");
        System.out.println("PROBLEM: Find All Anagrams in a String [Medium]");
        System.out.println("==================================================");

        int passed = 0, total = 0;
        total++;
        String s1 = "cbaebabacd", pStr1 = "abc"; List<Integer> exp1 = Arrays.asList(0, 6);
        List<Integer> got1 = findAnagrams(s1, pStr1);
        boolean p1 = Objects.equals(got1, exp1);
        if (p1) passed++;
        System.out.println("[TEST 1] s = \"" + s1 + "\", p = \"" + pStr1 + "\"");
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
