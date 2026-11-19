/**
 * =============================================================================
 * INFOSYS SPECIALIST PROGRAMMER (SP) TOPIC-WISE ROADMAP
 * DAY 6 (23 Nov): Heaps & Priority Queues
 * DIFFICULTY: Medium | PROBLEM: Top K Frequent Elements
 * =============================================================================
 *
 * [PROBLEM DESCRIPTION]
 * Return the `k` most frequent elements in integer array `nums`.
 *
 * [CONSTRAINTS & HARDWARE TARGET]
 * 1 <= nums.length <= 10^5, k is valid.
 *
 * [SAMPLE INPUT / OUTPUT]
 * nums = [1,1,1,2,2,3], k = 2 | Expected: [1, 2]
 *
 * [INFOSYS EXAM WARNING / HARDWARE TRAP]
 * Frequency Map + Min-Heap of size K, or Bucket Sort in O(N) time.
 *
 * =============================================================================
 * HOW TO TEST IN NOTEPAD:
 * 1. Implement your solution in the empty method below.
 * 2. Save the file.
 * 3. Open Command Prompt in this folder and compile & run:
 *       javac Q2_Medium_TopKFrequentElements.java
 *       java Q2_Medium_TopKFrequentElements
 * =============================================================================
 */

import java.util.*;
import java.io.*;


public class Q2_Medium_TopKFrequentElements {

    // =========================================================================
    // TODO: WRITE YOUR OPTIMAL LOGIC IN THIS METHOD
    // Pure strict practice: Implement your solution from scratch.
    // =========================================================================
    public static int[] topKFrequent(int[] nums, int k) {
        // >>> WRITE YOUR SOLUTION HERE <<<

        return new int[0];
    }

    // =========================================================================
    // BUILT-IN TEST RUNNER (Executes automatically when you run this file)
    // =========================================================================
    public static void main(String[] args) {
        System.out.println("==================================================");
        System.out.println("DAY 6 (23 Nov): Heaps & Priority Queues");
        System.out.println("PROBLEM: Top K Frequent Elements [Medium]");
        System.out.println("==================================================");

        System.out.println("\n[SAMPLE DETAILS]");
        System.out.println("  nums = [1,1,1,2,2,3], k = 2 | Expected: [1, 2]");

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
